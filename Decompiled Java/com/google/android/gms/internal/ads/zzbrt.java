package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbrt implements zzeej<zzbrr> {
    private final zzeew<Set<zzbuv<zzbrw>>> zzfgs;

    private zzbrt(zzeew<Set<zzbuv<zzbrw>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbrt zzm(zzeew<Set<zzbuv<zzbrw>>> zzeew) {
        return new zzbrt(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbrr(this.zzfgs.get());
    }
}
