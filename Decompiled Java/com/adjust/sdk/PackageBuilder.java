package com.adjust.sdk;

import android.content.ContentResolver;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class PackageBuilder {
    private static ILogger logger = AdjustFactory.getLogger();
    private ActivityStateCopy activityStateCopy;
    private AdjustConfig adjustConfig;
    AdjustAttribution attribution;
    long clickTimeInMilliseconds = -1;
    long clickTimeInSeconds = -1;
    private long createdAt;
    String deeplink;
    private DeviceInfo deviceInfo;
    Map<String, String> extraParameters;
    long installBeginTimeInSeconds = -1;
    String rawReferrer;
    String referrer;
    String reftag;
    private SessionParameters sessionParameters;

    private class ActivityStateCopy {
        int eventCount = -1;
        long lastInterval = -1;
        String pushToken = null;
        int sessionCount = -1;
        long sessionLength = -1;
        int subsessionCount = -1;
        long timeSpent = -1;
        String uuid = null;

        ActivityStateCopy(ActivityState activityState) {
            if (activityState != null) {
                this.eventCount = activityState.eventCount;
                this.sessionCount = activityState.sessionCount;
                this.subsessionCount = activityState.subsessionCount;
                this.timeSpent = activityState.timeSpent;
                this.lastInterval = activityState.lastInterval;
                this.sessionLength = activityState.sessionLength;
                this.uuid = activityState.uuid;
                this.pushToken = activityState.pushToken;
            }
        }
    }

    PackageBuilder(AdjustConfig adjustConfig2, DeviceInfo deviceInfo2, ActivityState activityState, SessionParameters sessionParameters2, long j) {
        this.createdAt = j;
        this.deviceInfo = deviceInfo2;
        this.adjustConfig = adjustConfig2;
        this.activityStateCopy = new ActivityStateCopy(activityState);
        this.sessionParameters = sessionParameters2;
    }

    /* access modifiers changed from: package-private */
    public ActivityPackage buildSessionPackage(boolean z) {
        Map<String, String> sessionParameters2 = getSessionParameters(z);
        ActivityPackage defaultActivityPackage = getDefaultActivityPackage(ActivityKind.SESSION);
        defaultActivityPackage.setPath("/session");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(sessionParameters2);
        return defaultActivityPackage;
    }

    /* access modifiers changed from: package-private */
    public ActivityPackage buildEventPackage(AdjustEvent adjustEvent, boolean z) {
        Map<String, String> eventParameters = getEventParameters(adjustEvent, z);
        ActivityPackage defaultActivityPackage = getDefaultActivityPackage(ActivityKind.EVENT);
        defaultActivityPackage.setPath("/event");
        defaultActivityPackage.setSuffix(getEventSuffix(adjustEvent));
        defaultActivityPackage.setParameters(eventParameters);
        if (z) {
            defaultActivityPackage.setCallbackParameters(adjustEvent.callbackParameters);
            defaultActivityPackage.setPartnerParameters(adjustEvent.partnerParameters);
        }
        return defaultActivityPackage;
    }

    /* access modifiers changed from: package-private */
    public ActivityPackage buildInfoPackage(String str) {
        Map<String, String> infoParameters = getInfoParameters(str);
        ActivityPackage defaultActivityPackage = getDefaultActivityPackage(ActivityKind.INFO);
        defaultActivityPackage.setPath("/sdk_info");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(infoParameters);
        return defaultActivityPackage;
    }

    /* access modifiers changed from: package-private */
    public ActivityPackage buildClickPackage(String str) {
        Map<String, String> clickParameters = getClickParameters(str);
        ActivityPackage defaultActivityPackage = getDefaultActivityPackage(ActivityKind.CLICK);
        defaultActivityPackage.setPath("/sdk_click");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setClickTimeInMilliseconds(this.clickTimeInMilliseconds);
        defaultActivityPackage.setClickTimeInSeconds(this.clickTimeInSeconds);
        defaultActivityPackage.setInstallBeginTimeInSeconds(this.installBeginTimeInSeconds);
        defaultActivityPackage.setParameters(clickParameters);
        return defaultActivityPackage;
    }

    /* access modifiers changed from: package-private */
    public ActivityPackage buildAttributionPackage(String str) {
        Map<String, String> attributionParameters = getAttributionParameters(str);
        ActivityPackage defaultActivityPackage = getDefaultActivityPackage(ActivityKind.ATTRIBUTION);
        defaultActivityPackage.setPath("attribution");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(attributionParameters);
        return defaultActivityPackage;
    }

    /* access modifiers changed from: package-private */
    public ActivityPackage buildGdprPackage() {
        Map<String, String> gdprParameters = getGdprParameters();
        ActivityPackage defaultActivityPackage = getDefaultActivityPackage(ActivityKind.GDPR);
        defaultActivityPackage.setPath("/gdpr_forget_device");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(gdprParameters);
        return defaultActivityPackage;
    }

    /* access modifiers changed from: package-private */
    public ActivityPackage buildAdRevenuePackage(String str, JSONObject jSONObject) {
        Map<String, String> adRevenueParameters = getAdRevenueParameters(str, jSONObject);
        ActivityPackage defaultActivityPackage = getDefaultActivityPackage(ActivityKind.AD_REVENUE);
        defaultActivityPackage.setPath("/ad_revenue");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(adRevenueParameters);
        return defaultActivityPackage;
    }

    private Map<String, String> getSessionParameters(boolean z) {
        ContentResolver contentResolver = this.adjustConfig.context.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> imeiParameters = Reflection.getImeiParameters(this.adjustConfig.context, logger);
        if (imeiParameters != null) {
            hashMap.putAll(imeiParameters);
        }
        Map<String, String> oaidParameters = Reflection.getOaidParameters(this.adjustConfig.context, logger);
        if (oaidParameters != null) {
            hashMap.putAll(oaidParameters);
        }
        if (!z) {
            addMapJson(hashMap, Constants.CALLBACK_PARAMETERS, this.sessionParameters.callbackParameters);
            addMapJson(hashMap, Constants.PARTNER_PARAMETERS, this.sessionParameters.partnerParameters);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig.context);
        addString(hashMap, "android_uuid", this.activityStateCopy.uuid);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        if (!containsPlayIds(hashMap)) {
            logger.warn("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig.context);
            addString(hashMap, "mac_sha1", this.deviceInfo.macSha1);
            addString(hashMap, "mac_md5", this.deviceInfo.macShortMd5);
            addString(hashMap, "android_id", this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_secret", this.adjustConfig.appSecret);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, "app_version", this.deviceInfo.appVersion);
        addBoolean(hashMap, "attribution_deeplink", true);
        addLong(hashMap, "connectivity_type", (long) Util.getConnectivityType(this.adjustConfig.context));
        addString(hashMap, "country", this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(hashMap, "device_known", this.adjustConfig.deviceKnown);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, "device_name", this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addBoolean(hashMap, "event_buffering_enabled", Boolean.valueOf(this.adjustConfig.eventBufferingEnabled));
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addString(hashMap, "fire_adid", Util.getFireAdvertisingId(contentResolver));
        addBoolean(hashMap, "fire_tracking_enabled", Util.getFireTrackingEnabled(contentResolver));
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addString(hashMap, "installed_at", this.deviceInfo.appInstallTime);
        addString(hashMap, "language", this.deviceInfo.language);
        addDuration(hashMap, "last_interval", this.activityStateCopy.lastInterval);
        addString(hashMap, "mcc", Util.getMcc(this.adjustConfig.context));
        addString(hashMap, "mnc", Util.getMnc(this.adjustConfig.context));
        addBoolean(hashMap, "needs_response_details", true);
        addLong(hashMap, "network_type", (long) Util.getNetworkType(this.adjustConfig.context));
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.pushToken);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addString(hashMap, "secret_id", this.adjustConfig.secretId);
        addLong(hashMap, "session_count", (long) this.activityStateCopy.sessionCount);
        addDuration(hashMap, "session_length", this.activityStateCopy.sessionLength);
        addLong(hashMap, "subsession_count", (long) this.activityStateCopy.subsessionCount);
        addDuration(hashMap, "time_spent", this.activityStateCopy.timeSpent);
        addString(hashMap, "updated_at", this.deviceInfo.appUpdateTime);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    public Map<String, String> getEventParameters(AdjustEvent adjustEvent, boolean z) {
        ContentResolver contentResolver = this.adjustConfig.context.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> imeiParameters = Reflection.getImeiParameters(this.adjustConfig.context, logger);
        if (imeiParameters != null) {
            hashMap.putAll(imeiParameters);
        }
        Map<String, String> oaidParameters = Reflection.getOaidParameters(this.adjustConfig.context, logger);
        if (oaidParameters != null) {
            hashMap.putAll(oaidParameters);
        }
        if (!z) {
            addMapJson(hashMap, Constants.CALLBACK_PARAMETERS, Util.mergeParameters(this.sessionParameters.callbackParameters, adjustEvent.callbackParameters, "Callback"));
            addMapJson(hashMap, Constants.PARTNER_PARAMETERS, Util.mergeParameters(this.sessionParameters.partnerParameters, adjustEvent.partnerParameters, "Partner"));
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig.context);
        addString(hashMap, "android_uuid", this.activityStateCopy.uuid);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        if (!containsPlayIds(hashMap)) {
            logger.warn("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig.context);
            addString(hashMap, "mac_sha1", this.deviceInfo.macSha1);
            addString(hashMap, "mac_md5", this.deviceInfo.macShortMd5);
            addString(hashMap, "android_id", this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_secret", this.adjustConfig.appSecret);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, "app_version", this.deviceInfo.appVersion);
        addBoolean(hashMap, "attribution_deeplink", true);
        addLong(hashMap, "connectivity_type", (long) Util.getConnectivityType(this.adjustConfig.context));
        addString(hashMap, "country", this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, FirebaseAnalytics.Param.CURRENCY, adjustEvent.currency);
        addBoolean(hashMap, "device_known", this.adjustConfig.deviceKnown);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, "device_name", this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, "event_callback_id", adjustEvent.callbackId);
        addLong(hashMap, "event_count", (long) this.activityStateCopy.eventCount);
        addBoolean(hashMap, "event_buffering_enabled", Boolean.valueOf(this.adjustConfig.eventBufferingEnabled));
        addString(hashMap, "event_token", adjustEvent.eventToken);
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addString(hashMap, "fire_adid", Util.getFireAdvertisingId(contentResolver));
        addBoolean(hashMap, "fire_tracking_enabled", Util.getFireTrackingEnabled(contentResolver));
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addString(hashMap, "language", this.deviceInfo.language);
        addString(hashMap, "mcc", Util.getMcc(this.adjustConfig.context));
        addString(hashMap, "mnc", Util.getMnc(this.adjustConfig.context));
        addBoolean(hashMap, "needs_response_details", true);
        addLong(hashMap, "network_type", (long) Util.getNetworkType(this.adjustConfig.context));
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.pushToken);
        addDouble(hashMap, "revenue", adjustEvent.revenue);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addString(hashMap, "secret_id", this.adjustConfig.secretId);
        addLong(hashMap, "session_count", (long) this.activityStateCopy.sessionCount);
        addDuration(hashMap, "session_length", this.activityStateCopy.sessionLength);
        addLong(hashMap, "subsession_count", (long) this.activityStateCopy.subsessionCount);
        addDuration(hashMap, "time_spent", this.activityStateCopy.timeSpent);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private Map<String, String> getInfoParameters(String str) {
        ContentResolver contentResolver = this.adjustConfig.context.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> imeiParameters = Reflection.getImeiParameters(this.adjustConfig.context, logger);
        if (imeiParameters != null) {
            hashMap.putAll(imeiParameters);
        }
        Map<String, String> oaidParameters = Reflection.getOaidParameters(this.adjustConfig.context, logger);
        if (oaidParameters != null) {
            hashMap.putAll(oaidParameters);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig.context);
        addString(hashMap, "android_uuid", this.activityStateCopy.uuid);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        if (!containsPlayIds(hashMap)) {
            logger.warn("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig.context);
            addString(hashMap, "mac_sha1", this.deviceInfo.macSha1);
            addString(hashMap, "mac_md5", this.deviceInfo.macShortMd5);
            addString(hashMap, "android_id", this.deviceInfo.androidId);
        }
        addString(hashMap, "app_secret", this.adjustConfig.appSecret);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addBoolean(hashMap, "attribution_deeplink", true);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addBoolean(hashMap, "device_known", this.adjustConfig.deviceKnown);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addBoolean(hashMap, "event_buffering_enabled", Boolean.valueOf(this.adjustConfig.eventBufferingEnabled));
        addString(hashMap, "fire_adid", Util.getFireAdvertisingId(contentResolver));
        addBoolean(hashMap, "fire_tracking_enabled", Util.getFireTrackingEnabled(contentResolver));
        addBoolean(hashMap, "needs_response_details", true);
        addString(hashMap, "push_token", this.activityStateCopy.pushToken);
        addString(hashMap, "secret_id", this.adjustConfig.secretId);
        addString(hashMap, "source", str);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private Map<String, String> getClickParameters(String str) {
        ContentResolver contentResolver = this.adjustConfig.context.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> imeiParameters = Reflection.getImeiParameters(this.adjustConfig.context, logger);
        if (imeiParameters != null) {
            hashMap.putAll(imeiParameters);
        }
        Map<String, String> oaidParameters = Reflection.getOaidParameters(this.adjustConfig.context, logger);
        if (oaidParameters != null) {
            hashMap.putAll(oaidParameters);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig.context);
        addString(hashMap, "android_uuid", this.activityStateCopy.uuid);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        if (!containsPlayIds(hashMap)) {
            logger.warn("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig.context);
            addString(hashMap, "mac_sha1", this.deviceInfo.macSha1);
            addString(hashMap, "mac_md5", this.deviceInfo.macShortMd5);
            addString(hashMap, "android_id", this.deviceInfo.androidId);
        }
        AdjustAttribution adjustAttribution = this.attribution;
        if (adjustAttribution != null) {
            addString(hashMap, "tracker", adjustAttribution.trackerName);
            addString(hashMap, "campaign", this.attribution.campaign);
            addString(hashMap, "adgroup", this.attribution.adgroup);
            addString(hashMap, "creative", this.attribution.creative);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_secret", this.adjustConfig.appSecret);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, "app_version", this.deviceInfo.appVersion);
        addBoolean(hashMap, "attribution_deeplink", true);
        addMapJson(hashMap, Constants.CALLBACK_PARAMETERS, this.sessionParameters.callbackParameters);
        addDateInMilliseconds(hashMap, "click_time", this.clickTimeInMilliseconds);
        addDateInSeconds(hashMap, "click_time", this.clickTimeInSeconds);
        addLong(hashMap, "connectivity_type", (long) Util.getConnectivityType(this.adjustConfig.context));
        addString(hashMap, "country", this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, Constants.DEEPLINK, this.deeplink);
        addBoolean(hashMap, "device_known", this.adjustConfig.deviceKnown);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, "device_name", this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addBoolean(hashMap, "event_buffering_enabled", Boolean.valueOf(this.adjustConfig.eventBufferingEnabled));
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addString(hashMap, "fire_adid", Util.getFireAdvertisingId(contentResolver));
        addBoolean(hashMap, "fire_tracking_enabled", Util.getFireTrackingEnabled(contentResolver));
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addDateInSeconds(hashMap, "install_begin_time", this.installBeginTimeInSeconds);
        addString(hashMap, "installed_at", this.deviceInfo.appInstallTime);
        addString(hashMap, "language", this.deviceInfo.language);
        addDuration(hashMap, "last_interval", this.activityStateCopy.lastInterval);
        addString(hashMap, "mcc", Util.getMcc(this.adjustConfig.context));
        addString(hashMap, "mnc", Util.getMnc(this.adjustConfig.context));
        addBoolean(hashMap, "needs_response_details", true);
        addLong(hashMap, "network_type", (long) Util.getNetworkType(this.adjustConfig.context));
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addMapJson(hashMap, "params", this.extraParameters);
        addMapJson(hashMap, Constants.PARTNER_PARAMETERS, this.sessionParameters.partnerParameters);
        addString(hashMap, "push_token", this.activityStateCopy.pushToken);
        addString(hashMap, "raw_referrer", this.rawReferrer);
        addString(hashMap, Constants.REFERRER, this.referrer);
        addString(hashMap, Constants.REFTAG, this.reftag);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addString(hashMap, "secret_id", this.adjustConfig.secretId);
        addLong(hashMap, "session_count", (long) this.activityStateCopy.sessionCount);
        addDuration(hashMap, "session_length", this.activityStateCopy.sessionLength);
        addString(hashMap, "source", str);
        addLong(hashMap, "subsession_count", (long) this.activityStateCopy.subsessionCount);
        addDuration(hashMap, "time_spent", this.activityStateCopy.timeSpent);
        addString(hashMap, "updated_at", this.deviceInfo.appUpdateTime);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private Map<String, String> getAttributionParameters(String str) {
        ContentResolver contentResolver = this.adjustConfig.context.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> imeiParameters = Reflection.getImeiParameters(this.adjustConfig.context, logger);
        if (imeiParameters != null) {
            hashMap.putAll(imeiParameters);
        }
        Map<String, String> oaidParameters = Reflection.getOaidParameters(this.adjustConfig.context, logger);
        if (oaidParameters != null) {
            hashMap.putAll(oaidParameters);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig.context);
        addString(hashMap, "android_uuid", this.activityStateCopy.uuid);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        if (!containsPlayIds(hashMap)) {
            logger.warn("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig.context);
            addString(hashMap, "mac_sha1", this.deviceInfo.macSha1);
            addString(hashMap, "mac_md5", this.deviceInfo.macShortMd5);
            addString(hashMap, "android_id", this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_secret", this.adjustConfig.appSecret);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, "app_version", this.deviceInfo.appVersion);
        addBoolean(hashMap, "attribution_deeplink", true);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addBoolean(hashMap, "device_known", this.adjustConfig.deviceKnown);
        addString(hashMap, "device_name", this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addBoolean(hashMap, "event_buffering_enabled", Boolean.valueOf(this.adjustConfig.eventBufferingEnabled));
        addString(hashMap, "fire_adid", Util.getFireAdvertisingId(contentResolver));
        addBoolean(hashMap, "fire_tracking_enabled", Util.getFireTrackingEnabled(contentResolver));
        addString(hashMap, "initiated_by", str);
        addBoolean(hashMap, "needs_response_details", true);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.pushToken);
        addString(hashMap, "secret_id", this.adjustConfig.secretId);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private Map<String, String> getGdprParameters() {
        ContentResolver contentResolver = this.adjustConfig.context.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> imeiParameters = Reflection.getImeiParameters(this.adjustConfig.context, logger);
        if (imeiParameters != null) {
            hashMap.putAll(imeiParameters);
        }
        Map<String, String> oaidParameters = Reflection.getOaidParameters(this.adjustConfig.context, logger);
        if (oaidParameters != null) {
            hashMap.putAll(oaidParameters);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig.context);
        addString(hashMap, "android_uuid", this.activityStateCopy.uuid);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        if (!containsPlayIds(hashMap)) {
            logger.warn("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig.context);
            addString(hashMap, "mac_sha1", this.deviceInfo.macSha1);
            addString(hashMap, "mac_md5", this.deviceInfo.macShortMd5);
            addString(hashMap, "android_id", this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_secret", this.adjustConfig.appSecret);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, "app_version", this.deviceInfo.appVersion);
        addBoolean(hashMap, "attribution_deeplink", true);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addBoolean(hashMap, "device_known", this.adjustConfig.deviceKnown);
        addString(hashMap, "device_name", this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addBoolean(hashMap, "event_buffering_enabled", Boolean.valueOf(this.adjustConfig.eventBufferingEnabled));
        addString(hashMap, "fire_adid", Util.getFireAdvertisingId(contentResolver));
        addBoolean(hashMap, "fire_tracking_enabled", Util.getFireTrackingEnabled(contentResolver));
        addBoolean(hashMap, "needs_response_details", true);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.pushToken);
        addString(hashMap, "secret_id", this.adjustConfig.secretId);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private Map<String, String> getAdRevenueParameters(String str, JSONObject jSONObject) {
        ContentResolver contentResolver = this.adjustConfig.context.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> imeiParameters = Reflection.getImeiParameters(this.adjustConfig.context, logger);
        if (imeiParameters != null) {
            hashMap.putAll(imeiParameters);
        }
        Map<String, String> oaidParameters = Reflection.getOaidParameters(this.adjustConfig.context, logger);
        if (oaidParameters != null) {
            hashMap.putAll(oaidParameters);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig.context);
        addString(hashMap, "android_uuid", this.activityStateCopy.uuid);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        if (!containsPlayIds(hashMap)) {
            logger.warn("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig.context);
            addString(hashMap, "mac_sha1", this.deviceInfo.macSha1);
            addString(hashMap, "mac_md5", this.deviceInfo.macShortMd5);
            addString(hashMap, "android_id", this.deviceInfo.androidId);
        }
        addString(hashMap, "app_secret", this.adjustConfig.appSecret);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addBoolean(hashMap, "attribution_deeplink", true);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addBoolean(hashMap, "device_known", this.adjustConfig.deviceKnown);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addBoolean(hashMap, "event_buffering_enabled", Boolean.valueOf(this.adjustConfig.eventBufferingEnabled));
        addString(hashMap, "fire_adid", Util.getFireAdvertisingId(contentResolver));
        addBoolean(hashMap, "fire_tracking_enabled", Util.getFireTrackingEnabled(contentResolver));
        addBoolean(hashMap, "needs_response_details", true);
        addString(hashMap, "push_token", this.activityStateCopy.pushToken);
        addString(hashMap, "secret_id", this.adjustConfig.secretId);
        addString(hashMap, "source", str);
        addJsonObject(hashMap, "payload", jSONObject);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private ActivityPackage getDefaultActivityPackage(ActivityKind activityKind) {
        ActivityPackage activityPackage = new ActivityPackage(activityKind);
        activityPackage.setClientSdk(this.deviceInfo.clientSdk);
        return activityPackage;
    }

    public static void addString(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public static void addBoolean(Map<String, String> map, String str, Boolean bool) {
        if (bool != null) {
            addLong(map, str, bool.booleanValue() ? 1 : 0);
        }
    }

    static void addJsonObject(Map<String, String> map, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            addString(map, str, jSONObject.toString());
        }
    }

    static void addMapJson(Map<String, String> map, String str, Map<String, String> map2) {
        if (map2 != null && map2.size() != 0) {
            addString(map, str, new JSONObject(map2).toString());
        }
    }

    private static void addLong(Map<String, String> map, String str, long j) {
        if (j >= 0) {
            addString(map, str, Long.toString(j));
        }
    }

    private static void addDateInMilliseconds(Map<String, String> map, String str, long j) {
        if (j > 0) {
            addDate(map, str, new Date(j));
        }
    }

    private static void addDateInSeconds(Map<String, String> map, String str, long j) {
        if (j > 0) {
            addDate(map, str, new Date(j * 1000));
        }
    }

    private static void addDate(Map<String, String> map, String str, Date date) {
        if (date != null) {
            addString(map, str, Util.dateFormatter.format(date));
        }
    }

    private static void addDuration(Map<String, String> map, String str, long j) {
        if (j >= 0) {
            addLong(map, str, (j + 500) / 1000);
        }
    }

    private static void addDouble(Map<String, String> map, String str, Double d) {
        if (d != null) {
            addString(map, str, Util.formatString("%.5f", d));
        }
    }

    private boolean containsPlayIds(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("tracking_enabled") || map.containsKey("gps_adid");
    }

    private void checkDeviceIds(Map<String, String> map) {
        if (map != null && !map.containsKey("mac_sha1") && !map.containsKey("mac_md5") && !map.containsKey("android_id") && !map.containsKey("gps_adid")) {
            logger.error("Missing device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
        }
    }

    private String getEventSuffix(AdjustEvent adjustEvent) {
        if (adjustEvent.revenue == null) {
            return Util.formatString("'%s'", adjustEvent.eventToken);
        }
        return Util.formatString("(%.5f %s, '%s')", adjustEvent.revenue, adjustEvent.currency, adjustEvent.eventToken);
    }
}
