package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzccx implements zzdng {
    private final String zzczs;
    private final zzccv zzfti;
    private final JSONObject zzftm;

    zzccx(zzccv zzccv, String str, JSONObject jSONObject) {
        this.zzfti = zzccv;
        this.zzczs = str;
        this.zzftm = jSONObject;
    }

    public final zzdof zzf(Object obj) {
        return this.zzfti.zza(this.zzczs, this.zzftm, (zzbdv) obj);
    }
}
