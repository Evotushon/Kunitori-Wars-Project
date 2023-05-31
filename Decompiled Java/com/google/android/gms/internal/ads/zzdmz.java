package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdmz implements Runnable {
    private final /* synthetic */ zzdof zzhcb;
    private final /* synthetic */ int zzhcc;
    private final /* synthetic */ zzdna zzhcd;

    zzdmz(zzdna zzdna, zzdof zzdof, int i) {
        this.zzhcd = zzdna;
        this.zzhcb = zzdof;
        this.zzhcc = i;
    }

    public final void run() {
        try {
            if (this.zzhcb.isCancelled()) {
                zzdlq unused = this.zzhcd.zzhce = null;
                this.zzhcd.cancel(false);
            } else {
                this.zzhcd.zza(this.zzhcc, this.zzhcb);
            }
        } finally {
            this.zzhcd.zza((zzdlq) null);
        }
    }
}
