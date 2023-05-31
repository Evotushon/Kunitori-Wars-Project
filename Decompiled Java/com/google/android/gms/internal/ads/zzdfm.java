package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfm implements zzeej<zzdfj> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzawc> zzeqr;

    private zzdfm(zzeew<Context> zzeew, zzeew<zzawc> zzeew2) {
        this.zzelc = zzeew;
        this.zzeqr = zzeew2;
    }

    public static zzdfm zzbc(zzeew<Context> zzeew, zzeew<zzawc> zzeew2) {
        return new zzdfm(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzdfj(this.zzelc.get(), this.zzeqr.get());
    }
}
