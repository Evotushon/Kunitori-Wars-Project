package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbmp implements Runnable {
    private final AtomicReference zzfhe;

    zzbmp(AtomicReference atomicReference) {
        this.zzfhe = atomicReference;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.zzfhe.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
