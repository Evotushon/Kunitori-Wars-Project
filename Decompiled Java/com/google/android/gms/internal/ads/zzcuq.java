package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcuq implements zzcye<zzcun> {
    private final Executor executor;
    private final ScheduledExecutorService zzfib;
    private final Context zzur;

    public zzcuq(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor2) {
        this.zzur = context;
        this.zzfib = scheduledExecutorService;
        this.executor = executor2;
    }

    public final zzdof<zzcun> zzapb() {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcrj)).booleanValue()) {
            return zzdnt.zzaj(null);
        }
        zzazy zzazy = new zzazy();
        try {
            new zzcup(zzazy).zzbm(false);
        } catch (Throwable unused) {
            zzawf.zzey("ArCoreApk is not ready.");
            zzazy.set(false);
        }
        return zzdnt.zzb(zzdnt.zzb(zzdnt.zza(zzazy, 200, TimeUnit.MILLISECONDS, this.zzfib), new zzcus(this), this.executor), Throwable.class, zzcur.zzblf, this.executor);
    }
}
