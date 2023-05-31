package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzn implements View.OnTouchListener {
    private final /* synthetic */ zzl zzblt;

    zzn(zzl zzl) {
        this.zzblt = zzl;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzblt.zzbma == null) {
            return false;
        }
        this.zzblt.zzbma.zza(motionEvent);
        return false;
    }
}
