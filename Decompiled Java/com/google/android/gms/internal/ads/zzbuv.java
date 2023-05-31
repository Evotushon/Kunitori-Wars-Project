package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbuv<T> {
    public Executor executor;
    public T zzflp;

    public static <T> zzbuv<T> zzb(T t, Executor executor2) {
        return new zzbuv<>(t, executor2);
    }

    public zzbuv(T t, Executor executor2) {
        this.zzflp = t;
        this.executor = executor2;
    }
}
