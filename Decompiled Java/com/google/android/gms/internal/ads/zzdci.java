package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpr;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdci<R extends zzbpr<? extends zzbnf>> {
    private final Executor executor;
    private final zzdcq<R> zzgnu;
    private final zzdfz zzgnx;
    private final zzdcn zzgoe;
    /* access modifiers changed from: private */
    public zzdcm zzgof;

    public zzdci(zzdfz zzdfz, zzdcn zzdcn, zzdcq<R> zzdcq, Executor executor2) {
        this.zzgnx = zzdfz;
        this.zzgoe = zzdcn;
        this.zzgnu = zzdcq;
        this.executor = executor2;
    }

    public final zzdof<zzdcm> zzaqo() {
        zzdof zzdof;
        zzdcm zzdcm = this.zzgof;
        if (zzdcm != null) {
            return zzdnt.zzaj(zzdcm);
        }
        if (!zzabn.zzcvg.get().booleanValue()) {
            this.zzgof = new zzdcm((zzaqx) null, zzaqp(), (zzdck) null);
            zzdof = zzdnt.zzaj(this.zzgof);
        } else {
            zzdof = zzdno.zzg(((zzbpr) this.zzgnu.zzc(this.zzgoe).zza(new zzdby(this.zzgnx.zzari().zzgsv)).zzadi()).zzadx().zza(this.zzgnx.zzari())).zza(new zzdcj(this), this.executor).zza(zzcjv.class, new zzdck(this), this.executor);
        }
        return zzdnt.zzb(zzdof, zzdch.zzdpv, this.executor);
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzdgj zzaqp() {
        zzdeu zzaef = ((zzbpr) this.zzgnu.zzc(this.zzgoe).zzadi()).zzaef();
        return this.zzgnx.zza(zzaef.zzgqq, zzaef.zzgqr, zzaef.zzgqu);
    }
}
