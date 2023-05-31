package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfs implements zzeej<zzawh> {
    private final zzdfp zzgri;
    private final zzeew<zzdfn> zzgrk;

    private zzdfs(zzdfp zzdfp, zzeew<zzdfn> zzeew) {
        this.zzgri = zzdfp;
        this.zzgrk = zzeew;
    }

    public static zzdfs zza(zzdfp zzdfp, zzeew<zzdfn> zzeew) {
        return new zzdfs(zzdfp, zzeew);
    }

    public static zzawh zza(zzdfp zzdfp, zzdfn zzdfn) {
        return (zzawh) zzeep.zza(zzdfn.zzdsq, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzgri, this.zzgrk.get());
    }
}
