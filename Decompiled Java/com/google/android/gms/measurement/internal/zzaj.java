package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzq;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.6.0 */
abstract class zzaj {
    private static volatile Handler zzb;
    private final zzgq zza;
    private final Runnable zzc;
    /* access modifiers changed from: private */
    public volatile long zzd;

    zzaj(zzgq zzgq) {
        Preconditions.checkNotNull(zzgq);
        this.zza = zzgq;
        this.zzc = new zzai(this, zzgq);
    }

    public abstract void zza();

    public final void zza(long j) {
        zzc();
        if (j >= 0) {
            this.zzd = this.zza.zzl().currentTimeMillis();
            if (!zzd().postDelayed(this.zzc, j)) {
                this.zza.zzq().zze().zza("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean zzb() {
        return this.zzd != 0;
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        this.zzd = 0;
        zzd().removeCallbacks(this.zzc);
    }

    private final Handler zzd() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzaj.class) {
            if (zzb == null) {
                zzb = new zzq(this.zza.zzm().getMainLooper());
            }
            handler = zzb;
        }
        return handler;
    }
}
