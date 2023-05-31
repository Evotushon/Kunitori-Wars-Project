package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwl implements zzeej<zzbuv<zzbqh>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzbxg> zzffv;
    private final zzbvz zzfmc;

    private zzbwl(zzbvz zzbvz, zzeew<zzbxg> zzeew, zzeew<Executor> zzeew2) {
        this.zzfmc = zzbvz;
        this.zzffv = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzbwl zzb(zzbvz zzbvz, zzeew<zzbxg> zzeew, zzeew<Executor> zzeew2) {
        return new zzbwl(zzbvz, zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffv.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
