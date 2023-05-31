package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzm implements Runnable {
    private final zzj zzdiq;
    private final Drawable zzdir;

    zzm(zzj zzj, Drawable drawable) {
        this.zzdiq = zzj;
        this.zzdir = drawable;
    }

    public final void run() {
        zzj zzj = this.zzdiq;
        zzj.zzdio.zzzo.getWindow().setBackgroundDrawable(this.zzdir);
    }
}
