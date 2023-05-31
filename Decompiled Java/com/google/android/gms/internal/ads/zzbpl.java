package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpl implements zzeej<zzbsf> {
    private final zzeew<zzbsf> zzfjm;

    private zzbpl(zzeew<zzbsf> zzeew) {
        this.zzfjm = zzeew;
    }

    public static zzbpl zzf(zzeew<zzbsf> zzeew) {
        return new zzbpl(zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbsf) zzeep.zza(this.zzfjm.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
