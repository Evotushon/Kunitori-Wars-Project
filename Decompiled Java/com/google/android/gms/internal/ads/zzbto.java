package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbto implements zzeej<Set<zzbuv<zzbqt>>> {
    private final zzbtl zzflk;

    private zzbto(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbto zzg(zzbtl zzbtl) {
        return new zzbto(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
