package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzayn {
    private final Object lock = new Object();
    private long zzdvz;
    @GuardedBy("lock")
    private long zzdwa = Long.MIN_VALUE;

    public zzayn(long j) {
        this.zzdvz = j;
    }

    public final boolean tryAcquire() {
        synchronized (this.lock) {
            long elapsedRealtime = zzq.zzlc().elapsedRealtime();
            if (this.zzdwa + this.zzdvz > elapsedRealtime) {
                return false;
            }
            this.zzdwa = elapsedRealtime;
            return true;
        }
    }

    public final void zzfb(long j) {
        synchronized (this.lock) {
            this.zzdvz = j;
        }
    }
}
