package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpc implements zzeej<zzbuv<zzbrn>> {
    private final zzeew<zzbpk> zzffc;
    private final zzboz zzfji;

    private zzbpc(zzboz zzboz, zzeew<zzbpk> zzeew) {
        this.zzfji = zzboz;
        this.zzffc = zzeew;
    }

    public static zzbpc zzb(zzboz zzboz, zzeew<zzbpk> zzeew) {
        return new zzbpc(zzboz, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
