package com.adjust.sdk;

import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.SocketTimeoutException;

public class RequestHandler implements IRequestHandler {
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private String basePath;
    private ThreadExecutor executor = new SingleThreadCachedScheduler("RequestHandler");
    private String gdprPath;
    private ILogger logger = AdjustFactory.getLogger();
    private WeakReference<IPackageHandler> packageHandlerWeakRef;

    public RequestHandler(IActivityHandler iActivityHandler, IPackageHandler iPackageHandler) {
        init(iActivityHandler, iPackageHandler);
        this.basePath = iPackageHandler.getBasePath();
        this.gdprPath = iPackageHandler.getGdprPath();
    }

    public void init(IActivityHandler iActivityHandler, IPackageHandler iPackageHandler) {
        this.packageHandlerWeakRef = new WeakReference<>(iPackageHandler);
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
    }

    public void sendPackage(final ActivityPackage activityPackage, final int i) {
        this.executor.submit(new Runnable() {
            public void run() {
                RequestHandler.this.sendI(activityPackage, i);
            }
        });
    }

    public void teardown() {
        this.logger.verbose("RequestHandler teardown", new Object[0]);
        ThreadExecutor threadExecutor = this.executor;
        if (threadExecutor != null) {
            threadExecutor.teardown();
        }
        WeakReference<IPackageHandler> weakReference = this.packageHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference<IActivityHandler> weakReference2 = this.activityHandlerWeakRef;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.executor = null;
        this.packageHandlerWeakRef = null;
        this.activityHandlerWeakRef = null;
        this.logger = null;
    }

    /* access modifiers changed from: private */
    public void sendI(ActivityPackage activityPackage, int i) {
        String str;
        IActivityHandler iActivityHandler;
        if (activityPackage.getActivityKind() != ActivityKind.GDPR) {
            str = AdjustFactory.getBaseUrl();
            if (this.basePath != null) {
                str = str + this.basePath;
            }
        } else {
            str = AdjustFactory.getGdprUrl();
            if (this.gdprPath != null) {
                str = str + this.gdprPath;
            }
        }
        try {
            ResponseData createPOSTHttpsURLConnection = UtilNetworking.createPOSTHttpsURLConnection(str + activityPackage.getPath(), activityPackage, i);
            IPackageHandler iPackageHandler = (IPackageHandler) this.packageHandlerWeakRef.get();
            if (iPackageHandler != null && (iActivityHandler = (IActivityHandler) this.activityHandlerWeakRef.get()) != null) {
                if (createPOSTHttpsURLConnection.trackingState == TrackingState.OPTED_OUT) {
                    iActivityHandler.gotOptOutResponse();
                } else if (createPOSTHttpsURLConnection.jsonResponse == null) {
                    iPackageHandler.closeFirstPackage(createPOSTHttpsURLConnection, activityPackage);
                } else {
                    iPackageHandler.sendNextPackage(createPOSTHttpsURLConnection);
                }
            }
        } catch (UnsupportedEncodingException e) {
            sendNextPackageI(activityPackage, "Failed to encode parameters", e);
        } catch (SocketTimeoutException e2) {
            closePackageI(activityPackage, "Request timed out", e2);
        } catch (IOException e3) {
            closePackageI(activityPackage, "Request failed", e3);
        } catch (Throwable th) {
            sendNextPackageI(activityPackage, "Runtime exception", th);
        }
    }

    private void closePackageI(ActivityPackage activityPackage, String str, Throwable th) {
        String formatString = Util.formatString("%s. (%s) Will retry later", activityPackage.getFailureMessage(), Util.getReasonString(str, th));
        this.logger.error(formatString, new Object[0]);
        ResponseData buildResponseData = ResponseData.buildResponseData(activityPackage);
        buildResponseData.message = formatString;
        IPackageHandler iPackageHandler = (IPackageHandler) this.packageHandlerWeakRef.get();
        if (iPackageHandler != null) {
            iPackageHandler.closeFirstPackage(buildResponseData, activityPackage);
        }
    }

    private void sendNextPackageI(ActivityPackage activityPackage, String str, Throwable th) {
        String formatString = Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th));
        this.logger.error(formatString, new Object[0]);
        ResponseData buildResponseData = ResponseData.buildResponseData(activityPackage);
        buildResponseData.message = formatString;
        IPackageHandler iPackageHandler = (IPackageHandler) this.packageHandlerWeakRef.get();
        if (iPackageHandler != null) {
            iPackageHandler.sendNextPackage(buildResponseData);
        }
    }
}
