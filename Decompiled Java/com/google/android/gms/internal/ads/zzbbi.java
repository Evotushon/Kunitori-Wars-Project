package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbbi implements Runnable {
    zzbbi(zzbbf zzbbf) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
