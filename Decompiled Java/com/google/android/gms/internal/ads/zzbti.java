package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbti implements zzeej<zzbsz> {
    private final zzeew<Set<zzbuv<zzbth>>> zzfgs;

    private zzbti(zzeew<Set<zzbuv<zzbth>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbti zzr(zzeew<Set<zzbuv<zzbth>>> zzeew) {
        return new zzbti(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbsz(this.zzfgs.get());
    }
}
