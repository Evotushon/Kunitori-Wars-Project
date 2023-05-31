package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwe implements zzeej<zzbuv<zzbrn>> {
    private final zzeew<zzbxa> zzffv;
    private final zzbvz zzfmc;

    private zzbwe(zzbvz zzbvz, zzeew<zzbxa> zzeew) {
        this.zzfmc = zzbvz;
        this.zzffv = zzeew;
    }

    public static zzbwe zzb(zzbvz zzbvz, zzeew<zzbxa> zzeew) {
        return new zzbwe(zzbvz, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffv.get(), zzazq.zzdxo), "Cannot return null from a non-@Nullable @Provides method");
    }
}
