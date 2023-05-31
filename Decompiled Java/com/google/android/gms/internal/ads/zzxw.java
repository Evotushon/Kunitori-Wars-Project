package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zzxw implements Runnable {
    private final zzxu zzcfr;
    private final OnInitializationCompleteListener zzcfs;

    zzxw(zzxu zzxu, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.zzcfr = zzxu;
        this.zzcfs = onInitializationCompleteListener;
    }

    public final void run() {
        this.zzcfr.zza(this.zzcfs);
    }
}
