package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcne implements Callable {
    private final zzdei zzfgp;
    private final zzdeq zzfsg;
    private final zzcnf zzgbx;

    zzcne(zzcnf zzcnf, zzdeq zzdeq, zzdei zzdei) {
        this.zzgbx = zzcnf;
        this.zzfsg = zzdeq;
        this.zzfgp = zzdei;
    }

    public final Object call() {
        return this.zzgbx.zzc(this.zzfsg, this.zzfgp);
    }
}
