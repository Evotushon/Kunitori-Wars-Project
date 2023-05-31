package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwn implements zzeej<zzbuv<zzbsr>> {
    private final zzeew<Executor> zzfev;
    private final zzbvz zzfmc;

    private zzbwn(zzbvz zzbvz, zzeew<Executor> zzeew) {
        this.zzfmc = zzbvz;
        this.zzfev = zzeew;
    }

    public static zzbwn zzd(zzbvz zzbvz, zzeew<Executor> zzeew) {
        return new zzbwn(zzbvz, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(this.zzfmc.zzb(this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
