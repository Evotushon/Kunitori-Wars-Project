package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.UtilNetworking;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class AdjustFactory {
    private static IActivityHandler activityHandler = null;
    private static IAttributionHandler attributionHandler = null;
    private static String baseUrl = "https://app.adjust.com";
    private static UtilNetworking.IConnectionOptions connectionOptions = null;
    private static String gdprUrl = "https://gdpr.adjust.com";
    private static HttpsURLConnection httpsURLConnection = null;
    private static ILogger logger = null;
    private static long maxDelayStart = -1;
    private static IPackageHandler packageHandler = null;
    private static BackoffStrategy packageHandlerBackoffStrategy = null;
    private static IRequestHandler requestHandler = null;
    private static BackoffStrategy sdkClickBackoffStrategy = null;
    private static ISdkClickHandler sdkClickHandler = null;
    private static long sessionInterval = -1;
    private static long subsessionInterval = -1;
    private static long timerInterval = -1;
    private static long timerStart = -1;
    private static boolean tryInstallReferrer = true;

    public static class URLGetConnection {
        HttpsURLConnection httpsURLConnection;
        URL url;

        URLGetConnection(HttpsURLConnection httpsURLConnection2, URL url2) {
            this.httpsURLConnection = httpsURLConnection2;
            this.url = url2;
        }
    }

    public static IPackageHandler getPackageHandler(IActivityHandler iActivityHandler, Context context, boolean z) {
        IPackageHandler iPackageHandler = packageHandler;
        if (iPackageHandler == null) {
            return new PackageHandler(iActivityHandler, context, z);
        }
        iPackageHandler.init(iActivityHandler, context, z);
        return packageHandler;
    }

    public static IRequestHandler getRequestHandler(IActivityHandler iActivityHandler, IPackageHandler iPackageHandler) {
        IRequestHandler iRequestHandler = requestHandler;
        if (iRequestHandler == null) {
            return new RequestHandler(iActivityHandler, iPackageHandler);
        }
        iRequestHandler.init(iActivityHandler, iPackageHandler);
        return requestHandler;
    }

    public static ILogger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public static long getTimerInterval() {
        long j = timerInterval;
        if (j == -1) {
            return 60000;
        }
        return j;
    }

    public static long getTimerStart() {
        long j = timerStart;
        if (j == -1) {
            return 60000;
        }
        return j;
    }

    public static long getSessionInterval() {
        long j = sessionInterval;
        if (j == -1) {
            return 1800000;
        }
        return j;
    }

    public static long getSubsessionInterval() {
        long j = subsessionInterval;
        if (j == -1) {
            return 1000;
        }
        return j;
    }

    public static BackoffStrategy getSdkClickBackoffStrategy() {
        BackoffStrategy backoffStrategy = sdkClickBackoffStrategy;
        return backoffStrategy == null ? BackoffStrategy.SHORT_WAIT : backoffStrategy;
    }

    public static BackoffStrategy getPackageHandlerBackoffStrategy() {
        BackoffStrategy backoffStrategy = packageHandlerBackoffStrategy;
        return backoffStrategy == null ? BackoffStrategy.LONG_WAIT : backoffStrategy;
    }

    public static IActivityHandler getActivityHandler(AdjustConfig adjustConfig) {
        IActivityHandler iActivityHandler = activityHandler;
        if (iActivityHandler == null) {
            return ActivityHandler.getInstance(adjustConfig);
        }
        iActivityHandler.init(adjustConfig);
        return activityHandler;
    }

    public static IAttributionHandler getAttributionHandler(IActivityHandler iActivityHandler, boolean z) {
        IAttributionHandler iAttributionHandler = attributionHandler;
        if (iAttributionHandler == null) {
            return new AttributionHandler(iActivityHandler, z);
        }
        iAttributionHandler.init(iActivityHandler, z);
        return attributionHandler;
    }

    public static HttpsURLConnection getHttpsURLConnection(URL url) throws IOException {
        HttpsURLConnection httpsURLConnection2 = httpsURLConnection;
        return httpsURLConnection2 == null ? (HttpsURLConnection) url.openConnection() : httpsURLConnection2;
    }

    public static ISdkClickHandler getSdkClickHandler(IActivityHandler iActivityHandler, boolean z) {
        ISdkClickHandler iSdkClickHandler = sdkClickHandler;
        if (iSdkClickHandler == null) {
            return new SdkClickHandler(iActivityHandler, z);
        }
        iSdkClickHandler.init(iActivityHandler, z);
        return sdkClickHandler;
    }

    public static long getMaxDelayStart() {
        long j = maxDelayStart;
        if (j == -1) {
            return 10000;
        }
        return j;
    }

    public static String getBaseUrl() {
        String str = baseUrl;
        return str == null ? Constants.BASE_URL : str;
    }

    public static String getGdprUrl() {
        String str = gdprUrl;
        return str == null ? Constants.GDPR_URL : str;
    }

    public static UtilNetworking.IConnectionOptions getConnectionOptions() {
        UtilNetworking.IConnectionOptions iConnectionOptions = connectionOptions;
        return iConnectionOptions == null ? new UtilNetworking.ConnectionOptions() : iConnectionOptions;
    }

    public static boolean getTryInstallReferrer() {
        return tryInstallReferrer;
    }

    public static void setPackageHandler(IPackageHandler iPackageHandler) {
        packageHandler = iPackageHandler;
    }

    public static void setRequestHandler(IRequestHandler iRequestHandler) {
        requestHandler = iRequestHandler;
    }

    public static void setLogger(ILogger iLogger) {
        logger = iLogger;
    }

    public static void setTimerInterval(long j) {
        timerInterval = j;
    }

    public static void setTimerStart(long j) {
        timerStart = j;
    }

    public static void setSessionInterval(long j) {
        sessionInterval = j;
    }

    public static void setSubsessionInterval(long j) {
        subsessionInterval = j;
    }

    public static void setSdkClickBackoffStrategy(BackoffStrategy backoffStrategy) {
        sdkClickBackoffStrategy = backoffStrategy;
    }

    public static void setPackageHandlerBackoffStrategy(BackoffStrategy backoffStrategy) {
        packageHandlerBackoffStrategy = backoffStrategy;
    }

    public static void setActivityHandler(IActivityHandler iActivityHandler) {
        activityHandler = iActivityHandler;
    }

    public static void setAttributionHandler(IAttributionHandler iAttributionHandler) {
        attributionHandler = iAttributionHandler;
    }

    public static void setHttpsURLConnection(HttpsURLConnection httpsURLConnection2) {
        httpsURLConnection = httpsURLConnection2;
    }

    public static void setSdkClickHandler(ISdkClickHandler iSdkClickHandler) {
        sdkClickHandler = iSdkClickHandler;
    }

    public static void setBaseUrl(String str) {
        baseUrl = str;
    }

    public static void setGdprUrl(String str) {
        gdprUrl = str;
    }

    public static void useTestConnectionOptions() {
        connectionOptions = new UtilNetworking.IConnectionOptions() {
            public void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str) {
                new UtilNetworking.ConnectionOptions().applyConnectionOptions(httpsURLConnection, str);
                try {
                    SSLContext instance = SSLContext.getInstance("TLS");
                    instance.init((KeyManager[]) null, new TrustManager[]{new X509TrustManager() {
                        public X509Certificate[] getAcceptedIssuers() {
                            AdjustFactory.getLogger().verbose("getAcceptedIssuers", new Object[0]);
                            return null;
                        }

                        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                            AdjustFactory.getLogger().verbose("checkClientTrusted ", new Object[0]);
                        }

                        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                            AdjustFactory.getLogger().verbose("checkServerTrusted ", new Object[0]);
                            try {
                                if (!AdjustFactory.byte2HexFormatted(MessageDigest.getInstance("SHA1").digest(x509CertificateArr[0].getEncoded())).equalsIgnoreCase("7BCFF44099A35BC093BB48C5A6B9A516CDFDA0D1")) {
                                    throw new CertificateException();
                                }
                            } catch (NoSuchAlgorithmException e) {
                                AdjustFactory.getLogger().error("testingMode error %s", e.getMessage());
                            } catch (CertificateEncodingException e2) {
                                AdjustFactory.getLogger().error("testingMode error %s", e2.getMessage());
                            }
                        }
                    }}, new SecureRandom());
                    httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
                    httpsURLConnection.setHostnameVerifier(new HostnameVerifier() {
                        public boolean verify(String str, SSLSession sSLSession) {
                            AdjustFactory.getLogger().verbose("verify hostname ", new Object[0]);
                            return true;
                        }
                    });
                } catch (Exception e) {
                    AdjustFactory.getLogger().error("testingMode error %s", e.getMessage());
                }
            }
        };
    }

    public static void setTryInstallReferrer(boolean z) {
        tryInstallReferrer = z;
    }

    /* access modifiers changed from: private */
    public static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte hexString : bArr) {
            String hexString2 = Integer.toHexString(hexString);
            int length = hexString2.length();
            if (length == 1) {
                hexString2 = "0" + hexString2;
            }
            if (length > 2) {
                hexString2 = hexString2.substring(length - 2, length);
            }
            sb.append(hexString2.toUpperCase());
        }
        return sb.toString();
    }

    public static void teardown(Context context) {
        if (context != null) {
            ActivityHandler.deleteState(context);
            PackageHandler.deleteState(context);
        }
        packageHandler = null;
        requestHandler = null;
        attributionHandler = null;
        activityHandler = null;
        logger = null;
        httpsURLConnection = null;
        sdkClickHandler = null;
        timerInterval = -1;
        timerStart = -1;
        sessionInterval = -1;
        subsessionInterval = -1;
        sdkClickBackoffStrategy = null;
        packageHandlerBackoffStrategy = null;
        maxDelayStart = -1;
        baseUrl = Constants.BASE_URL;
        gdprUrl = Constants.GDPR_URL;
        connectionOptions = null;
        tryInstallReferrer = true;
    }
}
