package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zzxx implements Runnable {
    private final zzxu zzcfr;
    private final Context zzcft;

    zzxx(zzxu zzxu, Context context) {
        this.zzcfr = zzxu;
        this.zzcft = context;
    }

    public final void run() {
        this.zzcfr.getRewardedVideoAdInstance(this.zzcft);
    }
}
