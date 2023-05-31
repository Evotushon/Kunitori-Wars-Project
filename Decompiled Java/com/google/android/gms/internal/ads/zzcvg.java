package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcyb;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvg<S extends zzcyb<?>> implements zzcye<S> {
    private final Clock zzbmz;
    private final AtomicReference<zzcvf<S>> zzgix = new AtomicReference<>();
    private final zzcye<S> zzgiy;
    private final long zzgiz;

    public zzcvg(zzcye<S> zzcye, long j, Clock clock) {
        this.zzbmz = clock;
        this.zzgiy = zzcye;
        this.zzgiz = j;
    }

    public final zzdof<S> zzapb() {
        zzcvf zzcvf = this.zzgix.get();
        if (zzcvf == null || zzcvf.hasExpired()) {
            zzcvf = new zzcvf(this.zzgiy.zzapb(), this.zzgiz, this.zzbmz);
            this.zzgix.set(zzcvf);
        }
        return zzcvf.zzgiv;
    }
}
