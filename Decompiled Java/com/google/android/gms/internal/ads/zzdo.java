package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdo implements Runnable {
    private final /* synthetic */ int zzwn;
    private final /* synthetic */ int zzwo;
    private final /* synthetic */ int zzwp;

    zzdo(zzdi zzdi, int i, int i2, int i3) {
        this.zzwn = i;
        this.zzwo = i2;
        this.zzwp = i3;
    }

    public final void run() {
        try {
            zzdi.zzvf.zza(MotionEvent.obtain(0, (long) this.zzwn, 0, (float) this.zzwo, (float) this.zzwp, 0));
        } catch (Exception e) {
            zzdi.zzvh.zza(2022, -1, e);
        }
    }
}
