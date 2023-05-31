package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzm implements zzeej<zzbuv<zzbsg>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzcsf> zzffc;

    private zzbzm(zzeew<zzcsf> zzeew, zzeew<Executor> zzeew2) {
        this.zzffc = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzbzm zzq(zzeew<zzcsf> zzeew, zzeew<Executor> zzeew2) {
        return new zzbzm(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
