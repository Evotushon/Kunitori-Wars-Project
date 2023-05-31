package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbtp implements zzeej<zzbqk> {
    private final zzbtl zzflk;
    private final zzeew<Set<zzbuv<zzbqm>>> zzfll;

    private zzbtp(zzbtl zzbtl, zzeew<Set<zzbuv<zzbqm>>> zzeew) {
        this.zzflk = zzbtl;
        this.zzfll = zzeew;
    }

    public static zzbtp zza(zzbtl zzbtl, zzeew<Set<zzbuv<zzbqm>>> zzeew) {
        return new zzbtp(zzbtl, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbqk) zzeep.zza(this.zzflk.zzc(this.zzfll.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
