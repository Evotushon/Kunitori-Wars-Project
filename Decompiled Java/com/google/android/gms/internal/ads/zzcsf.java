package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsf implements zzbsg {
    private final AtomicReference<zzxd> zzggc = new AtomicReference<>();

    public final void zzb(zzxd zzxd) {
        this.zzggc.set(zzxd);
    }

    public final void zzb(zzum zzum) {
        zzdce.zza(this.zzggc, new zzcse(zzum));
    }
}
