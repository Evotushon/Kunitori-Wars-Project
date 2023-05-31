package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcys implements zzcye<zzcyp> {
    private final Executor executor;
    private final ScheduledExecutorService zzfib;
    private final zzavn zzglb;
    private final Context zzur;

    public zzcys(zzavn zzavn, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor2) {
        this.zzglb = zzavn;
        this.zzur = context;
        this.zzfib = scheduledExecutorService;
        this.executor = executor2;
    }

    public final zzdof<zzcyp> zzapb() {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcjw)).booleanValue()) {
            return zzdnt.immediateFailedFuture(new Exception("Did not ad Ad ID into query param."));
        }
        return zzdno.zzg(this.zzglb.zzam(this.zzur)).zza(zzcyr.zzdpv, this.executor).zza(((Long) zzvh.zzpd().zzd(zzzx.zzcjx)).longValue(), TimeUnit.MILLISECONDS, this.zzfib).zza(Throwable.class, new zzcyu(this), this.executor);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcyp zze(Throwable th) {
        zzvh.zzoz();
        return new zzcyp((AdvertisingIdClient.Info) null, zzayx.zzbm(this.zzur));
    }
}
