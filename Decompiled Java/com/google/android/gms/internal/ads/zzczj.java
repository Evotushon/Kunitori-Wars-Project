package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczj implements zzcyb<JSONObject> {
    private JSONObject zzglm;

    public zzczj(JSONObject jSONObject) {
        this.zzglm = jSONObject;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.zzglm);
        } catch (JSONException unused) {
            zzawf.zzee("Unable to get cache_state");
        }
    }
}
