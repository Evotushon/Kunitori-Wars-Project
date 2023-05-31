package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxm implements zzeej<zzbxk> {
    private final zzbxk zzfmu;

    private zzbxm(zzbxk zzbxk) {
        this.zzfmu = zzbxk;
    }

    public static zzbxm zzc(zzbxk zzbxk) {
        return new zzbxm(zzbxk);
    }

    public final /* synthetic */ Object get() {
        zzbxk zzbxk = this.zzfmu;
        if (zzbxk != null) {
            return (zzbxk) zzeep.zza(zzbxk, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
