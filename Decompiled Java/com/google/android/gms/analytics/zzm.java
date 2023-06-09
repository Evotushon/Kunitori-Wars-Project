package com.google.android.gms.analytics;

import android.util.Log;
import com.google.android.gms.analytics.zzk;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

final class zzm extends FutureTask<T> {
    private final /* synthetic */ zzk.zza zzsy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzm(zzk.zza zza, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.zzsy = zza;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler zzb = zzk.this.zzsv;
        if (zzb != null) {
            zzb.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(valueOf);
            Log.e("GAv4", sb.toString());
        }
        super.setException(th);
    }
}
