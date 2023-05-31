package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbca implements Runnable {
    private final int zzdul;
    private final zzbbp zzecs;

    zzbca(zzbbp zzbbp, int i) {
        this.zzecs = zzbbp;
        this.zzdul = i;
    }

    public final void run() {
        this.zzecs.zzdb(this.zzdul);
    }
}
