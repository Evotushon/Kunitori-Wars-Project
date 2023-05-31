package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdop<V> extends zzdnn<V> {
    /* access modifiers changed from: private */
    @NullableDecl
    public zzdof<V> zzhdn;
    /* access modifiers changed from: private */
    @NullableDecl
    public ScheduledFuture<?> zzhdo;

    static <V> zzdof<V> zzb(zzdof<V> zzdof, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzdop zzdop = new zzdop(zzdof);
        zzdor zzdor = new zzdor(zzdop);
        zzdop.zzhdo = scheduledExecutorService.schedule(zzdor, j, timeUnit);
        zzdof.addListener(zzdor, zzdnm.INSTANCE);
        return zzdop;
    }

    private zzdop(zzdof<V> zzdof) {
        this.zzhdn = (zzdof) zzdlg.checkNotNull(zzdof);
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        zzdof<V> zzdof = this.zzhdn;
        ScheduledFuture<?> scheduledFuture = this.zzhdo;
        if (zzdof == null) {
            return null;
        }
        String valueOf = String.valueOf(zzdof);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhdn);
        ScheduledFuture<?> scheduledFuture = this.zzhdo;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzhdn = null;
        this.zzhdo = null;
    }
}
