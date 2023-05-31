package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzboq implements zzeej<zzbuv<zztz>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzbjq> zzffv;

    private zzboq(zzeew<zzbjq> zzeew, zzeew<Executor> zzeew2) {
        this.zzffv = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzboq zze(zzeew<zzbjq> zzeew, zzeew<Executor> zzeew2) {
        return new zzboq(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffv.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
