package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqi implements zzeej<zzbqg> {
    private final zzeew<Set<zzbuv<zztz>>> zzfgs;

    private zzbqi(zzeew<Set<zzbuv<zztz>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbqi zzg(zzeew<Set<zzbuv<zztz>>> zzeew) {
        return new zzbqi(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbqg(this.zzfgs.get());
    }
}
