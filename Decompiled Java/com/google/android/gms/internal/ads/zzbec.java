package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbec implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzaub zzegb;
    private final /* synthetic */ zzbdy zzegd;

    zzbec(zzbdy zzbdy, zzaub zzaub) {
        this.zzegd = zzbdy;
        this.zzegb = zzaub;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzegd.zza(view, this.zzegb, 10);
    }
}
