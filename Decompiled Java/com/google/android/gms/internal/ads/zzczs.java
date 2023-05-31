package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczs implements zzcyb<JSONObject> {
    private String zzglt;
    private String zzglu;

    public zzczs(String str, String str2) {
        this.zzglt = str;
        this.zzglu = str2;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            JSONObject zzb = zzayf.zzb((JSONObject) obj, "pii");
            zzb.put("doritos", this.zzglt);
            zzb.put("doritos_v2", this.zzglu);
        } catch (JSONException unused) {
            zzawf.zzee("Failed putting doritos string.");
        }
    }
}
