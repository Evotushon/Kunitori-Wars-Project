package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdny<V> {
    private final boolean zzhcf;
    private final zzdlr<zzdof<? extends V>> zzhcz;

    private zzdny(boolean z, zzdlr<zzdof<? extends V>> zzdlr) {
        this.zzhcf = z;
        this.zzhcz = zzdlr;
    }

    public final <C> zzdof<C> zza(Callable<C> callable, Executor executor) {
        return new zzdnh(this.zzhcz, this.zzhcf, executor, callable);
    }

    /* synthetic */ zzdny(boolean z, zzdlr zzdlr, zzdnw zzdnw) {
        this(z, zzdlr);
    }
}
