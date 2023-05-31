package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzczn implements zzcye<zzcyb<JSONObject>> {
    private final JSONObject zzglq;

    zzczn(Context context) {
        this.zzglq = zzarj.zzaa(context);
    }

    public final zzdof<zzcyb<JSONObject>> zzapb() {
        return zzdnt.zzaj(new zzczq(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zzglq);
        } catch (JSONException unused) {
            zzawf.zzee("Failed putting version constants.");
        }
    }
}
