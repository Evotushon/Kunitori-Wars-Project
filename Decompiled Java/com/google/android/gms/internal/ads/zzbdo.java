package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbdo implements Runnable {
    private final boolean zzdzs;
    private final long zzect;
    private final zzbbm zzeff;

    zzbdo(zzbbm zzbbm, boolean z, long j) {
        this.zzeff = zzbbm;
        this.zzdzs = z;
        this.zzect = j;
    }

    public final void run() {
        this.zzeff.zza(this.zzdzs, this.zzect);
    }
}
