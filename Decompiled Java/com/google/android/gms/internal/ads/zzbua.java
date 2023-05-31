package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbua implements zzeej<Set<zzbuv<zzbsg>>> {
    private final zzbtl zzflk;

    private zzbua(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbua zzs(zzbtl zzbtl) {
        return new zzbua(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(this.zzflk.zzaiq(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
