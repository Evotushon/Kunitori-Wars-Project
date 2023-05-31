package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzdno<V> extends zzdnx<V> {
    zzdno() {
    }

    public static <V> zzdno<V> zzg(zzdof<V> zzdof) {
        if (zzdof instanceof zzdno) {
            return (zzdno) zzdof;
        }
        return new zzdnq(zzdof);
    }

    public final <X extends Throwable> zzdno<V> zza(Class<X> cls, zzdku<? super X, ? extends V> zzdku, Executor executor) {
        zzdmu zzdmu = new zzdmu(this, cls, zzdku);
        addListener(zzdmu, zzdoh.zza(executor, zzdmu));
        return zzdmu;
    }

    public final zzdno<V> zza(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (zzdno) zzdnt.zza(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> zzdno<T> zzb(zzdng<? super V, T> zzdng, Executor executor) {
        zzdlg.checkNotNull(executor);
        zzdmy zzdmy = new zzdmy(this, zzdng);
        addListener(zzdmy, zzdoh.zza(executor, zzdmy));
        return zzdmy;
    }

    public final <T> zzdno<T> zza(zzdku<? super V, T> zzdku, Executor executor) {
        zzdlg.checkNotNull(zzdku);
        zzdmx zzdmx = new zzdmx(this, zzdku);
        addListener(zzdmx, zzdoh.zza(executor, zzdmx));
        return zzdmx;
    }
}
