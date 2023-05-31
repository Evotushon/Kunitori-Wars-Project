package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczk implements zzeej<zzczg> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzavn> zzevg;
    private final zzeew<Executor> zzfev;
    private final zzeew<ScheduledExecutorService> zzfst;
    private final zzeew<zzavr> zzgic;
    private final zzeew<Integer> zzgln;

    public zzczk(zzeew<zzavn> zzeew, zzeew<Integer> zzeew2, zzeew<Context> zzeew3, zzeew<zzavr> zzeew4, zzeew<ScheduledExecutorService> zzeew5, zzeew<Executor> zzeew6) {
        this.zzevg = zzeew;
        this.zzgln = zzeew2;
        this.zzelc = zzeew3;
        this.zzgic = zzeew4;
        this.zzfst = zzeew5;
        this.zzfev = zzeew6;
    }

    public final /* synthetic */ Object get() {
        return new zzczg(this.zzevg.get(), this.zzgln.get().intValue(), this.zzelc.get(), this.zzgic.get(), this.zzfst.get(), this.zzfev.get());
    }
}
