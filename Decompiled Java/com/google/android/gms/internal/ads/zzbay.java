package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbay implements Runnable {
    private final zzbat zzdzt;

    private zzbay(zzbat zzbat) {
        this.zzdzt = zzbat;
    }

    static Runnable zza(zzbat zzbat) {
        return new zzbay(zzbat);
    }

    public final void run() {
        this.zzdzt.stop();
    }
}
