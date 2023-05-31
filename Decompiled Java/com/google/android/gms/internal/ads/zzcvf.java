package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcyb;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcvf<S extends zzcyb<?>> {
    private final Clock zzbmz;
    public final zzdof<S> zzgiv;
    private final long zzgiw;

    public zzcvf(zzdof<S> zzdof, long j, Clock clock) {
        this.zzgiv = zzdof;
        this.zzbmz = clock;
        this.zzgiw = clock.elapsedRealtime() + j;
    }

    public final boolean hasExpired() {
        return this.zzgiw < this.zzbmz.elapsedRealtime();
    }
}
