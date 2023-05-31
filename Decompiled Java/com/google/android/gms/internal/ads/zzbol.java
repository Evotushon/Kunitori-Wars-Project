package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbol implements zzeej<zzbuv<zzbqu>> {
    private final zzbog zzfja;
    private final zzeew<zzbop> zzfjb;

    private zzbol(zzbog zzbog, zzeew<zzbop> zzeew) {
        this.zzfja = zzbog;
        this.zzfjb = zzeew;
    }

    public static zzbol zzd(zzbog zzbog, zzeew<zzbop> zzeew) {
        return new zzbol(zzbog, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzfjb.get(), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
