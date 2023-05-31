package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbek implements Runnable {
    private final IObjectWrapper zzegy;

    zzbek(IObjectWrapper iObjectWrapper) {
        this.zzegy = iObjectWrapper;
    }

    public final void run() {
        zzq.zzlk().zzac(this.zzegy);
    }
}
