package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbsk implements Runnable {
    private final WeakReference<zzbsf> zzfkr;

    private zzbsk(zzbsf zzbsf) {
        this.zzfkr = new WeakReference<>(zzbsf);
    }

    public final void run() {
        zzbsf zzbsf = (zzbsf) this.zzfkr.get();
        if (zzbsf != null) {
            zzbsf.zzaid();
        }
    }
}
