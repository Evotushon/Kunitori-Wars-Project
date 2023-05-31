package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdnz;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdnt extends zzdoa {
    public static <V> zzdof<V> zzaj(@NullableDecl V v) {
        if (v == null) {
            return zzdnz.zzhda;
        }
        return new zzdnz(v);
    }

    public static <V> zzdof<V> immediateFailedFuture(Throwable th) {
        zzdlg.checkNotNull(th);
        return new zzdnz.zza(th);
    }

    public static <O> zzdof<O> zza(zzdne<O> zzdne, Executor executor) {
        zzdot zzdot = new zzdot(zzdne);
        executor.execute(zzdot);
        return zzdot;
    }

    public static <V, X extends Throwable> zzdof<V> zzb(zzdof<? extends V> zzdof, Class<X> cls, zzdng<? super X, ? extends V> zzdng, Executor executor) {
        return zzdms.zza(zzdof, cls, zzdng, executor);
    }

    public static <V> zzdof<V> zza(zzdof<V> zzdof, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzdof.isDone()) {
            return zzdof;
        }
        return zzdop.zzb(zzdof, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> zzdof<O> zzb(zzdof<I> zzdof, zzdng<? super I, ? extends O> zzdng, Executor executor) {
        return zzdmv.zza(zzdof, zzdng, executor);
    }

    public static <I, O> zzdof<O> zzb(zzdof<I> zzdof, zzdku<? super I, ? extends O> zzdku, Executor executor) {
        return zzdmv.zza(zzdof, zzdku, executor);
    }

    public static <V> zzdof<List<V>> zzg(Iterable<? extends zzdof<? extends V>> iterable) {
        return new zzdni(zzdlr.zzf(iterable), true);
    }

    @SafeVarargs
    public static <V> zzdny<V> zza(zzdof<? extends V>... zzdofArr) {
        return new zzdny<>(false, zzdlr.zzb(zzdofArr), (zzdnw) null);
    }

    public static <V> zzdny<V> zzh(Iterable<? extends zzdof<? extends V>> iterable) {
        return new zzdny<>(false, zzdlr.zzf(iterable), (zzdnw) null);
    }

    @SafeVarargs
    public static <V> zzdny<V> zzb(zzdof<? extends V>... zzdofArr) {
        return new zzdny<>(true, zzdlr.zzb(zzdofArr), (zzdnw) null);
    }

    public static <V> zzdny<V> zzi(Iterable<? extends zzdof<? extends V>> iterable) {
        return new zzdny<>(true, zzdlr.zzf(iterable), (zzdnw) null);
    }

    public static <V> void zza(zzdof<V> zzdof, zzdnu<? super V> zzdnu, Executor executor) {
        zzdlg.checkNotNull(zzdnu);
        zzdof.addListener(new zzdnv(zzdof, zzdnu), executor);
    }

    public static <V> V zza(Future<V> future) throws ExecutionException {
        if (future.isDone()) {
            return zzdox.getUninterruptibly(future);
        }
        throw new IllegalStateException(zzdlh.zzb("Future was expected to be done: %s", future));
    }

    public static <V> V zzb(Future<V> future) {
        zzdlg.checkNotNull(future);
        try {
            return zzdox.getUninterruptibly(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzdnl((Error) cause);
            }
            throw new zzdou(cause);
        }
    }
}
