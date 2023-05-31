package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbtx implements zzeej<Set<zzbuv<zzbqu>>> {
    private final zzbtl zzflk;

    private zzbtx(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbtx zzo(zzbtl zzbtl) {
        return new zzbtx(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(this.zzflk.zzaio(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
