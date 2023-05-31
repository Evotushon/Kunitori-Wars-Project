package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcmp implements Runnable {
    private final zzbdv zzeiw;

    private zzcmp(zzbdv zzbdv) {
        this.zzeiw = zzbdv;
    }

    static Runnable zzh(zzbdv zzbdv) {
        return new zzcmp(zzbdv);
    }

    public final void run() {
        this.zzeiw.zzaas();
    }
}
