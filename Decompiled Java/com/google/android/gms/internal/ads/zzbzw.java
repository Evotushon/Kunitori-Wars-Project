package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbzw implements zzacf {
    private final /* synthetic */ zzcal zzfqu;
    private final /* synthetic */ ViewGroup zzfqv;
    private final /* synthetic */ zzbzv zzfqw;

    zzbzw(zzbzv zzbzv, zzcal zzcal, ViewGroup viewGroup) {
        this.zzfqw = zzbzv;
        this.zzfqu = zzcal;
        this.zzfqv = viewGroup;
    }

    public final void zzrh() {
        if (zzbzv.zza(this.zzfqu, zzbzt.zzfqk)) {
            this.zzfqu.onClick(this.zzfqv);
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        this.zzfqu.onTouch((View) null, motionEvent);
    }
}
