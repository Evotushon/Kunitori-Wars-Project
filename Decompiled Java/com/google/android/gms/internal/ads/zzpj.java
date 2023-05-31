package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzpj implements Runnable {
    private final /* synthetic */ zzpf zzbjp;
    private final /* synthetic */ int zzbjq;
    private final /* synthetic */ long zzbjr;

    zzpj(zzpf zzpf, int i, long j) {
        this.zzbjp = zzpf;
        this.zzbjq = i;
        this.zzbjr = j;
    }

    public final void run() {
        this.zzbjp.zzbjo.zzf(this.zzbjq, this.zzbjr);
    }
}
