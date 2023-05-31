package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpy implements zzeej<String> {
    private final zzeew<zzbop> zzequ;
    private final zzbpt zzfkc;

    private zzbpy(zzbpt zzbpt, zzeew<zzbop> zzeew) {
        this.zzfkc = zzbpt;
        this.zzequ = zzeew;
    }

    public static zzbpy zzb(zzbpt zzbpt, zzeew<zzbop> zzeew) {
        return new zzbpy(zzbpt, zzeew);
    }

    public static String zza(zzbpt zzbpt, zzbop zzbop) {
        return (String) zzeep.zza(zzbop.zzvd(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfkc, this.zzequ.get());
    }
}
