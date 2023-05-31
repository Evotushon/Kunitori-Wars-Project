package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcui implements zzcye<zzcyb<Bundle>> {
    private final Executor executor;
    private final zzavr zzbmv;

    zzcui(Executor executor2, zzavr zzavr) {
        this.executor = executor2;
        this.zzbmv = zzavr;
    }

    public final zzdof<zzcyb<Bundle>> zzapb() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclz)).booleanValue()) {
            return zzdnt.zzaj(null);
        }
        return zzdnt.zzb(this.zzbmv.zzvl(), zzcuh.zzdpv, this.executor);
    }
}
