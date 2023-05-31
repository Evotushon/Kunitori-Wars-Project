package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbzu implements Runnable {
    private final zzbzv zzfqr;
    private final zzcal zzfqs;

    zzbzu(zzbzv zzbzv, zzcal zzcal) {
        this.zzfqr = zzbzv;
        this.zzfqs = zzcal;
    }

    public final void run() {
        this.zzfqr.zzd(this.zzfqs);
    }
}
