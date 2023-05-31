package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zar implements Runnable {
    private final /* synthetic */ zas zaei;

    zar(zas zas) {
        this.zaei = zas;
    }

    public final void run() {
        this.zaei.zaet.lock();
        try {
            this.zaei.zav();
        } finally {
            this.zaei.zaet.unlock();
        }
    }
}
