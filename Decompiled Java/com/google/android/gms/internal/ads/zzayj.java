package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzayj {
    private Handler handler = null;
    private final Object lock = new Object();
    private HandlerThread zzdvv = null;
    private int zzdvw = 0;

    public final Looper zzxg() {
        Looper looper;
        synchronized (this.lock) {
            if (this.zzdvw != 0) {
                Preconditions.checkNotNull(this.zzdvv, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.zzdvv == null) {
                zzawf.zzee("Starting the looper thread.");
                this.zzdvv = new HandlerThread("LooperProvider");
                this.zzdvv.start();
                this.handler = new zzdkp(this.zzdvv.getLooper());
                zzawf.zzee("Looper thread started.");
            } else {
                zzawf.zzee("Resuming the looper thread");
                this.lock.notifyAll();
            }
            this.zzdvw++;
            looper = this.zzdvv.getLooper();
        }
        return looper;
    }

    public final Handler getHandler() {
        return this.handler;
    }
}
