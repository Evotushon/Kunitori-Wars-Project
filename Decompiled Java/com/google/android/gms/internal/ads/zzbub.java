package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbub implements zzeej<Set<zzbuv<zzbrw>>> {
    private final zzbtl zzflk;

    private zzbub(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbub zzt(zzbtl zzbtl) {
        return new zzbub(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(this.zzflk.zzaip(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
