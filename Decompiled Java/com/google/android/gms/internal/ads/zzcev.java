package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcev implements zzeej<zzbuv<zzbqt>> {
    private final zzeew<zzceq> zzffv;
    private final zzces zzfuu;

    private zzcev(zzces zzces, zzeew<zzceq> zzeew) {
        this.zzfuu = zzces;
        this.zzffv = zzeew;
    }

    public static zzcev zza(zzces zzces, zzeew<zzceq> zzeew) {
        return new zzcev(zzces, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffv.get(), zzazq.zzdxo), "Cannot return null from a non-@Nullable @Provides method");
    }
}
