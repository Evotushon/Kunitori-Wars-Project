package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfr implements zzeej<zzdfn> {
    private final zzeew<zzdfl> zzfet;
    private final zzdfp zzgri;
    private final zzeew<String> zzgrj;

    private zzdfr(zzdfp zzdfp, zzeew<zzdfl> zzeew, zzeew<String> zzeew2) {
        this.zzgri = zzdfp;
        this.zzfet = zzeew;
        this.zzgrj = zzeew2;
    }

    public static zzdfr zza(zzdfp zzdfp, zzeew<zzdfl> zzeew, zzeew<String> zzeew2) {
        return new zzdfr(zzdfp, zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzdfn) zzeep.zza(this.zzfet.get().zzgo(this.zzgrj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
