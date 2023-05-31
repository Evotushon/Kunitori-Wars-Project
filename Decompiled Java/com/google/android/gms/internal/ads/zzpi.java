package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzpi implements Runnable {
    private final /* synthetic */ zzis zzahr;
    private final /* synthetic */ zzpf zzbjp;

    zzpi(zzpf zzpf, zzis zzis) {
        this.zzbjp = zzpf;
        this.zzahr = zzis;
    }

    public final void run() {
        this.zzbjp.zzbjo.zze(this.zzahr);
    }
}
