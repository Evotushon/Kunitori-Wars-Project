package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbfp implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzaub zzegb;
    private final /* synthetic */ zzbfo zzejc;

    zzbfp(zzbfo zzbfo, zzaub zzaub) {
        this.zzejc = zzbfo;
        this.zzegb = zzaub;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzejc.zza(view, this.zzegb, 10);
    }
}
