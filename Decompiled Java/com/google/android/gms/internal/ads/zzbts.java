package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbts implements zzeej<Set<zzbuv<zztz>>> {
    private final zzbtl zzflk;

    private zzbts(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbts zzk(zzbtl zzbtl) {
        return new zzbts(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(this.zzflk.zzain(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
