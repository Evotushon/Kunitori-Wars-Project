package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzlu implements Runnable {
    private final /* synthetic */ zzls zzbab;

    zzlu(zzls zzls) {
        this.zzbab = zzls;
    }

    public final void run() {
        if (!this.zzbab.zzaee) {
            this.zzbab.zzbao.zza(this.zzbab);
        }
    }
}
