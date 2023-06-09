package com.adjust.sdk;

import org.json.JSONObject;

public class ResponseData {
    public ActivityKind activityKind;
    public String adid;
    public AdjustAttribution attribution;
    public JSONObject jsonResponse;
    public String message;
    public boolean success;
    public String timestamp;
    public TrackingState trackingState;
    public boolean willRetry;

    protected ResponseData() {
    }

    /* renamed from: com.adjust.sdk.ResponseData$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adjust$sdk$ActivityKind = new int[ActivityKind.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.adjust.sdk.ActivityKind[] r0 = com.adjust.sdk.ActivityKind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$adjust$sdk$ActivityKind = r0
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.SESSION     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x001f }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.CLICK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x002a }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.ATTRIBUTION     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.EVENT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.ResponseData.AnonymousClass1.<clinit>():void");
        }
    }

    public static ResponseData buildResponseData(ActivityPackage activityPackage) {
        ResponseData responseData;
        ResponseData responseData2;
        ActivityKind activityKind2 = activityPackage.getActivityKind();
        int i = AnonymousClass1.$SwitchMap$com$adjust$sdk$ActivityKind[activityKind2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                responseData = new SdkClickResponseData();
            } else if (i == 3) {
                responseData = new AttributionResponseData();
            } else if (i != 4) {
                responseData = new ResponseData();
            } else {
                responseData2 = new EventResponseData(activityPackage);
            }
            responseData.activityKind = activityKind2;
            return responseData;
        }
        responseData2 = new SessionResponseData(activityPackage);
        responseData = responseData2;
        responseData.activityKind = activityKind2;
        return responseData;
    }

    public String toString() {
        return Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}
