package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzht implements Runnable {
    private final /* synthetic */ zzhq zzahq;
    private final /* synthetic */ zzis zzahr;

    zzht(zzhq zzhq, zzis zzis) {
        this.zzahq = zzhq;
        this.zzahr = zzis;
    }

    public final void run() {
        this.zzahq.zzahm.zzc(this.zzahr);
    }
}
