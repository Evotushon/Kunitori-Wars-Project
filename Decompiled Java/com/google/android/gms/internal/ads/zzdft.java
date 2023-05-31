package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdft implements zzeej<zzawc> {
    private final zzdfp zzgri;
    private final zzeew<zzdfn> zzgrk;

    private zzdft(zzdfp zzdfp, zzeew<zzdfn> zzeew) {
        this.zzgri = zzdfp;
        this.zzgrk = zzeew;
    }

    public static zzdft zzb(zzdfp zzdfp, zzeew<zzdfn> zzeew) {
        return new zzdft(zzdfp, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzawc) zzeep.zza(this.zzgrk.get().zzdrf, "Cannot return null from a non-@Nullable @Provides method");
    }
}
