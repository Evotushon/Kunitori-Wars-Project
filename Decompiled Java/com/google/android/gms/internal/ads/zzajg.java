package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzajg implements Runnable {
    private final zzair zzdav;

    private zzajg(zzair zzair) {
        this.zzdav = zzair;
    }

    static Runnable zzb(zzair zzair) {
        return new zzajg(zzair);
    }

    public final void run() {
        this.zzdav.destroy();
    }
}
