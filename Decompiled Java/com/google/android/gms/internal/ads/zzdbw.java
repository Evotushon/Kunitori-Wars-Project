package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbpr;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdbw<R extends zzbpr<AdT>, AdT extends zzbnf> implements zzdgv<AdT> {
    private final zzdco<R, zzdgk<AdT>> zzgnq;

    public zzdbw(zzdco<R, zzdgk<AdT>> zzdco) {
        this.zzgnq = zzdco;
    }

    public final void zzb(Throwable th) {
    }

    public final zzdof<zzdgk<AdT>> zza(zzdgy zzdgy) {
        zzdbv zzdbv = (zzdbv) zzdgy;
        return this.zzgnq.zza(zzdbv.zzgnv, zzdbv.zzgnu);
    }

    public final void zza(zzdgk<AdT> zzdgk) {
        zzdgk.zzgtk = ((zzbpr) this.zzgnq.zzaqj()).zzadx();
    }
}
