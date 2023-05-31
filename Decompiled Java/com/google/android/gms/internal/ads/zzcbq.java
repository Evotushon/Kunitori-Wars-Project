package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcbq implements zzeej<zzcbm> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzcbc> zzfsl;

    public zzcbq(zzeew<Executor> zzeew, zzeew<zzcbc> zzeew2) {
        this.zzfev = zzeew;
        this.zzfsl = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return new zzcbm(this.zzfev.get(), this.zzfsl.get());
    }
}
