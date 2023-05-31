package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcki implements Callable {
    private final zzdof zzfjy;
    private final zzdof zzfsq;

    zzcki(zzdof zzdof, zzdof zzdof2) {
        this.zzfsq = zzdof;
        this.zzfjy = zzdof2;
    }

    public final Object call() {
        zzdof zzdof = this.zzfsq;
        zzdof zzdof2 = this.zzfjy;
        return new zzckv((zzcky) zzdof.get(), ((zzcks) zzdof2.get()).zzfzi, ((zzcks) zzdof2.get()).zzfzh);
    }
}
