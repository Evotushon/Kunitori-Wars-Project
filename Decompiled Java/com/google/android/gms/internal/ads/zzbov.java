package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbov implements zzeej<zzbuv<zzbrn>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzbjq> zzffv;

    private zzbov(zzeew<zzbjq> zzeew, zzeew<Executor> zzeew2) {
        this.zzffv = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzbov zzi(zzeew<zzbjq> zzeew, zzeew<Executor> zzeew2) {
        return new zzbov(zzeew, zzeew2);
    }

    public static zzbuv<zzbrn> zza(zzbjq zzbjq, Executor executor) {
        return (zzbuv) zzeep.zza(new zzbuv(zzbjq, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzffv.get(), this.zzfev.get());
    }
}
