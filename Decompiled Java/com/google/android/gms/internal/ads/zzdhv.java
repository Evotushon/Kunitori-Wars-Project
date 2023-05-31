package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdhv {
    private final E zzgur;
    private final /* synthetic */ zzdhr zzguv;

    private zzdhv(zzdhr zzdhr, E e) {
        this.zzguv = zzdhr;
        this.zzgur = e;
    }

    public final <O> zzdhx<O> zze(zzdof<O> zzdof) {
        return new zzdhx(this.zzguv, this.zzgur, (String) null, zzdhr.zzgup, Collections.emptyList(), zzdof, (zzdhu) null);
    }

    public final <O> zzdhx<O> zzc(Callable<O> callable) {
        return zza(callable, this.zzguv.zzfrv);
    }

    private final <O> zzdhx<O> zza(Callable<O> callable, zzdoe zzdoe) {
        return new zzdhx(this.zzguv, this.zzgur, (String) null, zzdhr.zzgup, Collections.emptyList(), zzdoe.zzd(callable), (zzdhu) null);
    }

    public final zzdhx<?> zza(zzdhp zzdhp, zzdoe zzdoe) {
        return zza(new zzdhy(zzdhp), zzdoe);
    }
}
