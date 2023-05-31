package com.adjust.sdk;

import android.content.Context;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.adjust.sdk.scheduler.TimerOnce;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;

public class InstallReferrer implements InvocationHandler {
    private static final String PACKAGE_BASE_NAME = "com.android.installreferrer.";
    private static final int STATUS_DEVELOPER_ERROR = 3;
    private static final int STATUS_FEATURE_NOT_SUPPORTED = 2;
    private static final int STATUS_OK = 0;
    private static final int STATUS_SERVICE_DISCONNECTED = -1;
    private static final int STATUS_SERVICE_UNAVAILABLE = 1;
    private Context context;
    private final AtomicBoolean hasInstallReferrerBeenRead;
    private ILogger logger = AdjustFactory.getLogger();
    private Object playInstallReferrer;
    private final InstallReferrerReadListener referrerCallback;
    private Object referrerClient;
    private int retries;
    private TimerOnce retryTimer;
    private int retryWaitTime = PathInterpolatorCompat.MAX_NUM_POINTS;

    public InstallReferrer(Context context2, InstallReferrerReadListener installReferrerReadListener) {
        this.playInstallReferrer = createInstallReferrer(context2, installReferrerReadListener, this.logger);
        this.context = context2;
        this.hasInstallReferrerBeenRead = new AtomicBoolean(false);
        this.retries = 0;
        this.retryTimer = new TimerOnce(new Runnable() {
            public void run() {
                InstallReferrer.this.startConnection();
            }
        }, "InstallReferrer");
        this.referrerCallback = installReferrerReadListener;
    }

    private Object createInstallReferrer(Context context2, InstallReferrerReadListener installReferrerReadListener, ILogger iLogger) {
        return Reflection.createInstance("com.adjust.sdk.play.InstallReferrer", new Class[]{Context.class, InstallReferrerReadListener.class, ILogger.class}, context2, installReferrerReadListener, iLogger);
    }

    public void startConnection() {
        Class installReferrerStateListenerClass;
        Object createProxyInstallReferrerStateListener;
        Object obj = this.playInstallReferrer;
        if (obj != null) {
            try {
                Reflection.invokeInstanceMethod(obj, "startConnection", (Class[]) null, new Object[0]);
                return;
            } catch (Exception e) {
                this.logger.error("Call to Play startConnection error: %s", e.getMessage());
            }
        }
        if (AdjustFactory.getTryInstallReferrer()) {
            closeReferrerClient();
            if (this.hasInstallReferrerBeenRead.get()) {
                this.logger.debug("Install referrer has already been read", new Object[0]);
                return;
            }
            Context context2 = this.context;
            if (context2 != null) {
                this.referrerClient = createInstallReferrerClient(context2);
                if (this.referrerClient != null && (installReferrerStateListenerClass = getInstallReferrerStateListenerClass()) != null && (createProxyInstallReferrerStateListener = createProxyInstallReferrerStateListener(installReferrerStateListenerClass)) != null) {
                    startConnection(installReferrerStateListenerClass, createProxyInstallReferrerStateListener);
                }
            }
        }
    }

    private Object createInstallReferrerClient(Context context2) {
        try {
            return Reflection.invokeInstanceMethod(Reflection.invokeStaticMethod("com.android.installreferrer.api.InstallReferrerClient", "newBuilder", new Class[]{Context.class}, context2), "build", (Class[]) null, new Object[0]);
        } catch (ClassNotFoundException e) {
            this.logger.warn("InstallReferrer not integrated in project (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        } catch (Exception e2) {
            this.logger.error("createInstallReferrerClient error (%s) from (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            return null;
        }
    }

    private Class getInstallReferrerStateListenerClass() {
        try {
            return Class.forName("com.android.installreferrer.api.InstallReferrerStateListener");
        } catch (Exception e) {
            this.logger.error("getInstallReferrerStateListenerClass error (%s) from (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        }
    }

    private Object createProxyInstallReferrerStateListener(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (IllegalArgumentException unused) {
            this.logger.error("InstallReferrer proxy violating parameter restrictions", new Object[0]);
            return null;
        } catch (NullPointerException unused2) {
            this.logger.error("Null argument passed to InstallReferrer proxy", new Object[0]);
            return null;
        }
    }

    private void startConnection(Class cls, Object obj) {
        try {
            Reflection.invokeInstanceMethod(this.referrerClient, "startConnection", new Class[]{cls}, obj);
        } catch (InvocationTargetException e) {
            if (Util.hasRootCause(e)) {
                this.logger.error("InstallReferrer encountered an InvocationTargetException %s", Util.getRootCause(e));
            }
        } catch (Exception e2) {
            this.logger.error("startConnection error (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
        }
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method == null) {
            this.logger.error("InstallReferrer invoke method null", new Object[0]);
            return null;
        }
        String name = method.getName();
        if (name == null) {
            this.logger.error("InstallReferrer invoke method name null", new Object[0]);
            return null;
        }
        this.logger.debug("InstallReferrer invoke method name: %s", name);
        if (objArr == null) {
            this.logger.warn("InstallReferrer invoke args null", new Object[0]);
            objArr = new Object[0];
        }
        for (Object obj2 : objArr) {
            this.logger.debug("InstallReferrer invoke arg: %s", obj2);
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                this.logger.error("InstallReferrer invoke onInstallReferrerSetupFinished args lenght not 1: %d", Integer.valueOf(objArr.length));
                return null;
            }
            Object obj3 = objArr[0];
            if (!(obj3 instanceof Integer)) {
                this.logger.error("InstallReferrer invoke onInstallReferrerSetupFinished arg not int", new Object[0]);
                return null;
            }
            Integer num = (Integer) obj3;
            if (num == null) {
                this.logger.error("InstallReferrer invoke onInstallReferrerSetupFinished responseCode arg is null", new Object[0]);
                return null;
            }
            onInstallReferrerSetupFinishedInt(num.intValue());
        } else if (name.equals("onInstallReferrerServiceDisconnected")) {
            this.logger.debug("Connection to install referrer service was lost. Retrying ...", new Object[0]);
            retry();
        }
        return null;
    }

    private void onInstallReferrerSetupFinishedInt(int i) {
        boolean z = true;
        if (i != -1) {
            if (i == 0) {
                try {
                    Object installReferrer = getInstallReferrer();
                    String stringInstallReferrer = getStringInstallReferrer(installReferrer);
                    long referrerClickTimestampSeconds = getReferrerClickTimestampSeconds(installReferrer);
                    long installBeginTimestampSeconds = getInstallBeginTimestampSeconds(installReferrer);
                    this.logger.debug("installReferrer: %s, clickTime: %d, installBeginTime: %d", stringInstallReferrer, Long.valueOf(referrerClickTimestampSeconds), Long.valueOf(installBeginTimestampSeconds));
                    this.logger.debug("Install Referrer read successfully. Closing connection", new Object[0]);
                    this.referrerCallback.onInstallReferrerRead(stringInstallReferrer, referrerClickTimestampSeconds, installBeginTimestampSeconds);
                    this.hasInstallReferrerBeenRead.set(true);
                } catch (Exception e) {
                    this.logger.warn("Couldn't get install referrer from client (%s). Retrying...", e.getMessage());
                }
            } else if (i == 1) {
                this.logger.debug("Could not initiate connection to the Install Referrer service. Retrying...", new Object[0]);
            } else if (i == 2) {
                this.logger.debug("Install Referrer API not supported by the installed Play Store app. Closing connection", new Object[0]);
            } else if (i != 3) {
                this.logger.debug("Unexpected response code of install referrer response: %d. Closing connection", Integer.valueOf(i));
            } else {
                this.logger.debug("Install Referrer API general errors caused by incorrect usage. Retrying...", new Object[0]);
            }
            z = false;
        } else {
            this.logger.debug("Play Store service is not connected now. Retrying...", new Object[0]);
        }
        if (z) {
            retry();
        } else {
            closeReferrerClient();
        }
    }

    private Object getInstallReferrer() {
        Object obj = this.referrerClient;
        if (obj == null) {
            return null;
        }
        try {
            return Reflection.invokeInstanceMethod(obj, "getInstallReferrer", (Class[]) null, new Object[0]);
        } catch (Exception e) {
            this.logger.error("getInstallReferrer error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        }
    }

    private String getStringInstallReferrer(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (String) Reflection.invokeInstanceMethod(obj, "getInstallReferrer", (Class[]) null, new Object[0]);
        } catch (Exception e) {
            this.logger.error("getStringInstallReferrer error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        }
    }

    private long getReferrerClickTimestampSeconds(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            return ((Long) Reflection.invokeInstanceMethod(obj, "getReferrerClickTimestampSeconds", (Class[]) null, new Object[0])).longValue();
        } catch (Exception e) {
            this.logger.error("getReferrerClickTimestampSeconds error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return -1;
        }
    }

    private long getInstallBeginTimestampSeconds(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            return ((Long) Reflection.invokeInstanceMethod(obj, "getInstallBeginTimestampSeconds", (Class[]) null, new Object[0])).longValue();
        } catch (Exception e) {
            this.logger.error("getInstallBeginTimestampSeconds error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return -1;
        }
    }

    private void retry() {
        if (this.hasInstallReferrerBeenRead.get()) {
            this.logger.debug("Install referrer has already been read", new Object[0]);
            closeReferrerClient();
        } else if (this.retries + 1 > 2) {
            this.logger.debug("Limit number of retry of %d for install referrer surpassed", 2);
        } else {
            long fireIn = this.retryTimer.getFireIn();
            if (fireIn > 0) {
                this.logger.debug("Already waiting to retry to read install referrer in %d milliseconds", Long.valueOf(fireIn));
                return;
            }
            this.retries++;
            this.logger.debug("Retry number %d to connect to install referrer API", Integer.valueOf(this.retries));
            this.retryTimer.startIn((long) this.retryWaitTime);
        }
    }

    private void closeReferrerClient() {
        Object obj = this.referrerClient;
        if (obj != null) {
            try {
                Reflection.invokeInstanceMethod(obj, "endConnection", (Class[]) null, new Object[0]);
                this.logger.debug("Install Referrer API connection closed", new Object[0]);
            } catch (Exception e) {
                this.logger.error("closeReferrerClient error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            }
            this.referrerClient = null;
        }
    }
}
