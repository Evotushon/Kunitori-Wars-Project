package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcfh implements zzeej<zzbuv<zzbth>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzcfp> zzffc;

    private zzcfh(zzeew<zzcfp> zzeew, zzeew<Executor> zzeew2) {
        this.zzffc = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzcfh zzw(zzeew<zzcfp> zzeew, zzeew<Executor> zzeew2) {
        return new zzcfh(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
