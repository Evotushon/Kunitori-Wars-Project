package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkf implements zzeej<zzbjs> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzpo> zzffe;
    private final zzeew<zzakt> zzfff;

    private zzbkf(zzeew<zzpo> zzeew, zzeew<zzakt> zzeew2, zzeew<Executor> zzeew3) {
        this.zzffe = zzeew;
        this.zzfff = zzeew2;
        this.zzfev = zzeew3;
    }

    public static zzbkf zzb(zzeew<zzpo> zzeew, zzeew<zzakt> zzeew2, zzeew<Executor> zzeew3) {
        return new zzbkf(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return (zzbjs) zzeep.zza(new zzbjs(this.zzffe.get().zzkr(), this.zzfff.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
