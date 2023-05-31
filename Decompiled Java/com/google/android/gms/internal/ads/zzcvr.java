package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvr implements zzeej<zzcvp> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdoe> zzfev;

    private zzcvr(zzeew<Context> zzeew, zzeew<zzdoe> zzeew2) {
        this.zzelc = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzcvr zzau(zzeew<Context> zzeew, zzeew<zzdoe> zzeew2) {
        return new zzcvr(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcvp(this.zzelc.get(), this.zzfev.get());
    }
}
