package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcjs implements zzeej<zzcjt> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzaui> zzfdd;

    private zzcjs(zzeew<Context> zzeew, zzeew<zzaui> zzeew2) {
        this.zzelc = zzeew;
        this.zzfdd = zzeew2;
    }

    public static zzcjs zzak(zzeew<Context> zzeew, zzeew<zzaui> zzeew2) {
        return new zzcjs(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcjt(this.zzelc.get(), this.zzfdd.get());
    }
}
