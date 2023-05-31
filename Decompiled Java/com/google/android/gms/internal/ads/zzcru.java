package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcru implements zzeej<zzcrq> {
    private final zzeew<Executor> zzfev;

    public zzcru(zzeew<Executor> zzeew) {
        this.zzfev = zzeew;
    }

    public final /* synthetic */ Object get() {
        return new zzcrq(this.zzfev.get());
    }
}
