package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzdnp<V> extends zzdlo implements Future<V> {
    protected zzdnp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzaut */
    public abstract Future<? extends V> zzatv();

    public boolean cancel(boolean z) {
        return zzatv().cancel(z);
    }

    public boolean isCancelled() {
        return zzatv().isCancelled();
    }

    public boolean isDone() {
        return zzatv().isDone();
    }

    public V get() throws InterruptedException, ExecutionException {
        return zzatv().get();
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zzatv().get(j, timeUnit);
    }
}
