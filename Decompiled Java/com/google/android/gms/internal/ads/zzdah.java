package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdah implements zzeej<ApplicationInfo> {
    private final zzdaf zzgmb;

    public zzdah(zzdaf zzdaf) {
        this.zzgmb = zzdaf;
    }

    public static ApplicationInfo zzb(zzdaf zzdaf) {
        return (ApplicationInfo) zzeep.zza(zzdaf.zzaqa(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzgmb);
    }
}
