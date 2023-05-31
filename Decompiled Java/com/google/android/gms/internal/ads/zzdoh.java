package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdoh {
    public static Executor zzauv() {
        return zzdnm.INSTANCE;
    }

    public static zzdoe zza(ExecutorService executorService) {
        if (executorService instanceof zzdoe) {
            return (zzdoe) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new zzdol((ScheduledExecutorService) executorService);
        }
        return new zzdoi(executorService);
    }

    static Executor zza(Executor executor, zzdmt<?> zzdmt) {
        zzdlg.checkNotNull(executor);
        zzdlg.checkNotNull(zzdmt);
        if (executor == zzdnm.INSTANCE) {
            return executor;
        }
        return new zzdog(executor, zzdmt);
    }
}
