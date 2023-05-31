package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdf implements Runnable {
    private final /* synthetic */ zzdc zzvd;

    zzdf(zzdc zzdc) {
        this.zzvd = zzdc;
    }

    public final void run() {
        try {
            this.zzvd.zzbq();
        } catch (Exception e) {
            this.zzvd.zzuu.zza(2023, -1, e);
        }
    }
}
