package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbsf extends zzbtk<zzbsj> {
    private final Clock zzbmz;
    @GuardedBy("this")
    private boolean zzfey = false;
    private final ScheduledExecutorService zzffm;
    @GuardedBy("this")
    private long zzffo = -1;
    @GuardedBy("this")
    private long zzffp = -1;
    @GuardedBy("this")
    @Nullable
    private ScheduledFuture<?> zzfkq;

    public zzbsf(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzffm = scheduledExecutorService;
        this.zzbmz = clock;
    }

    public final synchronized void onPause() {
        if (!this.zzfey) {
            if (this.zzfkq == null || this.zzfkq.isCancelled()) {
                this.zzffp = -1;
            } else {
                this.zzfkq.cancel(true);
                this.zzffp = this.zzffo - this.zzbmz.elapsedRealtime();
            }
            this.zzfey = true;
        }
    }

    public final synchronized void onResume() {
        if (this.zzfey) {
            if (this.zzffp > 0 && this.zzfkq.isCancelled()) {
                zzfd(this.zzffp);
            }
            this.zzfey = false;
        }
    }

    public final synchronized void zzaic() {
        this.zzfey = false;
        zzfd(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzdg(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 > 0) goto L_0x0005
            monitor-exit(r6)
            return
        L_0x0005:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0043 }
            long r1 = (long) r7     // Catch:{ all -> 0x0043 }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x0043 }
            boolean r7 = r6.zzfey     // Catch:{ all -> 0x0043 }
            if (r7 == 0) goto L_0x0025
            long r2 = r6.zzffp     // Catch:{ all -> 0x0043 }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x001f
            long r2 = r6.zzffp     // Catch:{ all -> 0x0043 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            long r0 = r6.zzffp     // Catch:{ all -> 0x0043 }
        L_0x0021:
            r6.zzffp = r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r6)
            return
        L_0x0025:
            com.google.android.gms.common.util.Clock r7 = r6.zzbmz     // Catch:{ all -> 0x0043 }
            long r2 = r7.elapsedRealtime()     // Catch:{ all -> 0x0043 }
            long r4 = r6.zzffo     // Catch:{ all -> 0x0043 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x003e
            long r2 = r6.zzffo     // Catch:{ all -> 0x0043 }
            com.google.android.gms.common.util.Clock r7 = r6.zzbmz     // Catch:{ all -> 0x0043 }
            long r4 = r7.elapsedRealtime()     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0041
        L_0x003e:
            r6.zzfd(r0)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r6)
            return
        L_0x0043:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsf.zzdg(int):void");
    }

    private final synchronized void zzfd(long j) {
        if (this.zzfkq != null && !this.zzfkq.isDone()) {
            this.zzfkq.cancel(true);
        }
        this.zzffo = this.zzbmz.elapsedRealtime() + j;
        this.zzfkq = this.zzffm.schedule(new zzbsk(this), j, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    public final void zzaid() {
        zza(zzbsi.zzfkj);
    }
}
