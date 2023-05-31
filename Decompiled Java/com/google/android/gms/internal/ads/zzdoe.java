package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public interface zzdoe extends ExecutorService {
    <T> zzdof<T> zzd(Callable<T> callable);

    zzdof<?> zzf(Runnable runnable);
}
