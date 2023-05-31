package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdin implements zzeej<zzdii> {
    private final zzeew<Set<zzbuv<zzdil>>> zzfgs;

    private zzdin(zzeew<Set<zzbuv<zzdil>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzdin zzap(zzeew<Set<zzbuv<zzdil>>> zzeew) {
        return new zzdin(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzdii(this.zzfgs.get());
    }
}
