package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzhx implements Runnable {
    private final /* synthetic */ zzhq zzahq;
    private final /* synthetic */ zzis zzahx;

    zzhx(zzhq zzhq, zzis zzis) {
        this.zzahq = zzhq;
        this.zzahx = zzis;
    }

    public final void run() {
        this.zzahx.zzgi();
        this.zzahq.zzahm.zzd(this.zzahx);
    }
}
