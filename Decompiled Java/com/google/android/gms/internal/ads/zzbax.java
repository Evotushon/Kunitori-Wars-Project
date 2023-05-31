package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbax implements Runnable {
    private final zzbav zzdzr;
    private final boolean zzdzs;

    zzbax(zzbav zzbav, boolean z) {
        this.zzdzr = zzbav;
        this.zzdzs = z;
    }

    public final void run() {
        this.zzdzr.zzau(this.zzdzs);
    }
}
