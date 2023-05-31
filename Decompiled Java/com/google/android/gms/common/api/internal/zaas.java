package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
abstract class zaas implements Runnable {
    private final /* synthetic */ zaai zago;

    private zaas(zaai zaai) {
        this.zago = zaai;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void zaak();

    @WorkerThread
    public void run() {
        this.zago.zaet.lock();
        try {
            if (!Thread.interrupted()) {
                zaak();
                this.zago.zaet.unlock();
            }
        } catch (RuntimeException e) {
            this.zago.zafy.zaa(e);
        } finally {
            this.zago.zaet.unlock();
        }
    }

    /* synthetic */ zaas(zaai zaai, zaal zaal) {
        this(zaai);
    }
}
