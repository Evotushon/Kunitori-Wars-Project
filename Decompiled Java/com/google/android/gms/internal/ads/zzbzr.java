package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzr implements zzeej<zzbyz> {
    private final zzbzl zzfqb;

    private zzbzr(zzbzl zzbzl) {
        this.zzfqb = zzbzl;
    }

    public static zzbzr zzb(zzbzl zzbzl) {
        return new zzbzr(zzbzl);
    }

    public static zzbyz zzc(zzbzl zzbzl) {
        return (zzbyz) zzeep.zza(zzbzl.zzalc(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzc(this.zzfqb);
    }
}
