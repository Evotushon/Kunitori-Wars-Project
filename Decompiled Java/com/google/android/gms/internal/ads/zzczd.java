package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczd implements zzcyb<JSONObject> {
    private String zzglj;

    public zzczd(String str) {
        this.zzglj = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            JSONObject zzb = zzayf.zzb((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.zzglj)) {
                zzb.put("attok", this.zzglj);
            }
        } catch (JSONException e) {
            zzawf.zza("Failed putting attestation token.", e);
        }
    }
}
