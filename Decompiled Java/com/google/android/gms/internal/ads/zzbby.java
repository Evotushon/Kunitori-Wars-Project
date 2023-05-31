package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbby implements Runnable {
    private final int zzdul;
    private final int zzdum;
    private final zzbbp zzecs;

    zzbby(zzbbp zzbbp, int i, int i2) {
        this.zzecs = zzbbp;
        this.zzdul = i;
        this.zzdum = i2;
    }

    public final void run() {
        this.zzecs.zzp(this.zzdul, this.zzdum);
    }
}
