package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcil implements Callable {
    private final Context zzcft;
    private final zzdq zzfxs;

    zzcil(zzdq zzdq, Context context) {
        this.zzfxs = zzdq;
        this.zzcft = context;
    }

    public final Object call() {
        zzdq zzdq = this.zzfxs;
        return zzdq.zzcb().zzb(this.zzcft);
    }
}
