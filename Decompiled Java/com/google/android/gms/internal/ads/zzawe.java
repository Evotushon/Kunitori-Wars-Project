package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzawe implements Runnable {
    private final /* synthetic */ zzawb zzdta;

    zzawe(zzawb zzawb) {
        this.zzdta = zzawb;
    }

    public final void run() {
        Thread unused = this.zzdta.thread = Thread.currentThread();
        this.zzdta.zztz();
    }
}
