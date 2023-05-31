package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zzale implements Runnable {
    private final Context zzcft;
    private final zzalc zzdcp;

    zzale(zzalc zzalc, Context context) {
        this.zzdcp = zzalc;
        this.zzcft = context;
    }

    public final void run() {
        zzalc.zzp(this.zzcft);
    }
}
