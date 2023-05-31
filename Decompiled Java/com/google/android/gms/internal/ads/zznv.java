package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zznv {
    /* access modifiers changed from: private */
    public final ExecutorService zzbfv;
    /* access modifiers changed from: private */
    public zznx<? extends zzoa> zzbfw;
    /* access modifiers changed from: private */
    public IOException zzbfx;

    public zznv(String str) {
        this.zzbfv = zzop.zzbl(str);
    }

    public final <T extends zzoa> long zza(T t, zzny<T> zzny, int i) {
        Looper myLooper = Looper.myLooper();
        zzob.checkState(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zznx(this, myLooper, t, zzny, i, elapsedRealtime).zzek(0);
        return elapsedRealtime;
    }

    public final boolean isLoading() {
        return this.zzbfw != null;
    }

    public final void zzip() {
        this.zzbfw.zzl(false);
    }

    public final void zza(Runnable runnable) {
        zznx<? extends zzoa> zznx = this.zzbfw;
        if (zznx != null) {
            zznx.zzl(true);
        }
        this.zzbfv.execute(runnable);
        this.zzbfv.shutdown();
    }

    public final void zzbc(int i) throws IOException {
        IOException iOException = this.zzbfx;
        if (iOException == null) {
            zznx<? extends zzoa> zznx = this.zzbfw;
            if (zznx != null) {
                zznx.zzbc(zznx.zzbgc);
                return;
            }
            return;
        }
        throw iOException;
    }
}
