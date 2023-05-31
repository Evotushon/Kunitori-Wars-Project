package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzpm implements Runnable {
    private final /* synthetic */ zzpf zzbjp;
    private final /* synthetic */ int zzbjt;
    private final /* synthetic */ int zzbju;
    private final /* synthetic */ int zzbjv;
    private final /* synthetic */ float zzbjw;

    zzpm(zzpf zzpf, int i, int i2, int i3, float f) {
        this.zzbjp = zzpf;
        this.zzbjt = i;
        this.zzbju = i2;
        this.zzbjv = i3;
        this.zzbjw = f;
    }

    public final void run() {
        this.zzbjp.zzbjo.zzb(this.zzbjt, this.zzbju, this.zzbjv, this.zzbjw);
    }
}
