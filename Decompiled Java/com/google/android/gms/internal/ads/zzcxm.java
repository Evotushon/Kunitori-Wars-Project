package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxm implements zzcyb<Bundle> {
    private final String zzdql;
    private final String zzgjx;
    private final String zzgjy;
    private final String zzgjz;
    private final Long zzgka;

    public zzcxm(String str, String str2, String str3, String str4, Long l) {
        this.zzdql = str;
        this.zzgjx = str2;
        this.zzgjy = str3;
        this.zzgjz = str4;
        this.zzgka = l;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdez.zza(bundle, "gmp_app_id", this.zzdql);
        zzdez.zza(bundle, "fbs_aiid", this.zzgjx);
        zzdez.zza(bundle, "fbs_aeid", this.zzgjy);
        zzdez.zza(bundle, "apm_id_origin", this.zzgjz);
        Long l = this.zzgka;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
