package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzazs implements Executor {
    private final Handler zzdxr = new zzawi(Looper.getMainLooper());

    zzazs() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzq.zzkv();
                zzawo.zza(zzq.zzkz().getApplicationContext(), th);
                throw th;
            }
        } else {
            this.zzdxr.post(runnable);
        }
    }
}
