package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzauw implements ThreadFactory {
    private final AtomicInteger zzyi = new AtomicInteger(1);

    zzauw(zzaui zzaui) {
    }

    public final Thread newThread(@NonNull Runnable runnable) {
        int andIncrement = this.zzyi.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
