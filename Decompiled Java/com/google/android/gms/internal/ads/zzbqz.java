package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqz implements zzeej<zzbqw> {
    private final zzeew<Set<zzbuv<zzbqt>>> zzfgs;

    private zzbqz(zzeew<Set<zzbuv<zzbqt>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbqz zzi(zzeew<Set<zzbuv<zzbqt>>> zzeew) {
        return new zzbqz(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbqw(this.zzfgs.get());
    }
}
