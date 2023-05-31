package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcim implements zzeej<zzbuv<zzbsn>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzcjt> zzffc;

    private zzcim(zzeew<zzcjt> zzeew, zzeew<Executor> zzeew2) {
        this.zzffc = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzcim zzah(zzeew<zzcjt> zzeew, zzeew<Executor> zzeew2) {
        return new zzcim(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
