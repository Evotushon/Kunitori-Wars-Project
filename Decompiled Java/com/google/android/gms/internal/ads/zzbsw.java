package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbsw implements zzeej<zzbsu> {
    private final zzeew<Set<zzbuv<zzbsv>>> zzfgs;

    private zzbsw(zzeew<Set<zzbuv<zzbsv>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbsw zzp(zzeew<Set<zzbuv<zzbsv>>> zzeew) {
        return new zzbsw(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbsu(this.zzfgs.get());
    }
}
