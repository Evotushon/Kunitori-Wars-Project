package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbim implements Runnable {
    private final zzbik zzfcy;
    private final Runnable zzfcz;

    zzbim(zzbik zzbik, Runnable runnable) {
        this.zzfcy = zzbik;
        this.zzfcz = runnable;
    }

    public final void run() {
        this.zzfcy.zzd(this.zzfcz);
    }
}
