package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfk implements zzeej<zzbuv<zzbqm>> {
    private final zzeew<zzdfj> zzfjb;
    private final zzdfh zzgrg;

    private zzdfk(zzdfh zzdfh, zzeew<zzdfj> zzeew) {
        this.zzgrg = zzdfh;
        this.zzfjb = zzeew;
    }

    public static zzdfk zza(zzdfh zzdfh, zzeew<zzdfj> zzeew) {
        return new zzdfk(zzdfh, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzfjb.get(), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
