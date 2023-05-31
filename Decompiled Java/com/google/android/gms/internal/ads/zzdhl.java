package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdhl implements zzeej<ScheduledExecutorService> {
    private final zzeew<ThreadFactory> zzgun;

    public zzdhl(zzeew<ThreadFactory> zzeew) {
        this.zzgun = zzeew;
    }

    public final /* synthetic */ Object get() {
        return (ScheduledExecutorService) zzeep.zza(new ScheduledThreadPoolExecutor(1, this.zzgun.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
