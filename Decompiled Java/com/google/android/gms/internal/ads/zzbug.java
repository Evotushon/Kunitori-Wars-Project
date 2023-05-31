package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbug implements zzeej<zzcpc> {
    private final zzeew<Clock> zzfex;
    private final zzbtl zzflk;

    private zzbug(zzbtl zzbtl, zzeew<Clock> zzeew) {
        this.zzflk = zzbtl;
        this.zzfex = zzeew;
    }

    public static zzbug zzb(zzbtl zzbtl, zzeew<Clock> zzeew) {
        return new zzbug(zzbtl, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzcpc) zzeep.zza(this.zzflk.zza(this.zzfex.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
