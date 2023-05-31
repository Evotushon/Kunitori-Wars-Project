package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdht {
    private final E zzgur;
    private final List<zzdof<?>> zzguu;
    private final /* synthetic */ zzdhr zzguv;

    private zzdht(zzdhr zzdhr, E e, List<zzdof<?>> list) {
        this.zzguv = zzdhr;
        this.zzgur = e;
        this.zzguu = list;
    }

    public final <O> zzdhx<O> zzb(Callable<O> callable) {
        zzdny<V> zzi = zzdnt.zzi(this.zzguu);
        zzdof<C> zza = zzi.zza(zzdhw.zzgjg, zzazq.zzdxp);
        zzdhr zzdhr = this.zzguv;
        return new zzdhx(zzdhr, this.zzgur, (String) null, zza, this.zzguu, zzi.zza(callable, zzdhr.zzfrv), (zzdhu) null);
    }
}
