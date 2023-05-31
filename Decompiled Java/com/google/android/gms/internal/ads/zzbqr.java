package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqr implements zzeej<zzbqp> {
    private final zzeew<Set<zzbuv<zzbqu>>> zzfgs;

    private zzbqr(zzeew<Set<zzbuv<zzbqu>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbqr zzh(zzeew<Set<zzbuv<zzbqu>>> zzeew) {
        return new zzbqr(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbqp(this.zzfgs.get());
    }
}
