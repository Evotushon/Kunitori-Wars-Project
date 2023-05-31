package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzczu implements Callable {
    private final zzdof zzfjy;
    private final zzdof zzfsq;

    zzczu(zzdof zzdof, zzdof zzdof2) {
        this.zzfsq = zzdof;
        this.zzfjy = zzdof2;
    }

    public final Object call() {
        return new zzczs((String) this.zzfsq.get(), (String) this.zzfjy.get());
    }
}
