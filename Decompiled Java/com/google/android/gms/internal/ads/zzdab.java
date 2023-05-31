package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzq;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdab implements zzcyb<JSONObject> {
    private Bundle zzgly;

    public zzdab(Bundle bundle) {
        this.zzgly = bundle;
    }

    public final /* synthetic */ void zzs(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zzgly != null) {
            try {
                zzayf.zzb(zzayf.zzb(jSONObject, "device"), "play_store").put("parental_controls", zzq.zzkv().zzd(this.zzgly));
            } catch (JSONException unused) {
                zzawf.zzee("Failed putting parental controls bundle.");
            }
        }
    }
}
