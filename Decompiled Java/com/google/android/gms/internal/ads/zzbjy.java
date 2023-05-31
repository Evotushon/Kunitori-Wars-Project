package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjy implements zzeej<zzbjz> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzpo> zzfeh;

    private zzbjy(zzeew<Context> zzeew, zzeew<zzpo> zzeew2) {
        this.zzelc = zzeew;
        this.zzfeh = zzeew2;
    }

    public static zzbjy zza(zzeew<Context> zzeew, zzeew<zzpo> zzeew2) {
        return new zzbjy(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzbjz(this.zzelc.get(), this.zzfeh.get());
    }
}
