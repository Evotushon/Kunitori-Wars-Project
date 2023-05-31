package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdai implements zzeej<String> {
    private final zzdaf zzgmb;

    public zzdai(zzdaf zzdaf) {
        this.zzgmb = zzdaf;
    }

    public static String zzc(zzdaf zzdaf) {
        return (String) zzeep.zza(zzdaf.zzapv(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzc(this.zzgmb);
    }
}
