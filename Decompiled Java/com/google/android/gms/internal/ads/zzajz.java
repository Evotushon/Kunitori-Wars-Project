package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzajz implements Runnable {
    private final zzajw zzdbl;
    private final zzair zzdbm;

    zzajz(zzajw zzajw, zzair zzair) {
        this.zzdbl = zzajw;
        this.zzdbm = zzair;
    }

    public final void run() {
        zzajw zzajw = this.zzdbl;
        zzair zzair = this.zzdbm;
        zzajw.zzdbk.zzdan.zzh(zzair);
        zzair.destroy();
    }
}
