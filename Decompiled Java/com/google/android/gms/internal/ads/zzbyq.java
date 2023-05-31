package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbyq implements Runnable {
    private final zzbzh zzfop;

    private zzbyq(zzbzh zzbzh) {
        this.zzfop = zzbzh;
    }

    static Runnable zza(zzbzh zzbzh) {
        return new zzbyq(zzbzh);
    }

    public final void run() {
        this.zzfop.zzaju();
    }
}
