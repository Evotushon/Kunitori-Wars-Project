package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcaa implements zzeej<zzbzy> {
    private final zzeew<zzccv> zzepo;
    private final zzeew<Clock> zzfex;

    public zzcaa(zzeew<zzccv> zzeew, zzeew<Clock> zzeew2) {
        this.zzepo = zzeew;
        this.zzfex = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return new zzbzy(this.zzepo.get(), this.zzfex.get());
    }
}
