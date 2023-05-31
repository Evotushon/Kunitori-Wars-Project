package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbpp implements Callable {
    private final zzbpm zzfjx;
    private final zzdof zzfjy;

    zzbpp(zzbpm zzbpm, zzdof zzdof) {
        this.zzfjx = zzbpm;
        this.zzfjy = zzdof;
    }

    public final Object call() {
        return this.zzfjx.zzc(this.zzfjy);
    }
}
