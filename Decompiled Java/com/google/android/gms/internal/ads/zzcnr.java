package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcnr implements Runnable {
    private final zzcer zzgcl;

    private zzcnr(zzcer zzcer) {
        this.zzgcl = zzcer;
    }

    static Runnable zza(zzcer zzcer) {
        return new zzcnr(zzcer);
    }

    public final void run() {
        this.zzgcl.zzamg();
    }
}
