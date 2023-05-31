package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbuf implements zzeej<Set<zzbuv<zzpt>>> {
    private final zzbtl zzflk;

    private zzbuf(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbuf zzx(zzbtl zzbtl) {
        return new zzbuf(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
