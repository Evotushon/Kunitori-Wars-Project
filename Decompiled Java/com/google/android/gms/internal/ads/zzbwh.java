package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwh implements zzeej<zzbuv<zzp>> {
    private final zzeew<zzbxa> zzffv;
    private final zzbvz zzfmc;

    private zzbwh(zzbvz zzbvz, zzeew<zzbxa> zzeew) {
        this.zzfmc = zzbvz;
        this.zzffv = zzeew;
    }

    public static zzbwh zzc(zzbvz zzbvz, zzeew<zzbxa> zzeew) {
        return new zzbwh(zzbvz, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffv.get(), zzazq.zzdxo), "Cannot return null from a non-@Nullable @Provides method");
    }
}
