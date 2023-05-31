package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbas implements Runnable {
    private final /* synthetic */ zzbak zzdyt;

    zzbas(zzbak zzbak) {
        this.zzdyt = zzbak;
    }

    public final void run() {
        if (this.zzdyt.zzdys != null) {
            this.zzdyt.zzdys.zzxz();
        }
    }
}
