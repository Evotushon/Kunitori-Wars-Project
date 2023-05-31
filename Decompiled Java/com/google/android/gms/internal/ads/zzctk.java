package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctk implements zzeej<zzcti> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzcjk> zzghp;

    public zzctk(zzeew<Executor> zzeew, zzeew<zzcjk> zzeew2) {
        this.zzfev = zzeew;
        this.zzghp = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return new zzcti(this.zzfev.get(), this.zzghp.get());
    }
}
