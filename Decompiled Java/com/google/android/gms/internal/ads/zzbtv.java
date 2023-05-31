package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbtv implements zzeej<Set<zzbuv<zzbqm>>> {
    private final zzbtl zzflk;

    private zzbtv(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbtv zzm(zzbtl zzbtl) {
        return new zzbtv(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(this.zzflk.zzaij(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
