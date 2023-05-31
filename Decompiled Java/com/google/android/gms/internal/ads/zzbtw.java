package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbtw implements zzeej<Set<zzbuv<zzbqh>>> {
    private final zzbtl zzflk;

    private zzbtw(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbtw zzn(zzbtl zzbtl) {
        return new zzbtw(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(this.zzflk.zzaih(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
