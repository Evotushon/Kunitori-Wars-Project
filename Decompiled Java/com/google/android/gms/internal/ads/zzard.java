package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzard {
    private final int errorCode;
    private final String type;
    private String url;
    private final String zzdkd;
    private final String zzdmp;
    private final boolean zzdmq;
    private final String zzdnd;
    private final List<String> zzdnf;
    private final String zzdng;
    private final String zzdnh;
    private final boolean zzdni;
    private final String zzdnj;
    private final boolean zzdnk;
    private final JSONObject zzdnl;

    public zzard(JSONObject jSONObject) {
        List<String> list;
        this.url = jSONObject.optString(ImagesContract.URL);
        this.zzdng = jSONObject.optString("base_uri");
        this.zzdnh = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i = 1;
        this.zzdni = optString != null && (optString.equals("1") || optString.equals("true"));
        this.zzdkd = jSONObject.optString("request_id");
        this.type = jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        if (optString2 == null) {
            list = null;
        } else {
            list = Arrays.asList(optString2.split(","));
        }
        this.zzdnf = list;
        this.errorCode = jSONObject.optInt("valid", 0) == 1 ? -2 : i;
        this.zzdnj = jSONObject.optString("fetched_ad");
        this.zzdnk = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.zzdnl = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.zzdmp = jSONObject.optString("analytics_query_ad_event_id");
        this.zzdmq = jSONObject.optBoolean("is_analytics_logging_enabled");
        this.zzdnd = jSONObject.optString("pool_key");
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final List<String> zzuf() {
        return this.zzdnf;
    }

    public final String zzug() {
        return this.zzdng;
    }

    public final String zzuh() {
        return this.zzdnh;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzui() {
        return this.zzdni;
    }

    public final JSONObject zzuj() {
        return this.zzdnl;
    }

    public final String zzuk() {
        return this.zzdnd;
    }
}
