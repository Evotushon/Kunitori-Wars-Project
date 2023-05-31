package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzlt implements Runnable {
    private final /* synthetic */ zzls zzbab;
    private final /* synthetic */ zzly zzbbc;

    zzlt(zzls zzls, zzly zzly) {
        this.zzbab = zzls;
        this.zzbbc = zzly;
    }

    public final void run() {
        this.zzbbc.release();
        int size = this.zzbab.zzban.size();
        for (int i = 0; i < size; i++) {
            ((zzmm) this.zzbab.zzban.valueAt(i)).disable();
        }
    }
}
