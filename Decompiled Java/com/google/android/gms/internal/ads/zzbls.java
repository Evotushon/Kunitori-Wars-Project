package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbls implements zzeej<zzblg> {
    private final zzeew<zzbli> zzeze;
    private final zzbln zzfgr;

    public zzbls(zzbln zzbln, zzeew<zzbli> zzeew) {
        this.zzfgr = zzbln;
        this.zzeze = zzeew;
    }

    public static zzblg zza(zzbln zzbln, Object obj) {
        return (zzblg) zzeep.zza((zzbli) obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfgr, this.zzeze.get());
    }
}
