package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class AdjustInstance {
    private IActivityHandler activityHandler;
    private String basePath;
    private String gdprPath;
    private List<IRunActivityHandler> preLaunchActionsArray;
    private String pushToken;
    private Boolean startEnabled = null;
    private boolean startOffline = false;

    public void onCreate(AdjustConfig adjustConfig) {
        if (adjustConfig == null) {
            AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
        } else if (!adjustConfig.isValid()) {
            AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
        } else if (this.activityHandler != null) {
            AdjustFactory.getLogger().error("Adjust already initialized", new Object[0]);
        } else {
            adjustConfig.preLaunchActionsArray = this.preLaunchActionsArray;
            adjustConfig.pushToken = this.pushToken;
            adjustConfig.startEnabled = this.startEnabled;
            adjustConfig.startOffline = this.startOffline;
            adjustConfig.basePath = this.basePath;
            adjustConfig.gdprPath = this.gdprPath;
            this.activityHandler = AdjustFactory.getActivityHandler(adjustConfig);
            setSendingReferrersAsNotSent(adjustConfig.context);
        }
    }

    public void trackEvent(AdjustEvent adjustEvent) {
        if (checkActivityHandler()) {
            this.activityHandler.trackEvent(adjustEvent);
        }
    }

    public void onResume() {
        if (checkActivityHandler()) {
            this.activityHandler.onResume();
        }
    }

    public void onPause() {
        if (checkActivityHandler()) {
            this.activityHandler.onPause();
        }
    }

    public void setEnabled(boolean z) {
        this.startEnabled = Boolean.valueOf(z);
        if (checkActivityHandler(z, "enabled mode", "disabled mode")) {
            this.activityHandler.setEnabled(z);
        }
    }

    public boolean isEnabled() {
        if (!checkActivityHandler()) {
            return isInstanceEnabled();
        }
        return this.activityHandler.isEnabled();
    }

    public void appWillOpenUrl(Uri uri) {
        if (checkActivityHandler()) {
            this.activityHandler.readOpenUrl(uri, System.currentTimeMillis());
        }
    }

    public void appWillOpenUrl(Uri uri, Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!checkActivityHandler()) {
            new SharedPreferencesManager(context).saveDeeplink(uri, currentTimeMillis);
        } else {
            this.activityHandler.readOpenUrl(uri, currentTimeMillis);
        }
    }

    public void sendReferrer(String str, Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            saveRawReferrer(str, currentTimeMillis, context);
            if (checkActivityHandler(Constants.REFERRER) && this.activityHandler.isEnabled()) {
                this.activityHandler.sendReftagReferrer();
            }
        }
    }

    public void setOfflineMode(boolean z) {
        if (!checkActivityHandler(z, "offline mode", "online mode")) {
            this.startOffline = z;
        } else {
            this.activityHandler.setOfflineMode(z);
        }
    }

    public void sendFirstPackages() {
        if (checkActivityHandler()) {
            this.activityHandler.sendFirstPackages();
        }
    }

    public void addSessionCallbackParameter(final String str, final String str2) {
        if (checkActivityHandler("adding session callback parameter")) {
            this.activityHandler.addSessionCallbackParameter(str, str2);
            return;
        }
        if (this.preLaunchActionsArray == null) {
            this.preLaunchActionsArray = new ArrayList();
        }
        this.preLaunchActionsArray.add(new IRunActivityHandler() {
            public void run(ActivityHandler activityHandler) {
                activityHandler.addSessionCallbackParameterI(str, str2);
            }
        });
    }

    public void addSessionPartnerParameter(final String str, final String str2) {
        if (checkActivityHandler("adding session partner parameter")) {
            this.activityHandler.addSessionPartnerParameter(str, str2);
            return;
        }
        if (this.preLaunchActionsArray == null) {
            this.preLaunchActionsArray = new ArrayList();
        }
        this.preLaunchActionsArray.add(new IRunActivityHandler() {
            public void run(ActivityHandler activityHandler) {
                activityHandler.addSessionPartnerParameterI(str, str2);
            }
        });
    }

    public void removeSessionCallbackParameter(final String str) {
        if (checkActivityHandler("removing session callback parameter")) {
            this.activityHandler.removeSessionCallbackParameter(str);
            return;
        }
        if (this.preLaunchActionsArray == null) {
            this.preLaunchActionsArray = new ArrayList();
        }
        this.preLaunchActionsArray.add(new IRunActivityHandler() {
            public void run(ActivityHandler activityHandler) {
                activityHandler.removeSessionCallbackParameterI(str);
            }
        });
    }

    public void removeSessionPartnerParameter(final String str) {
        if (checkActivityHandler("removing session partner parameter")) {
            this.activityHandler.removeSessionPartnerParameter(str);
            return;
        }
        if (this.preLaunchActionsArray == null) {
            this.preLaunchActionsArray = new ArrayList();
        }
        this.preLaunchActionsArray.add(new IRunActivityHandler() {
            public void run(ActivityHandler activityHandler) {
                activityHandler.removeSessionPartnerParameterI(str);
            }
        });
    }

    public void resetSessionCallbackParameters() {
        if (checkActivityHandler("resetting session callback parameters")) {
            this.activityHandler.resetSessionCallbackParameters();
            return;
        }
        if (this.preLaunchActionsArray == null) {
            this.preLaunchActionsArray = new ArrayList();
        }
        this.preLaunchActionsArray.add(new IRunActivityHandler() {
            public void run(ActivityHandler activityHandler) {
                activityHandler.resetSessionCallbackParametersI();
            }
        });
    }

    public void resetSessionPartnerParameters() {
        if (checkActivityHandler("resetting session partner parameters")) {
            this.activityHandler.resetSessionPartnerParameters();
            return;
        }
        if (this.preLaunchActionsArray == null) {
            this.preLaunchActionsArray = new ArrayList();
        }
        this.preLaunchActionsArray.add(new IRunActivityHandler() {
            public void run(ActivityHandler activityHandler) {
                activityHandler.resetSessionPartnerParametersI();
            }
        });
    }

    public void teardown() {
        if (checkActivityHandler()) {
            this.activityHandler.teardown();
            this.activityHandler = null;
        }
    }

    public void setPushToken(String str) {
        if (!checkActivityHandler("push token")) {
            this.pushToken = str;
        } else {
            this.activityHandler.setPushToken(str, false);
        }
    }

    public void setPushToken(String str, Context context) {
        savePushToken(str, context);
        if (checkActivityHandler("push token") && this.activityHandler.isEnabled()) {
            this.activityHandler.setPushToken(str, true);
        }
    }

    public void gdprForgetMe(Context context) {
        saveGdprForgetMe(context);
        if (checkActivityHandler("gdpr") && this.activityHandler.isEnabled()) {
            this.activityHandler.gdprForgetMe();
        }
    }

    public void trackAdRevenue(String str, JSONObject jSONObject) {
        if (checkActivityHandler()) {
            this.activityHandler.trackAdRevenue(str, jSONObject);
        }
    }

    public String getAdid() {
        if (!checkActivityHandler()) {
            return null;
        }
        return this.activityHandler.getAdid();
    }

    public AdjustAttribution getAttribution() {
        if (!checkActivityHandler()) {
            return null;
        }
        return this.activityHandler.getAttribution();
    }

    public String getSdkVersion() {
        return Util.getSdkVersion();
    }

    private boolean checkActivityHandler() {
        return checkActivityHandler((String) null);
    }

    private boolean checkActivityHandler(boolean z, String str, String str2) {
        if (z) {
            return checkActivityHandler(str);
        }
        return checkActivityHandler(str2);
    }

    private boolean checkActivityHandler(String str) {
        if (this.activityHandler != null) {
            return true;
        }
        if (str != null) {
            AdjustFactory.getLogger().warn("Adjust not initialized, but %s saved for launch", str);
        } else {
            AdjustFactory.getLogger().error("Adjust not initialized correctly", new Object[0]);
        }
        return false;
    }

    private void saveRawReferrer(String str, long j, Context context) {
        final Context context2 = context;
        final String str2 = str;
        final long j2 = j;
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context2).saveRawReferrer(str2, j2);
            }
        });
    }

    private void savePushToken(final String str, final Context context) {
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context).savePushToken(str);
            }
        });
    }

    private void saveGdprForgetMe(final Context context) {
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context).setGdprForgetMe();
            }
        });
    }

    private void setSendingReferrersAsNotSent(final Context context) {
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context).setSendingReferrersAsNotSent();
            }
        });
    }

    private boolean isInstanceEnabled() {
        Boolean bool = this.startEnabled;
        return bool == null || bool.booleanValue();
    }

    public void setTestOptions(AdjustTestOptions adjustTestOptions) {
        if (adjustTestOptions.basePath != null) {
            this.basePath = adjustTestOptions.basePath;
        }
        if (adjustTestOptions.gdprPath != null) {
            this.gdprPath = adjustTestOptions.gdprPath;
        }
        if (adjustTestOptions.baseUrl != null) {
            AdjustFactory.setBaseUrl(adjustTestOptions.baseUrl);
        }
        if (adjustTestOptions.gdprUrl != null) {
            AdjustFactory.setGdprUrl(adjustTestOptions.gdprUrl);
        }
        if (adjustTestOptions.useTestConnectionOptions != null && adjustTestOptions.useTestConnectionOptions.booleanValue()) {
            AdjustFactory.useTestConnectionOptions();
        }
        if (adjustTestOptions.timerIntervalInMilliseconds != null) {
            AdjustFactory.setTimerInterval(adjustTestOptions.timerIntervalInMilliseconds.longValue());
        }
        if (adjustTestOptions.timerStartInMilliseconds != null) {
            AdjustFactory.setTimerStart(adjustTestOptions.timerIntervalInMilliseconds.longValue());
        }
        if (adjustTestOptions.sessionIntervalInMilliseconds != null) {
            AdjustFactory.setSessionInterval(adjustTestOptions.sessionIntervalInMilliseconds.longValue());
        }
        if (adjustTestOptions.subsessionIntervalInMilliseconds != null) {
            AdjustFactory.setSubsessionInterval(adjustTestOptions.subsessionIntervalInMilliseconds.longValue());
        }
        if (adjustTestOptions.tryInstallReferrer != null) {
            AdjustFactory.setTryInstallReferrer(adjustTestOptions.tryInstallReferrer.booleanValue());
        }
        if (adjustTestOptions.noBackoffWait != null) {
            AdjustFactory.setPackageHandlerBackoffStrategy(BackoffStrategy.NO_WAIT);
            AdjustFactory.setSdkClickBackoffStrategy(BackoffStrategy.NO_WAIT);
        }
    }
}
