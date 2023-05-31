package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdnq<V> extends zzdno<V> {
    private final zzdof<V> zzhcw;

    zzdnq(zzdof<V> zzdof) {
        this.zzhcw = (zzdof) zzdlg.checkNotNull(zzdof);
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.zzhcw.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.zzhcw.cancel(z);
    }

    public final boolean isCancelled() {
        return this.zzhcw.isCancelled();
    }

    public final boolean isDone() {
        return this.zzhcw.isDone();
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.zzhcw.get();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzhcw.get(j, timeUnit);
    }

    public final String toString() {
        return this.zzhcw.toString();
    }
}
