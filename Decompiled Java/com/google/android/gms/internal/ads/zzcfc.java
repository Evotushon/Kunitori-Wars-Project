package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcfc implements zzeej<zzbuv<zztz>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzcfp> zzffc;

    private zzcfc(zzeew<zzcfp> zzeew, zzeew<Executor> zzeew2) {
        this.zzffc = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzcfc zzs(zzeew<zzcfp> zzeew, zzeew<Executor> zzeew2) {
        return new zzcfc(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
