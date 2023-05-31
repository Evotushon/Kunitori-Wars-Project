package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfi implements zzeej<Clock> {
    private final zzdff zzgre;

    public zzdfi(zzdff zzdff) {
        this.zzgre = zzdff;
    }

    public final /* synthetic */ Object get() {
        return (Clock) zzeep.zza(DefaultClock.getInstance(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
