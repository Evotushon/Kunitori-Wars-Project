package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcuy implements zzeej<zzcuw> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdoe> zzfev;

    private zzcuy(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2) {
        this.zzfev = zzeew;
        this.zzelc = zzeew2;
    }

    public static zzcuy zzas(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2) {
        return new zzcuy(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcuw(this.zzfev.get(), this.zzelc.get());
    }
}
