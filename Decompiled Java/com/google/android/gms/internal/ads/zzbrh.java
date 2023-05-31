package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbrh implements zzeej<zzbrc> {
    private final zzeew<Set<zzbuv<zzbqh>>> zzfgs;

    private zzbrh(zzeew<Set<zzbuv<zzbqh>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbrh zzj(zzeew<Set<zzbuv<zzbqh>>> zzeew) {
        return new zzbrh(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbrc(this.zzfgs.get());
    }
}
