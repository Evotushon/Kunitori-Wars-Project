package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzblz implements zzeej<Set<zzbuv<zzpt>>> {
    private final zzeew<zzbmw> zzffv;
    private final zzbln zzfgr;

    public zzblz(zzbln zzbln, zzeew<zzbmw> zzeew) {
        this.zzfgr = zzbln;
        this.zzffv = zzeew;
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(Collections.singleton(new zzbuv(this.zzffv.get(), zzazq.zzdxp)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
