package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpa implements zzeej<zzbuv<zzbqu>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzcgi> zzffc;

    private zzbpa(zzeew<zzcgi> zzeew, zzeew<Executor> zzeew2) {
        this.zzffc = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzbpa zzj(zzeew<zzcgi> zzeew, zzeew<Executor> zzeew2) {
        return new zzbpa(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
