package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcnh implements Runnable {
    private final zzdei zzfgp;
    private final zzdeq zzfsg;
    private final zzcnf zzgbx;

    zzcnh(zzcnf zzcnf, zzdeq zzdeq, zzdei zzdei) {
        this.zzgbx = zzcnf;
        this.zzfsg = zzdeq;
        this.zzfgp = zzdei;
    }

    public final void run() {
        this.zzgbx.zzd(this.zzfsg, this.zzfgp);
    }
}
