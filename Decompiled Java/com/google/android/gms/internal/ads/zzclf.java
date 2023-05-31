package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzclf implements zzeej<zzclc> {
    private final zzeew<Context> zzelc;

    private zzclf(zzeew<Context> zzeew) {
        this.zzelc = zzeew;
    }

    public static zzclf zzad(zzeew<Context> zzeew) {
        return new zzclf(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzclc(this.zzelc.get());
    }
}
