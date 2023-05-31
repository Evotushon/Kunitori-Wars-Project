package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbmo implements Runnable {
    private final Runnable zzfcz;
    private final zzbmm zzfhd;

    zzbmo(zzbmm zzbmm, Runnable runnable) {
        this.zzfhd = zzbmm;
        this.zzfcz = runnable;
    }

    public final void run() {
        this.zzfhd.zze(this.zzfcz);
    }
}
