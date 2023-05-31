package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbbz implements Runnable {
    private final boolean zzdzs;
    private final zzbbp zzecs;
    private final long zzect;

    zzbbz(zzbbp zzbbp, boolean z, long j) {
        this.zzecs = zzbbp;
        this.zzdzs = z;
        this.zzect = j;
    }

    public final void run() {
        this.zzecs.zzc(this.zzdzs, this.zzect);
    }
}
