package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbtr implements zzeej<Set<zzbuv<zzbrn>>> {
    private final zzbtl zzflk;

    private zzbtr(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbtr zzi(zzbtl zzbtl) {
        return new zzbtr(zzbtl);
    }

    public static Set<zzbuv<zzbrn>> zzj(zzbtl zzbtl) {
        return (Set) zzeep.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzj(this.zzflk);
    }
}
