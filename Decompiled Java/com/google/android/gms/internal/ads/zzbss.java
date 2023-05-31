package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbss implements zzeej<zzbsq> {
    private final zzeew<Set<zzbuv<zzbsr>>> zzfgs;

    private zzbss(zzeew<Set<zzbuv<zzbsr>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbss zzo(zzeew<Set<zzbuv<zzbsr>>> zzeew) {
        return new zzbss(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbsq(this.zzfgs.get());
    }
}
