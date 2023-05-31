package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbin implements Runnable {
    private final zzbik zzfcy;
    private final Runnable zzfcz;

    zzbin(zzbik zzbik, Runnable runnable) {
        this.zzfcy = zzbik;
        this.zzfcz = runnable;
    }

    public final void run() {
        zzazq.zzdxo.execute(new zzbim(this.zzfcy, this.zzfcz));
    }
}
