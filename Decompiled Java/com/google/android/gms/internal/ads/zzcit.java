package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcit implements zzeej<String> {
    private final zzeew<Context> zzelc;

    private zzcit(zzeew<Context> zzeew) {
        this.zzelc = zzeew;
    }

    public static zzcit zzac(zzeew<Context> zzeew) {
        return new zzcit(zzeew);
    }

    public static String zzcf(Context context) {
        return (String) zzeep.zza(context.getPackageName(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzcf(this.zzelc.get());
    }
}
