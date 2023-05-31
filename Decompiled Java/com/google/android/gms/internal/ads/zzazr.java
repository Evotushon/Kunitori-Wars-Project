package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzazr extends zzdmw {
    private final Executor zzdxq;

    private zzazr(Executor executor) {
        this.zzdxq = executor;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void execute(Runnable runnable) {
        this.zzdxq.execute(runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ zzazr(Executor executor, zzazp zzazp) {
        this(executor);
    }
}
