package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzpn implements Runnable {
    private final /* synthetic */ zzis zzahx;
    private final /* synthetic */ zzpf zzbjp;

    zzpn(zzpf zzpf, zzis zzis) {
        this.zzbjp = zzpf;
        this.zzahx = zzis;
    }

    public final void run() {
        this.zzahx.zzgi();
        this.zzbjp.zzbjo.zzf(this.zzahx);
    }
}
