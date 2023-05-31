package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdkn implements zzdki {
    private zzdkn() {
    }

    @NonNull
    public final ExecutorService zzdt(int i) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    @NonNull
    public final ExecutorService zzdu(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
