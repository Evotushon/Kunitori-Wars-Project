package com.google.android.gms.ads.query;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzazh;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class AdInfo {
    private final QueryInfo zzgwj;
    private final String zzgwk;

    @KeepForSdk
    public static String getRequestId(String str) {
        if (str == null) {
            zzazh.zzfa("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            zzazh.zzfa("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    @KeepForSdk
    public AdInfo(QueryInfo queryInfo, String str) {
        this.zzgwj = queryInfo;
        this.zzgwk = str;
    }

    @KeepForSdk
    public QueryInfo getQueryInfo() {
        return this.zzgwj;
    }

    @KeepForSdk
    public String getAdString() {
        return this.zzgwk;
    }
}
