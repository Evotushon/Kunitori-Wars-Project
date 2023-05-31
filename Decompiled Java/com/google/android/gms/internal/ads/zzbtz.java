package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbtz implements zzeej<Set<zzbuv<zzbrn>>> {
    private final zzbtl zzflk;

    private zzbtz(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbtz zzq(zzbtl zzbtl) {
        return new zzbtz(zzbtl);
    }

    public static Set<zzbuv<zzbrn>> zzr(zzbtl zzbtl) {
        return (Set) zzeep.zza(zzbtl.zzaii(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzr(this.zzflk);
    }
}
