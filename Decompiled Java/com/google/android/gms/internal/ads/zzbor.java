package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbor implements zzeej<zzbuv<zzbva>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzbvd> zzffv;

    private zzbor(zzeew<zzbvd> zzeew, zzeew<Executor> zzeew2) {
        this.zzffv = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzbor zzf(zzeew<zzbvd> zzeew, zzeew<Executor> zzeew2) {
        return new zzbor(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffv.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
