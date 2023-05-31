package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdaa implements zzcye<zzczx> {
    private ApplicationInfo applicationInfo;
    private boolean zzdna;
    private ScheduledExecutorService zzfib;
    private zzalb zzglx;

    public zzdaa(zzalb zzalb, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo2) {
        this.zzglx = zzalb;
        this.zzfib = scheduledExecutorService;
        this.zzdna = z;
        this.applicationInfo = applicationInfo2;
    }

    public final zzdof<zzczx> zzapb() {
        if (!this.zzdna) {
            return zzdnt.immediateFailedFuture(new Exception("Auto Collect Location is false."));
        }
        return zzdnt.zzb(zzdnt.zza(this.zzglx.zza(this.applicationInfo), ((Long) zzvh.zzpd().zzd(zzzx.zzcnj)).longValue(), TimeUnit.MILLISECONDS, this.zzfib), zzczz.zzdpv, (Executor) zzazq.zzdxk);
    }
}
