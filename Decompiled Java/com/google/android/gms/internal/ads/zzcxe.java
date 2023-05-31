package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxe implements zzeej<zzcxc> {
    private final zzeew<Context> zzelc;
    private final zzeew<String> zzeqp;

    private zzcxe(zzeew<Context> zzeew, zzeew<String> zzeew2) {
        this.zzelc = zzeew;
        this.zzeqp = zzeew2;
    }

    public static zzcxe zzay(zzeew<Context> zzeew, zzeew<String> zzeew2) {
        return new zzcxe(zzeew, zzeew2);
    }

    public static zzcxc zzt(Context context, String str) {
        return new zzcxc(context, str);
    }

    public final /* synthetic */ Object get() {
        return zzt(this.zzelc.get(), this.zzeqp.get());
    }
}
