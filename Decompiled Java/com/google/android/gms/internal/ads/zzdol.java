package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdol extends zzdoi implements zzdoe, ScheduledExecutorService {
    private final ScheduledExecutorService zzhdl;

    zzdol(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.zzhdl = (ScheduledExecutorService) zzdlg.checkNotNull(scheduledExecutorService);
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdon zzdon = new zzdon(runnable);
        return new zzdok(zzdon, this.zzhdl.scheduleWithFixedDelay(zzdon, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdon zzdon = new zzdon(runnable);
        return new zzdok(zzdon, this.zzhdl.scheduleAtFixedRate(zzdon, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzdot zze = zzdot.zze(callable);
        return new zzdok(zze, this.zzhdl.schedule(zze, j, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzdot zza = zzdot.zza(runnable, null);
        return new zzdok(zza, this.zzhdl.schedule(zza, j, timeUnit));
    }
}
