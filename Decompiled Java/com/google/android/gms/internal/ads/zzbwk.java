package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwk implements zzeej<Set<zzbuv<zzbuo>>> {
    private final zzeew<zzbxe> zzffv;

    private zzbwk(zzeew<zzbxe> zzeew) {
        this.zzffv = zzeew;
    }

    public static zzbwk zzv(zzeew<zzbxe> zzeew) {
        return new zzbwk(zzeew);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(Collections.singleton(zzbuv.zzb(this.zzffv.get(), zzazq.zzdxp)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
