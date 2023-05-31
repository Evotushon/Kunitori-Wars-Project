package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzchy implements Runnable {
    private final String zzczs;
    private final zzchz zzfxd;

    zzchy(zzchz zzchz, String str) {
        this.zzfxd = zzchz;
        this.zzczs = str;
    }

    public final void run() {
        zzchz zzchz = this.zzfxd;
        zzchz.zzfxe.zzgg(this.zzczs);
    }
}
