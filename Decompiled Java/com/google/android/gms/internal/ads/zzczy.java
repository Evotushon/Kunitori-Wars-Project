package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzczy implements Callable {
    private final zzczv zzglw;

    zzczy(zzczv zzczv) {
        this.zzglw = zzczv;
    }

    public final Object call() {
        zzczv zzczv = this.zzglw;
        return new zzczw(zzczv.zzglv.zze(zzczv.zzdke));
    }
}
