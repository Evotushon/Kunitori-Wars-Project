package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzckp implements Callable {
    private final zzdof zzfig;
    private final zzdof zzfjy;
    private final zzckh zzfzf;

    zzckp(zzckh zzckh, zzdof zzdof, zzdof zzdof2) {
        this.zzfzf = zzckh;
        this.zzfjy = zzdof;
        this.zzfig = zzdof2;
    }

    public final Object call() {
        return this.zzfzf.zza(this.zzfjy, this.zzfig);
    }
}
