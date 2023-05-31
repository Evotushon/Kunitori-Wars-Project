package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzazq {
    public static final zzdoe zzdxk = zza(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), zzfd("Default")));
    public static final zzdoe zzdxl;
    public static final zzdoe zzdxm;
    public static final ScheduledExecutorService zzdxn = new ScheduledThreadPoolExecutor(3, zzfd("Schedule"));
    public static final zzdoe zzdxo = zza(new zzazs());
    public static final zzdoe zzdxp = zza(zzdoh.zzauv());

    private static ThreadFactory zzfd(String str) {
        return new zzazp(str);
    }

    private static zzdoe zza(Executor executor) {
        return new zzazr(executor, (zzazp) null);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzfd("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zzdxl = zza(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzfd("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        zzdxm = zza(threadPoolExecutor2);
    }
}
