package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcnt implements zzdku {
    private final zzdei zzfgp;
    private final zzbdv zzfsx;
    private final zzcnp zzgch;
    private final zzbvw zzgcm;

    zzcnt(zzcnp zzcnp, zzbdv zzbdv, zzdei zzdei, zzbvw zzbvw) {
        this.zzgch = zzcnp;
        this.zzfsx = zzbdv;
        this.zzfgp = zzdei;
        this.zzgcm = zzbvw;
    }

    public final Object apply(Object obj) {
        zzbdv zzbdv = this.zzfsx;
        zzdei zzdei = this.zzfgp;
        zzbvw zzbvw = this.zzgcm;
        if (zzdei.zzdnk) {
            zzbdv.zzaas();
        }
        zzbdv.zzzz();
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjj)).booleanValue()) {
            zzq.zzkx();
            zzawu.zza(zzbdv);
        }
        return zzbvw.zzaex();
    }
}
