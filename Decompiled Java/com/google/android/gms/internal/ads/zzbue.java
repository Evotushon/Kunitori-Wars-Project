package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbue implements zzeej<Set<zzbuv<zzbva>>> {
    private final zzbtl zzflk;

    private zzbue(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbue zzw(zzbtl zzbtl) {
        return new zzbue(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
