package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcey implements zzeej<zzceu> {
    private final zzeew<Executor> zzfev;

    public zzcey(zzeew<Executor> zzeew) {
        this.zzfev = zzeew;
    }

    public final /* synthetic */ Object get() {
        return new zzceu(this.zzfev.get());
    }
}
