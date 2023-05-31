package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdnb implements Runnable {
    private final /* synthetic */ zzdna zzhcd;
    private final /* synthetic */ zzdlq zzhck;

    zzdnb(zzdna zzdna, zzdlq zzdlq) {
        this.zzhcd = zzdna;
        this.zzhck = zzdlq;
    }

    public final void run() {
        this.zzhcd.zza(this.zzhck);
    }
}
