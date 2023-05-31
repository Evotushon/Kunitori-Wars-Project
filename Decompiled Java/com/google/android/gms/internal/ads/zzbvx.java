package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbvx implements Runnable {
    private final zzbdv zzeiw;

    private zzbvx(zzbdv zzbdv) {
        this.zzeiw = zzbdv;
    }

    static Runnable zzh(zzbdv zzbdv) {
        return new zzbvx(zzbdv);
    }

    public final void run() {
        this.zzeiw.destroy();
    }
}
