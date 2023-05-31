package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbko implements zzqk {
    private final Clock zzbmz;
    @GuardedBy("this")
    private Runnable zzdsu = null;
    private final ScheduledExecutorService zzffm;
    @GuardedBy("this")
    @Nullable
    private ScheduledFuture<?> zzffn;
    @GuardedBy("this")
    private long zzffo = -1;
    @GuardedBy("this")
    private long zzffp = -1;
    @GuardedBy("this")
    private boolean zzffq = false;

    public zzbko(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zzffm = scheduledExecutorService;
        this.zzbmz = clock;
        zzq.zzky().zza(this);
    }

    public final void zzp(boolean z) {
        if (z) {
            zzagb();
        } else {
            zzaga();
        }
    }

    public final synchronized void zza(int i, Runnable runnable) {
        this.zzdsu = runnable;
        long j = (long) i;
        this.zzffo = this.zzbmz.elapsedRealtime() + j;
        this.zzffn = this.zzffm.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @VisibleForTesting
    private final synchronized void zzaga() {
        if (!this.zzffq) {
            if (this.zzffn == null || this.zzffn.isDone()) {
                this.zzffp = -1;
            } else {
                this.zzffn.cancel(true);
                this.zzffp = this.zzffo - this.zzbmz.elapsedRealtime();
            }
            this.zzffq = true;
        }
    }

    @VisibleForTesting
    private final synchronized void zzagb() {
        if (this.zzffq) {
            if (this.zzffp > 0 && this.zzffn != null && this.zzffn.isCancelled()) {
                this.zzffn = this.zzffm.schedule(this.zzdsu, this.zzffp, TimeUnit.MILLISECONDS);
            }
            this.zzffq = false;
        }
    }
}
