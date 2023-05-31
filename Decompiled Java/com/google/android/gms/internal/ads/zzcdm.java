package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcdm implements Runnable {
    private final zzbdv zzeiw;

    private zzcdm(zzbdv zzbdv) {
        this.zzeiw = zzbdv;
    }

    static Runnable zzh(zzbdv zzbdv) {
        return new zzcdm(zzbdv);
    }

    public final void run() {
        this.zzeiw.destroy();
    }
}
