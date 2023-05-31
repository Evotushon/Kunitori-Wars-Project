package com.adjust.sdk;

import org.json.JSONObject;

public class EventResponseData extends ResponseData {
    private String callbackId;
    private String eventToken;
    private String sdkPlatform;

    public EventResponseData(ActivityPackage activityPackage) {
        this.eventToken = activityPackage.getParameters().get("event_token");
        this.callbackId = activityPackage.getParameters().get("event_callback_id");
        this.sdkPlatform = Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public AdjustEventSuccess getSuccessResponseData() {
        String str;
        String str2;
        String str3;
        if (!this.success) {
            return null;
        }
        AdjustEventSuccess adjustEventSuccess = new AdjustEventSuccess();
        if ("unity".equals(this.sdkPlatform)) {
            String str4 = this.eventToken;
            if (str4 == null) {
                str4 = "";
            }
            adjustEventSuccess.eventToken = str4;
            if (this.message != null) {
                str = this.message;
            } else {
                str = "";
            }
            adjustEventSuccess.message = str;
            if (this.timestamp != null) {
                str2 = this.timestamp;
            } else {
                str2 = "";
            }
            adjustEventSuccess.timestamp = str2;
            if (this.adid != null) {
                str3 = this.adid;
            } else {
                str3 = "";
            }
            adjustEventSuccess.adid = str3;
            String str5 = this.callbackId;
            if (str5 == null) {
                str5 = "";
            }
            adjustEventSuccess.callbackId = str5;
            adjustEventSuccess.jsonResponse = this.jsonResponse != null ? this.jsonResponse : new JSONObject();
        } else {
            adjustEventSuccess.eventToken = this.eventToken;
            adjustEventSuccess.message = this.message;
            adjustEventSuccess.timestamp = this.timestamp;
            adjustEventSuccess.adid = this.adid;
            adjustEventSuccess.callbackId = this.callbackId;
            adjustEventSuccess.jsonResponse = this.jsonResponse;
        }
        return adjustEventSuccess;
    }

    public AdjustEventFailure getFailureResponseData() {
        String str;
        String str2;
        String str3;
        if (this.success) {
            return null;
        }
        AdjustEventFailure adjustEventFailure = new AdjustEventFailure();
        if ("unity".equals(this.sdkPlatform)) {
            String str4 = this.eventToken;
            if (str4 == null) {
                str4 = "";
            }
            adjustEventFailure.eventToken = str4;
            if (this.message != null) {
                str = this.message;
            } else {
                str = "";
            }
            adjustEventFailure.message = str;
            if (this.timestamp != null) {
                str2 = this.timestamp;
            } else {
                str2 = "";
            }
            adjustEventFailure.timestamp = str2;
            if (this.adid != null) {
                str3 = this.adid;
            } else {
                str3 = "";
            }
            adjustEventFailure.adid = str3;
            String str5 = this.callbackId;
            if (str5 == null) {
                str5 = "";
            }
            adjustEventFailure.callbackId = str5;
            adjustEventFailure.willRetry = this.willRetry;
            adjustEventFailure.jsonResponse = this.jsonResponse != null ? this.jsonResponse : new JSONObject();
        } else {
            adjustEventFailure.eventToken = this.eventToken;
            adjustEventFailure.message = this.message;
            adjustEventFailure.timestamp = this.timestamp;
            adjustEventFailure.adid = this.adid;
            adjustEventFailure.callbackId = this.callbackId;
            adjustEventFailure.willRetry = this.willRetry;
            adjustEventFailure.jsonResponse = this.jsonResponse;
        }
        return adjustEventFailure;
    }
}
