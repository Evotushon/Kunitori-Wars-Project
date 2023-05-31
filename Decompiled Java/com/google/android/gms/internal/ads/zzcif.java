package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcif implements Callable {
    private final zzcic zzfxo;
    private final zzaqx zzfxp;

    zzcif(zzcic zzcic, zzaqx zzaqx) {
        this.zzfxo = zzcic;
        this.zzfxp = zzaqx;
    }

    public final Object call() {
        return this.zzfxo.zzf(this.zzfxp);
    }
}
