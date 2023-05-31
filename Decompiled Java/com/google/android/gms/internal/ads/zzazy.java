package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzazy<T> implements zzdof<T> {
    private final zzdom<T> zzdxu = zzdom.zzauw();

    public final boolean set(@Nullable T t) {
        return zzas(this.zzdxu.set(t));
    }

    public final boolean setException(Throwable th) {
        return zzas(this.zzdxu.setException(th));
    }

    private static boolean zzas(boolean z) {
        if (!z) {
            zzq.zzkz().zzb(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.zzdxu.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.zzdxu.cancel(z);
    }

    public boolean isCancelled() {
        return this.zzdxu.isCancelled();
    }

    public boolean isDone() {
        return this.zzdxu.isDone();
    }

    public T get() throws ExecutionException, InterruptedException {
        return this.zzdxu.get();
    }

    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zzdxu.get(j, timeUnit);
    }
}
