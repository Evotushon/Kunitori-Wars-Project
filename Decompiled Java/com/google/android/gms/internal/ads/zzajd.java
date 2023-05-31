package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzajd implements Runnable {
    private final zzaja zzdap;
    private final zzdq zzdaq;
    private final zzajv zzdar;

    zzajd(zzaja zzaja, zzdq zzdq, zzajv zzajv) {
        this.zzdap = zzaja;
        this.zzdaq = zzdq;
        this.zzdar = zzajv;
    }

    public final void run() {
        this.zzdap.zza(this.zzdaq, this.zzdar);
    }
}
