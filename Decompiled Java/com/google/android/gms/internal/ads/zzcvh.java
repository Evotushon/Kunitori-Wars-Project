package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvh implements zzeej<zzcvg<zzcyh>> {
    private final zzeew<zzcyk> zzemh;
    private final zzeew<Clock> zzfex;

    public zzcvh(zzeew<zzcyk> zzeew, zzeew<Clock> zzeew2) {
        this.zzemh = zzeew;
        this.zzfex = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return (zzcvg) zzeep.zza(new zzcvg(this.zzemh.get(), zzaba.zzcto.get().longValue(), this.zzfex.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
