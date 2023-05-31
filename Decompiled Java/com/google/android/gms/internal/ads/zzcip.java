package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcip implements zzeej<ApplicationInfo> {
    private final zzeew<Context> zzelc;

    private zzcip(zzeew<Context> zzeew) {
        this.zzelc = zzeew;
    }

    public static zzcip zzab(zzeew<Context> zzeew) {
        return new zzcip(zzeew);
    }

    public static ApplicationInfo zzcd(Context context) {
        return (ApplicationInfo) zzeep.zza(context.getApplicationInfo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzcd(this.zzelc.get());
    }
}
