package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcyb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwp<S extends zzcyb<?>> implements zzcye<S> {
    private final ScheduledExecutorService zzffm;
    private final zzcye<S> zzgiy;
    private final long zzgjn;

    public zzcwp(zzcye<S> zzcye, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zzgiy = zzcye;
        this.zzgjn = j;
        this.zzffm = scheduledExecutorService;
    }

    public final zzdof<S> zzapb() {
        zzdof<S> zzapb = this.zzgiy.zzapb();
        long j = this.zzgjn;
        if (j > 0) {
            zzapb = zzdnt.zza(zzapb, j, TimeUnit.MILLISECONDS, this.zzffm);
        }
        return zzdnt.zzb(zzapb, Throwable.class, zzcws.zzblf, zzazq.zzdxp);
    }
}
