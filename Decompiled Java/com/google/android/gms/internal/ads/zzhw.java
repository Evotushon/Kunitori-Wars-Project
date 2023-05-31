package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzhw implements Runnable {
    private final /* synthetic */ zzhq zzahq;
    private final /* synthetic */ int zzahw;

    zzhw(zzhq zzhq, int i) {
        this.zzahq = zzhq;
        this.zzahw = i;
    }

    public final void run() {
        this.zzahq.zzahm.zzs(this.zzahw);
    }
}
