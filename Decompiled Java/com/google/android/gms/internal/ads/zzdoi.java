package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
class zzdoi extends zzdmw {
    private final ExecutorService zzhdh;

    zzdoi(ExecutorService executorService) {
        this.zzhdh = (ExecutorService) zzdlg.checkNotNull(executorService);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.zzhdh.awaitTermination(j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.zzhdh.isShutdown();
    }

    public final boolean isTerminated() {
        return this.zzhdh.isTerminated();
    }

    public final void shutdown() {
        this.zzhdh.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.zzhdh.shutdownNow();
    }

    public final void execute(Runnable runnable) {
        this.zzhdh.execute(runnable);
    }
}
