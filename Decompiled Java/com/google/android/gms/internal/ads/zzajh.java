package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzajh implements Runnable {
    private final zzaja zzdap;
    private final zzajv zzdas;
    private final zzair zzdat;

    zzajh(zzaja zzaja, zzajv zzajv, zzair zzair) {
        this.zzdap = zzaja;
        this.zzdas = zzajv;
        this.zzdat = zzair;
    }

    public final void run() {
        this.zzdap.zza(this.zzdas, this.zzdat);
    }
}
