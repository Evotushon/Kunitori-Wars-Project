package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvk implements zzeej<zzdeg> {
    private final zzeew<Clock> zzfex;

    public zzcvk(zzeew<Clock> zzeew) {
        this.zzfex = zzeew;
    }

    public final /* synthetic */ Object get() {
        return (zzdeg) zzeep.zza(new zzdeg(this.zzfex.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
