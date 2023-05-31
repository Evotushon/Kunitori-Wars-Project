package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzhv implements Runnable {
    private final /* synthetic */ zzhq zzahq;
    private final /* synthetic */ zzgz zzahv;

    zzhv(zzhq zzhq, zzgz zzgz) {
        this.zzahq = zzhq;
        this.zzahv = zzgz;
    }

    public final void run() {
        this.zzahq.zzahm.zzc(this.zzahv);
    }
}
