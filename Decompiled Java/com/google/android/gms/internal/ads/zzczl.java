package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzczl implements Callable {
    private final zzczm zzglo;

    zzczl(zzczm zzczm) {
        this.zzglo = zzczm;
    }

    public final Object call() {
        zzczm zzczm = this.zzglo;
        return new zzczj(zzczm.zzglp.zzg(zzczm.zzur));
    }
}
