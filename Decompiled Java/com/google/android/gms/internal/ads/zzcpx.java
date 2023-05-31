package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcpx implements Runnable {
    private final zzcer zzgcl;

    private zzcpx(zzcer zzcer) {
        this.zzgcl = zzcer;
    }

    static Runnable zza(zzcer zzcer) {
        return new zzcpx(zzcer);
    }

    public final void run() {
        this.zzgcl.zzamg();
    }
}
