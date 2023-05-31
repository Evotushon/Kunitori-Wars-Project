package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbok implements zzeej<zzbuv<zzbrn>> {
    private final zzbog zzfja;
    private final zzeew<zzbop> zzfjb;

    private zzbok(zzbog zzbog, zzeew<zzbop> zzeew) {
        this.zzfja = zzbog;
        this.zzfjb = zzeew;
    }

    public static zzbok zzc(zzbog zzbog, zzeew<zzbop> zzeew) {
        return new zzbok(zzbog, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzfjb.get(), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
