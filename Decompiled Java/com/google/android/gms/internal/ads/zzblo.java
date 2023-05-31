package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzblo implements zzeej<zzbrm> {
    private final zzbln zzfgr;
    private final zzeew<Set<zzbuv<zzbrn>>> zzfgs;

    public zzblo(zzbln zzbln, zzeew<Set<zzbuv<zzbrn>>> zzeew) {
        this.zzfgr = zzbln;
        this.zzfgs = zzeew;
    }

    public static zzbrm zza(zzbln zzbln, Set<zzbuv<zzbrn>> set) {
        return (zzbrm) zzeep.zza(zzbln.zza(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfgr, this.zzfgs.get());
    }
}
