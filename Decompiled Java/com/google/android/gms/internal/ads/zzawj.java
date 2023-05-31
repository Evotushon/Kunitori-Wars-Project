package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzawj implements Runnable {
    private final Context zzcft;
    private final String zzdcq;
    private final zzawk zzdtb;

    zzawj(zzawk zzawk, Context context, String str) {
        this.zzdtb = zzawk;
        this.zzcft = context;
        this.zzdcq = str;
    }

    public final void run() {
        this.zzdtb.zzp(this.zzcft, this.zzdcq);
    }
}
