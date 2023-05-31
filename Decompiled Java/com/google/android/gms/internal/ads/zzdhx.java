package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdhx<O> {
    private final E zzgur;
    @Nullable
    private final String zzgus;
    private final List<zzdof<?>> zzguu;
    final /* synthetic */ zzdhr zzguv;
    private final zzdof<?> zzguw;
    private final zzdof<O> zzgux;

    private zzdhx(zzdhr zzdhr, E e, String str, zzdof<?> zzdof, List<zzdof<?>> list, zzdof<O> zzdof2) {
        this.zzguv = zzdhr;
        this.zzgur = e;
        this.zzgus = str;
        this.zzguw = zzdof;
        this.zzguu = list;
        this.zzgux = zzdof2;
    }

    public final zzdhx<O> zzgq(String str) {
        return new zzdhx(this.zzguv, this.zzgur, str, this.zzguw, this.zzguu, this.zzgux);
    }

    public final <O2> zzdhx<O2> zzb(zzdhq<O, O2> zzdhq) {
        return zza(new zzdia(zzdhq));
    }

    public final <O2> zzdhx<O2> zza(zzdng<O, O2> zzdng) {
        return zza(zzdng, (Executor) this.zzguv.zzfrv);
    }

    private final <O2> zzdhx<O2> zza(zzdng<O, O2> zzdng, Executor executor) {
        return new zzdhx(this.zzguv, this.zzgur, this.zzgus, this.zzguw, this.zzguu, zzdnt.zzb(this.zzgux, zzdng, executor));
    }

    public final <O2> zzdhx<O2> zze(zzdof<O2> zzdof) {
        return zza(new zzdhz(zzdof), (Executor) zzazq.zzdxp);
    }

    public final <T extends Throwable> zzdhx<O> zza(Class<T> cls, zzdhq<T, O> zzdhq) {
        return zza(cls, new zzdic(zzdhq));
    }

    public final <T extends Throwable> zzdhx<O> zza(Class<T> cls, zzdng<T, O> zzdng) {
        zzdhr zzdhr = this.zzguv;
        return new zzdhx(zzdhr, this.zzgur, this.zzgus, this.zzguw, this.zzguu, zzdnt.zzb(this.zzgux, cls, zzdng, zzdhr.zzfrv));
    }

    public final zzdhx<O> zza(long j, TimeUnit timeUnit) {
        zzdhr zzdhr = this.zzguv;
        return new zzdhx(zzdhr, this.zzgur, this.zzgus, this.zzguw, this.zzguu, zzdnt.zza(this.zzgux, j, timeUnit, zzdhr.zzffm));
    }

    public final zzdhs<E, O> zzata() {
        E e = this.zzgur;
        String str = this.zzgus;
        if (str == null) {
            str = this.zzguv.zzv(e);
        }
        zzdhs<E, O> zzdhs = new zzdhs<>(e, str, this.zzgux);
        this.zzguv.zzguq.zza(zzdhs);
        this.zzguw.addListener(new zzdib(this, zzdhs), zzazq.zzdxp);
        zzdnt.zza(zzdhs, new zzdie(this, zzdhs), zzazq.zzdxp);
        return zzdhs;
    }

    public final zzdhx<O> zzw(E e) {
        return this.zzguv.zza(e, zzata());
    }

    /* synthetic */ zzdhx(zzdhr zzdhr, Object obj, String str, zzdof zzdof, List list, zzdof zzdof2, zzdhu zzdhu) {
        this(zzdhr, obj, (String) null, zzdof, list, zzdof2);
    }
}
