package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzboa implements zzeej<zzbuv<zzbrw>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzbsb> zzffc;

    private zzboa(zzeew<zzbsb> zzeew, zzeew<Executor> zzeew2) {
        this.zzffc = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzboa zzb(zzeew<zzbsb> zzeew, zzeew<Executor> zzeew2) {
        return new zzboa(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
