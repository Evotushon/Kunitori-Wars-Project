package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczw implements zzcyb<JSONObject> {
    private List<String> zzdke;

    public zzczw(List<String> list) {
        this.zzdke = list;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.zzdke));
        } catch (JSONException unused) {
            zzawf.zzee("Failed putting experiment ids.");
        }
    }
}
