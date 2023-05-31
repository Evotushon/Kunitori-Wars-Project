package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzdib implements Runnable {
    private final zzdhx zzgva;
    private final zzdhs zzgvb;

    zzdib(zzdhx zzdhx, zzdhs zzdhs) {
        this.zzgva = zzdhx;
        this.zzgvb = zzdhs;
    }

    public final void run() {
        zzdhx zzdhx = this.zzgva;
        zzdhx.zzguv.zzguq.zzb(this.zzgvb);
    }
}
