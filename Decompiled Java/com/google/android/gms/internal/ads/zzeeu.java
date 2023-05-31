package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeeu<T> {
    private final List<zzeew<T>> zzign;
    private final List<zzeew<Collection<T>>> zzigo;

    private zzeeu(int i, int i2) {
        this.zzign = zzeei.zzhi(i);
        this.zzigo = zzeei.zzhi(i2);
    }

    public final zzeeu<T> zzas(zzeew<? extends T> zzeew) {
        this.zzign.add(zzeew);
        return this;
    }

    public final zzeeu<T> zzat(zzeew<? extends Collection<? extends T>> zzeew) {
        this.zzigo.add(zzeew);
        return this;
    }

    public final zzees<T> zzbgo() {
        return new zzees<>(this.zzign, this.zzigo);
    }
}
