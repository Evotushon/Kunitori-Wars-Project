package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdp implements Runnable {
    private final /* synthetic */ MotionEvent zzwq;

    zzdp(zzdi zzdi, MotionEvent motionEvent) {
        this.zzwq = motionEvent;
    }

    public final void run() {
        try {
            zzdi.zzvf.zza(this.zzwq);
        } catch (Exception e) {
            zzdi.zzvh.zza(2022, -1, e);
        }
    }
}
