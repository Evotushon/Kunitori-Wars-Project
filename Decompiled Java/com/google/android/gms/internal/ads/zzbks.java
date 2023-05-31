package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbks implements zzeej<Set<zzbuv<zzbrn>>> {
    private final zzbkq zzffu;
    private final zzeew<zzbmw> zzffv;

    public zzbks(zzbkq zzbkq, zzeew<zzbmw> zzeew) {
        this.zzffu = zzbkq;
        this.zzffv = zzeew;
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(Collections.singleton(new zzbuv(this.zzffv.get(), zzazq.zzdxp)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
