package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxr implements zzeej<zzcxp> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzfda;
    private final zzeew<zzdoe> zzfev;

    private zzcxr(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2, zzeew<zzazo> zzeew3) {
        this.zzfev = zzeew;
        this.zzelc = zzeew2;
        this.zzfda = zzeew3;
    }

    public static zzcxr zzr(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2, zzeew<zzazo> zzeew3) {
        return new zzcxr(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzcxp(this.zzfev.get(), this.zzelc.get(), this.zzfda.get());
    }
}
