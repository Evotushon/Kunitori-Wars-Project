package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyt implements zzeej<zzcys> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzavn> zzevg;
    private final zzeew<Executor> zzfev;
    private final zzeew<ScheduledExecutorService> zzfst;

    public zzcyt(zzeew<zzavn> zzeew, zzeew<Context> zzeew2, zzeew<ScheduledExecutorService> zzeew3, zzeew<Executor> zzeew4) {
        this.zzevg = zzeew;
        this.zzelc = zzeew2;
        this.zzfst = zzeew3;
        this.zzfev = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return new zzcys(this.zzevg.get(), this.zzelc.get(), this.zzfst.get(), this.zzfev.get());
    }
}
