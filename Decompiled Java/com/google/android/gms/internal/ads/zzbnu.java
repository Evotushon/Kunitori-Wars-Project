package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbnu implements zzeej<zzdei> {
    private final zzbnv zzfij;

    private zzbnu(zzbnv zzbnv) {
        this.zzfij = zzbnv;
    }

    public static zzbnu zza(zzbnv zzbnv) {
        return new zzbnu(zzbnv);
    }

    public static zzdei zzb(zzbnv zzbnv) {
        return (zzdei) zzeep.zza(zzbnv.zzahn(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzfij);
    }
}
