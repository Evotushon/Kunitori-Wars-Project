package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzboj implements zzeej<zzbuv<zztz>> {
    private final zzbog zzfja;
    private final zzeew<zzbop> zzfjb;

    private zzboj(zzbog zzbog, zzeew<zzbop> zzeew) {
        this.zzfja = zzbog;
        this.zzfjb = zzeew;
    }

    public static zzboj zzb(zzbog zzbog, zzeew<zzbop> zzeew) {
        return new zzboj(zzbog, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzfjb.get(), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
