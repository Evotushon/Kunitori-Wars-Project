package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzpd implements Handler.Callback, Choreographer.FrameCallback {
    private static final zzpd zzbiz = new zzpd();
    private final zzdkp zzadx;
    public volatile long zzbiy;
    private final HandlerThread zzbja = new HandlerThread("ChoreographerOwner:Handler");
    private Choreographer zzbjb;
    private int zzbjc;

    public static zzpd zzjl() {
        return zzbiz;
    }

    private zzpd() {
        this.zzbja.start();
        this.zzadx = new zzdkp(this.zzbja.getLooper(), this);
        this.zzadx.sendEmptyMessage(0);
    }

    public final void zzjm() {
        this.zzadx.sendEmptyMessage(1);
    }

    public final void zzjn() {
        this.zzadx.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.zzbiy = j;
        this.zzbjb.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.zzbjb = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            this.zzbjc++;
            if (this.zzbjc == 1) {
                this.zzbjb.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.zzbjc--;
            if (this.zzbjc == 0) {
                this.zzbjb.removeFrameCallback(this);
                this.zzbiy = 0;
            }
            return true;
        }
    }
}
