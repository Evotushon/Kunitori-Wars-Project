package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzblw implements zzeej<zzbuv<zzbrn>> {
    private final zzeew<zzbmu> zzffv;
    private final zzbln zzfgr;

    public zzblw(zzbln zzbln, zzeew<zzbmu> zzeew) {
        this.zzfgr = zzbln;
        this.zzffv = zzeew;
    }

    public static zzbuv<zzbrn> zza(zzbln zzbln, zzbmu zzbmu) {
        return (zzbuv) zzeep.zza(new zzbuv(zzbmu, zzazq.zzdxo), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfgr, this.zzffv.get());
    }
}
