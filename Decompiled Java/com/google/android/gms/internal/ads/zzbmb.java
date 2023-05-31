package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbmb implements zzeej<zzbuv<zzpt>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzbna> zzffv;
    private final zzbln zzfgr;

    public zzbmb(zzbln zzbln, zzeew<zzbna> zzeew, zzeew<Executor> zzeew2) {
        this.zzfgr = zzbln;
        this.zzffv = zzeew;
        this.zzfev = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffv.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
