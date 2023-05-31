package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpd implements zzeej<zzbuv<zzbqt>> {
    private final zzeew<zzbpk> zzffc;
    private final zzboz zzfji;

    private zzbpd(zzboz zzboz, zzeew<zzbpk> zzeew) {
        this.zzfji = zzboz;
        this.zzffc = zzeew;
    }

    public static zzbpd zzc(zzboz zzboz, zzeew<zzbpk> zzeew) {
        return new zzbpd(zzboz, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
