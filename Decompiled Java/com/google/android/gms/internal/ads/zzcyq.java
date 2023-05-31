package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyq implements zzeej<zzcyo> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdoe> zzfev;

    private zzcyq(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2) {
        this.zzfev = zzeew;
        this.zzelc = zzeew2;
    }

    public static zzcyq zzbb(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2) {
        return new zzcyq(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcyo(this.zzfev.get(), this.zzelc.get());
    }
}
