package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzblu implements zzeej<Set<zzbuv<zzbrn>>> {
    private final zzeew<zzbmw> zzffv;
    private final zzbln zzfgr;

    public zzblu(zzbln zzbln, zzeew<zzbmw> zzeew) {
        this.zzfgr = zzbln;
        this.zzffv = zzeew;
    }

    public static Set<zzbuv<zzbrn>> zza(zzbln zzbln, zzbmw zzbmw) {
        return (Set) zzeep.zza(Collections.singleton(new zzbuv(zzbmw, zzazq.zzdxp)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfgr, this.zzffv.get());
    }
}
