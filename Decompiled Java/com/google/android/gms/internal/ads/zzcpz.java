package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcpz implements zzdku {
    private final zzdei zzfgp;
    private final zzbdv zzfsx;
    private final zzcpv zzgdo;
    private final zzcdp zzgdp;

    zzcpz(zzcpv zzcpv, zzbdv zzbdv, zzdei zzdei, zzcdp zzcdp) {
        this.zzgdo = zzcpv;
        this.zzfsx = zzbdv;
        this.zzfgp = zzdei;
        this.zzgdp = zzcdp;
    }

    public final Object apply(Object obj) {
        zzbdv zzbdv = this.zzfsx;
        zzdei zzdei = this.zzfgp;
        zzcdp zzcdp = this.zzgdp;
        if (zzdei.zzdnk) {
            zzbdv.zzaas();
        }
        zzbdv.zzzz();
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjj)).booleanValue()) {
            zzq.zzkx();
            zzawu.zza(zzbdv);
        }
        return zzcdp.zzafd();
    }
}
