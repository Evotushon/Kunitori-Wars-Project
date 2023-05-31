package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbtt implements zzeej<Set<zzbuv<zzbsr>>> {
    private final zzbtl zzflk;

    private zzbtt(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbtt zzl(zzbtl zzbtl) {
        return new zzbtt(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
