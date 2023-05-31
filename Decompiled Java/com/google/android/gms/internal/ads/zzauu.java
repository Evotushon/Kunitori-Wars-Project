package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzauu implements Callable {
    private final Context zzcft;
    private final zzaui zzdqx;

    zzauu(zzaui zzaui, Context context) {
        this.zzdqx = zzaui;
        this.zzcft = context;
    }

    public final Object call() {
        return this.zzdqx.zzal(this.zzcft);
    }
}
