package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdmt;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdon extends zzdmt.zzj<Void> implements Runnable {
    private final Runnable zzhdm;

    public zzdon(Runnable runnable) {
        this.zzhdm = (Runnable) zzdlg.checkNotNull(runnable);
    }

    public final void run() {
        try {
            this.zzhdm.run();
        } catch (Throwable th) {
            setException(th);
            throw zzdlj.zzh(th);
        }
    }
}
