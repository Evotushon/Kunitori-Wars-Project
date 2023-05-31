package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxn implements zzeej<zzcxl> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzaui> zzfdd;
    private final zzeew<zzdoe> zzfev;

    private zzcxn(zzeew<zzaui> zzeew, zzeew<zzdoe> zzeew2, zzeew<Context> zzeew3) {
        this.zzfdd = zzeew;
        this.zzfev = zzeew2;
        this.zzelc = zzeew3;
    }

    public static zzcxn zzq(zzeew<zzaui> zzeew, zzeew<zzdoe> zzeew2, zzeew<Context> zzeew3) {
        return new zzcxn(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzcxl(this.zzfdd.get(), this.zzfev.get(), this.zzelc.get());
    }
}
