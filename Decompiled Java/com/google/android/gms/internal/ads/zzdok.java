package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdok<V> extends zzdnr<V> implements zzdof<V>, ScheduledFuture<V> {
    private final ScheduledFuture<?> zzhdk;

    public zzdok(zzdof<V> zzdof, ScheduledFuture<?> scheduledFuture) {
        super(zzdof);
        this.zzhdk = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.zzhdk.cancel(z);
        }
        return cancel;
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.zzhdk.getDelay(timeUnit);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzhdk.compareTo((Delayed) obj);
    }
}
