package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdhs<E, V> implements zzdof<V> {
    private final E zzgur;
    private final String zzgus;
    private final zzdof<V> zzgut;

    @VisibleForTesting(otherwise = 3)
    public zzdhs(E e, String str, zzdof<V> zzdof) {
        this.zzgur = e;
        this.zzgus = str;
        this.zzgut = zzdof;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.zzgut.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.zzgut.cancel(z);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.zzgut.get();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzgut.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.zzgut.isCancelled();
    }

    public final boolean isDone() {
        return this.zzgut.isDone();
    }

    public final E zzasy() {
        return this.zzgur;
    }

    public final String zzasz() {
        return this.zzgus;
    }

    public final String toString() {
        String str = this.zzgus;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
