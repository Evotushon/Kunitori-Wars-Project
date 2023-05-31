package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzblh implements zzeej<zzbsf> {
    private final zzeew<Clock> zzfex;
    private final zzeew<ScheduledExecutorService> zzfgc;

    public zzblh(zzeew<ScheduledExecutorService> zzeew, zzeew<Clock> zzeew2) {
        this.zzfgc = zzeew;
        this.zzfex = zzeew2;
    }

    public static zzbsf zza(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return (zzbsf) zzeep.zza(new zzbsf(scheduledExecutorService, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfgc.get(), this.zzfex.get());
    }
}
