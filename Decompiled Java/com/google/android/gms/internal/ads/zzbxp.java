package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxp implements zzeej<zzbzg> {
    private final zzbxk zzfmu;

    private zzbxp(zzbxk zzbxk) {
        this.zzfmu = zzbxk;
    }

    public static zzbxp zzd(zzbxk zzbxk) {
        return new zzbxp(zzbxk);
    }

    public static zzbzg zze(zzbxk zzbxk) {
        return (zzbzg) zzeep.zza(zzbxk.zzajk(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zze(this.zzfmu);
    }
}
