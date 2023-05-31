package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzod {
    private boolean isOpen;

    public final synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean zzir() {
        boolean z;
        z = this.isOpen;
        this.isOpen = false;
        return z;
    }

    public final synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }
}
