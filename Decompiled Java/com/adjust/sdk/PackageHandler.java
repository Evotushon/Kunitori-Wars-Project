package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class PackageHandler implements IPackageHandler {
    private static final String PACKAGE_QUEUE_FILENAME = "AdjustIoPackageQueue";
    private static final String PACKAGE_QUEUE_NAME = "Package queue";
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private BackoffStrategy backoffStrategy = AdjustFactory.getPackageHandlerBackoffStrategy();
    private String basePath;
    private Context context;
    private String gdprPath;
    /* access modifiers changed from: private */
    public AtomicBoolean isSending;
    /* access modifiers changed from: private */
    public ILogger logger = AdjustFactory.getLogger();
    private List<ActivityPackage> packageQueue;
    private boolean paused;
    private IRequestHandler requestHandler;
    private ThreadScheduler scheduler = new SingleThreadCachedScheduler("PackageHandler");

    public void teardown() {
        this.logger.verbose("PackageHandler teardown", new Object[0]);
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        IRequestHandler iRequestHandler = this.requestHandler;
        if (iRequestHandler != null) {
            iRequestHandler.teardown();
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        this.scheduler = null;
        this.requestHandler = null;
        this.activityHandlerWeakRef = null;
        this.packageQueue = null;
        this.isSending = null;
        this.context = null;
        this.logger = null;
        this.backoffStrategy = null;
    }

    static void deleteState(Context context2) {
        deletePackageQueue(context2);
    }

    public PackageHandler(IActivityHandler iActivityHandler, Context context2, boolean z) {
        init(iActivityHandler, context2, z);
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.initI();
            }
        });
    }

    public void init(IActivityHandler iActivityHandler, Context context2, boolean z) {
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.context = context2;
        this.paused = !z;
        this.basePath = iActivityHandler.getBasePath();
        this.gdprPath = iActivityHandler.getGdprPath();
    }

    public void addPackage(final ActivityPackage activityPackage) {
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.addI(activityPackage);
            }
        });
    }

    public void sendFirstPackage() {
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.sendFirstI();
            }
        });
    }

    public void sendNextPackage(ResponseData responseData) {
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.sendNextI();
            }
        });
        IActivityHandler iActivityHandler = (IActivityHandler) this.activityHandlerWeakRef.get();
        if (iActivityHandler != null) {
            iActivityHandler.finishedTrackingActivity(responseData);
        }
    }

    public void closeFirstPackage(ResponseData responseData, ActivityPackage activityPackage) {
        responseData.willRetry = true;
        IActivityHandler iActivityHandler = (IActivityHandler) this.activityHandlerWeakRef.get();
        if (iActivityHandler != null) {
            iActivityHandler.finishedTrackingActivity(responseData);
        }
        AnonymousClass5 r8 = new Runnable() {
            public void run() {
                PackageHandler.this.logger.verbose("Package handler can send", new Object[0]);
                PackageHandler.this.isSending.set(false);
                PackageHandler.this.sendFirstPackage();
            }
        };
        if (activityPackage == null) {
            r8.run();
            return;
        }
        int increaseRetries = activityPackage.increaseRetries();
        long waitingTime = Util.getWaitingTime(increaseRetries, this.backoffStrategy);
        double d = (double) waitingTime;
        Double.isNaN(d);
        String format = Util.SecondsDisplayFormat.format(d / 1000.0d);
        this.logger.verbose("Waiting for %s seconds before retrying the %d time", format, Integer.valueOf(increaseRetries));
        this.scheduler.schedule(r8, waitingTime);
    }

    public void pauseSending() {
        this.paused = true;
    }

    public void resumeSending() {
        this.paused = false;
    }

    public void updatePackages(SessionParameters sessionParameters) {
        final SessionParameters deepCopy = sessionParameters != null ? sessionParameters.deepCopy() : null;
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.updatePackagesI(deepCopy);
            }
        });
    }

    public void flush() {
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.flushI();
            }
        });
    }

    public String getBasePath() {
        return this.basePath;
    }

    public String getGdprPath() {
        return this.gdprPath;
    }

    /* access modifiers changed from: private */
    public void initI() {
        this.requestHandler = AdjustFactory.getRequestHandler((IActivityHandler) this.activityHandlerWeakRef.get(), this);
        this.isSending = new AtomicBoolean();
        readPackageQueueI();
    }

    /* access modifiers changed from: private */
    public void addI(ActivityPackage activityPackage) {
        this.packageQueue.add(activityPackage);
        this.logger.debug("Added package %d (%s)", Integer.valueOf(this.packageQueue.size()), activityPackage);
        this.logger.verbose("%s", activityPackage.getExtendedString());
        writePackageQueueI();
    }

    /* access modifiers changed from: private */
    public void sendFirstI() {
        if (!this.packageQueue.isEmpty()) {
            if (this.paused) {
                this.logger.debug("Package handler is paused", new Object[0]);
            } else if (this.isSending.getAndSet(true)) {
                this.logger.verbose("Package handler is already sending", new Object[0]);
            } else {
                this.requestHandler.sendPackage(this.packageQueue.get(0), this.packageQueue.size() - 1);
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendNextI() {
        if (!this.packageQueue.isEmpty()) {
            this.packageQueue.remove(0);
            writePackageQueueI();
            this.isSending.set(false);
            this.logger.verbose("Package handler can send", new Object[0]);
            sendFirstI();
        }
    }

    public void updatePackagesI(SessionParameters sessionParameters) {
        if (sessionParameters != null) {
            this.logger.debug("Updating package handler queue", new Object[0]);
            this.logger.verbose("Session callback parameters: %s", sessionParameters.callbackParameters);
            this.logger.verbose("Session partner parameters: %s", sessionParameters.partnerParameters);
            for (ActivityPackage next : this.packageQueue) {
                Map<String, String> parameters = next.getParameters();
                PackageBuilder.addMapJson(parameters, Constants.CALLBACK_PARAMETERS, Util.mergeParameters(sessionParameters.callbackParameters, next.getCallbackParameters(), "Callback"));
                PackageBuilder.addMapJson(parameters, Constants.PARTNER_PARAMETERS, Util.mergeParameters(sessionParameters.partnerParameters, next.getPartnerParameters(), "Partner"));
            }
            writePackageQueueI();
        }
    }

    /* access modifiers changed from: private */
    public void flushI() {
        this.packageQueue.clear();
        writePackageQueueI();
    }

    private void readPackageQueueI() {
        try {
            this.packageQueue = (List) Util.readObject(this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME, List.class);
        } catch (Exception e) {
            this.logger.error("Failed to read %s file (%s)", PACKAGE_QUEUE_NAME, e.getMessage());
            this.packageQueue = null;
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            this.logger.debug("Package handler read %d packages", Integer.valueOf(list.size()));
            return;
        }
        this.packageQueue = new ArrayList();
    }

    private void writePackageQueueI() {
        Util.writeObject(this.packageQueue, this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME);
        this.logger.debug("Package handler wrote %d packages", Integer.valueOf(this.packageQueue.size()));
    }

    public static Boolean deletePackageQueue(Context context2) {
        return Boolean.valueOf(context2.deleteFile(PACKAGE_QUEUE_FILENAME));
    }
}
