package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbro implements zzeej<zzbrm> {
    private final zzeew<Set<zzbuv<zzbrn>>> zzfgs;

    private zzbro(zzeew<Set<zzbuv<zzbrn>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbro zzk(zzeew<Set<zzbuv<zzbrn>>> zzeew) {
        return new zzbro(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbrm(this.zzfgs.get());
    }
}
