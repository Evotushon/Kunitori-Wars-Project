package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfu implements zzeej<Context> {
    private final zzdfp zzgri;
    private final zzeew<zzdfn> zzgrk;

    private zzdfu(zzdfp zzdfp, zzeew<zzdfn> zzeew) {
        this.zzgri = zzdfp;
        this.zzgrk = zzeew;
    }

    public static zzdfu zzc(zzdfp zzdfp, zzeew<zzdfn> zzeew) {
        return new zzdfu(zzdfp, zzeew);
    }

    public static Context zzb(zzdfp zzdfp, zzdfn zzdfn) {
        return (Context) zzeep.zza(zzdfn.zzyz, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzgri, this.zzgrk.get());
    }
}
