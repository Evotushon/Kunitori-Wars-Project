package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcuj implements zzeej<zzcui> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzavr> zzgic;

    private zzcuj(zzeew<Executor> zzeew, zzeew<zzavr> zzeew2) {
        this.zzfev = zzeew;
        this.zzgic = zzeew2;
    }

    public static zzcuj zzar(zzeew<Executor> zzeew, zzeew<zzavr> zzeew2) {
        return new zzcuj(zzeew, zzeew2);
    }

    public static zzcui zza(Executor executor, zzavr zzavr) {
        return new zzcui(executor, zzavr);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfev.get(), this.zzgic.get());
    }
}
