package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbvb implements zzeej<zzbuz> {
    private final zzeew<Set<zzbuv<zzbva>>> zzfgs;

    private zzbvb(zzeew<Set<zzbuv<zzbva>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbvb zzt(zzeew<Set<zzbuv<zzbva>>> zzeew) {
        return new zzbvb(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbuz(this.zzfgs.get());
    }
}
