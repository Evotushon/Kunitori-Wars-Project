package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbpr;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdbx<R extends zzbpr<AdT>, AdT extends zzbnf> implements zzdco<R, zzdcb<AdT>> {
    private final Executor executor;
    private final zzdfz zzgnx;
    private zzdnu<Void> zzgny = new zzdcc(this);

    public zzdbx(zzdfz zzdfz, Executor executor2) {
        this.zzgnx = zzdfz;
        this.executor = executor2;
    }

    public final /* bridge */ /* synthetic */ Object zzaqj() {
        return null;
    }

    public final zzdof<zzdcb<AdT>> zza(zzdcp zzdcp, zzdcq<R> zzdcq) {
        return zzdno.zzg(new zzdci(this.zzgnx, zzdcp.zzgoi, zzdcq, this.executor).zzaqo()).zzb(new zzdca(this, zzdcp, zzdcq), this.executor).zza(Exception.class, new zzdbz(this), this.executor);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdcp zzdcp, zzdcq zzdcq, zzdcm zzdcm) throws Exception {
        zzdgj zzdgj = zzdcm.zzgnw;
        zzaqx zzaqx = zzdcm.zzfyj;
        zzdgk<?> zza = zzdgj != null ? this.zzgnx.zza(zzdgj) : null;
        if (zzdgj == null) {
            return zzdnt.zzaj(null);
        }
        if (!(zza == null || zzaqx == null)) {
            zzdnt.zza(((zzbpr) zzdcq.zzc(zzdcp.zzgoi).zzadi()).zzadx().zzc(zzaqx), this.zzgny, this.executor);
        }
        return zzdnt.zzaj(new zzdcb(zzdgj, zzaqx, zza));
    }
}
