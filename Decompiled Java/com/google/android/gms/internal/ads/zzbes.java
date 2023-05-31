package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbes implements Runnable {
    private final int zzdul;
    private final int zzdum;
    private final boolean zzegk;
    private final boolean zzegl;
    private final zzbeq zzeik;

    zzbes(zzbeq zzbeq, int i, int i2, boolean z, boolean z2) {
        this.zzeik = zzbeq;
        this.zzdul = i;
        this.zzdum = i2;
        this.zzegk = z;
        this.zzegl = z2;
    }

    public final void run() {
        this.zzeik.zzb(this.zzdul, this.zzdum, this.zzegk, this.zzegl);
    }
}
