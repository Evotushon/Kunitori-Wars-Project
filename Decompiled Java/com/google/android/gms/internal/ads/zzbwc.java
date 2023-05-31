package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwc implements zzeej<Set<zzbuv<zzbqh>>> {
    private final zzeew<zzbxc> zzffv;
    private final zzbvz zzfmc;

    private zzbwc(zzbvz zzbvz, zzeew<zzbxc> zzeew) {
        this.zzfmc = zzbvz;
        this.zzffv = zzeew;
    }

    public static zzbwc zza(zzbvz zzbvz, zzeew<zzbxc> zzeew) {
        return new zzbwc(zzbvz, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(this.zzfmc.zza(this.zzffv.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
