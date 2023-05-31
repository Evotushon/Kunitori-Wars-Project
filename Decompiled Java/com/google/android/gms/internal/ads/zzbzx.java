package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbzx implements Runnable {
    private final zzbzv zzfqr;
    private final ViewGroup zzfqx;

    zzbzx(zzbzv zzbzv, ViewGroup viewGroup) {
        this.zzfqr = zzbzv;
        this.zzfqx = viewGroup;
    }

    public final void run() {
        this.zzfqr.zzb(this.zzfqx);
    }
}
