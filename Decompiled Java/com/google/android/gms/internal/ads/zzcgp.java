package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgp implements zzeej<zzbuv<zzdil>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzcgs> zzffc;

    private zzcgp(zzeew<zzcgs> zzeew, zzeew<Executor> zzeew2) {
        this.zzffc = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzcgp zzaf(zzeew<zzcgs> zzeew, zzeew<Executor> zzeew2) {
        return new zzcgp(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
