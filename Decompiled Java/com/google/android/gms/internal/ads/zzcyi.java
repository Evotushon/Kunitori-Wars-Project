package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyi<T> implements zzeej<zzcyd<T>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<Set<zzcye<? extends zzcyb<T>>>> zzgkw;

    private zzcyi(zzeew<Executor> zzeew, zzeew<Set<zzcye<? extends zzcyb<T>>>> zzeew2) {
        this.zzfev = zzeew;
        this.zzgkw = zzeew2;
    }

    public static <T> zzcyi<T> zzba(zzeew<Executor> zzeew, zzeew<Set<zzcye<? extends zzcyb<T>>>> zzeew2) {
        return new zzcyi<>(zzeew, zzeew2);
    }

    public static <T> zzcyd<T> zza(Executor executor, Set<zzcye<? extends zzcyb<T>>> set) {
        return new zzcyd<>(executor, set);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfev.get(), this.zzgkw.get());
    }
}
