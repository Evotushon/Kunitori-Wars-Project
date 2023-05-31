package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzdmw extends AbstractExecutorService implements zzdoe {
    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return zzdot.zza(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return zzdot.zze(callable);
    }

    /* renamed from: zzf */
    public final zzdof<?> submit(Runnable runnable) {
        return (zzdof) super.submit(runnable);
    }

    /* renamed from: zzd */
    public final <T> zzdof<T> submit(Callable<T> callable) {
        return (zzdof) super.submit(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, @NullableDecl Object obj) {
        return (zzdof) super.submit(runnable, obj);
    }
}
