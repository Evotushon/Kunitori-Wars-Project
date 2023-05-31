package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbys implements Runnable {
    private final boolean zzdzs;
    private final zzbyo zzfoq;

    zzbys(zzbyo zzbyo, boolean z) {
        this.zzfoq = zzbyo;
        this.zzdzs = z;
    }

    public final void run() {
        this.zzfoq.zzbj(this.zzdzs);
    }
}
