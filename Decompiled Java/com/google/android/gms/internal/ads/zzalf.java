package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zzalf implements Runnable {
    private final Context zzcft;
    private final zzalc zzdcp;
    private final String zzdcq;

    zzalf(zzalc zzalc, Context context, String str) {
        this.zzdcp = zzalc;
        this.zzcft = context;
        this.zzdcq = str;
    }

    public final void run() {
        zzalc.zzd(this.zzcft, this.zzdcq);
    }
}
