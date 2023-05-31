package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbej implements Runnable {
    private final /* synthetic */ zzbeh zzegx;

    zzbej(zzbeh zzbeh) {
        this.zzegx = zzbeh;
    }

    public final void run() {
        this.zzegx.zzegu.destroy();
    }
}
