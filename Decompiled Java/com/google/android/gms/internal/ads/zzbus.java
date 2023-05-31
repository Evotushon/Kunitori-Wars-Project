package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbus implements zzeej<zzbur> {
    private final zzeew<Set<zzbuv<zzbuo>>> zzfgs;

    private zzbus(zzeew<Set<zzbuv<zzbuo>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbus zzs(zzeew<Set<zzbuv<zzbuo>>> zzeew) {
        return new zzbus(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbur(this.zzfgs.get());
    }
}
