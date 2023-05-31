package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzceh implements View.OnTouchListener {
    private final zzced zzfui;

    zzceh(zzced zzced) {
        this.zzfui = zzced;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.zzfui.zza(view, motionEvent);
    }
}
