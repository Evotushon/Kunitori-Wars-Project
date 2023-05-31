package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzdng;
import com.google.android.gms.internal.ads.zzdnt;
import com.google.android.gms.internal.ads.zzdof;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzf implements zzdng {
    static final zzdng zzblf = new zzf();

    private zzf() {
    }

    public final zzdof zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzq.zzkz().zzvk().zzeh(jSONObject.getString("appSettingsJson"));
        }
        return zzdnt.zzaj(null);
    }
}
