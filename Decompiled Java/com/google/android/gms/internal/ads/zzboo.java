package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzboo implements zzeej<zzbop> {
    private final zzeew<Clock> zzfex;
    private final zzeew<zzavq> zzfjc;

    private zzboo(zzeew<Clock> zzeew, zzeew<zzavq> zzeew2) {
        this.zzfex = zzeew;
        this.zzfjc = zzeew2;
    }

    public static zzboo zzd(zzeew<Clock> zzeew, zzeew<zzavq> zzeew2) {
        return new zzboo(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzbop(this.zzfex.get(), this.zzfjc.get());
    }
}
