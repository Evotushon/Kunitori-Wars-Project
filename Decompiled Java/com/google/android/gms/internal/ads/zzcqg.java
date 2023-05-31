package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcqg implements Runnable {
    private final zzdei zzfgp;
    private final zzdeq zzfsg;
    private final zzcqh zzgdr;
    private final zzcmd zzgds;

    zzcqg(zzcqh zzcqh, zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) {
        this.zzgdr = zzcqh;
        this.zzfsg = zzdeq;
        this.zzfgp = zzdei;
        this.zzgds = zzcmd;
    }

    public final void run() {
        zzcqh zzcqh = this.zzgdr;
        zzcqf.zzc(this.zzfsg, this.zzfgp, this.zzgds);
    }
}
