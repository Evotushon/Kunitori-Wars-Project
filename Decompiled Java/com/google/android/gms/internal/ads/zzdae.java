package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdae implements zzcye<zzdab> {
    private ScheduledExecutorService zzfib;
    private zzapj zzgma;
    private Context zzur;

    public zzdae(zzapj zzapj, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzgma = zzapj;
        this.zzfib = scheduledExecutorService;
        this.zzur = context;
    }

    public final zzdof<zzdab> zzapb() {
        return zzdnt.zzb(zzdnt.zza(this.zzgma.zzs(this.zzur), ((Long) zzvh.zzpd().zzd(zzzx.zzcnr)).longValue(), TimeUnit.MILLISECONDS, this.zzfib), zzdad.zzdpv, (Executor) zzazq.zzdxk);
    }
}
