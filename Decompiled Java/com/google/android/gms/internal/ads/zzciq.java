package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzciq implements zzeej<PackageInfo> {
    private final zzeew<Context> zzelc;
    private final zzeew<ApplicationInfo> zzfxt;

    private zzciq(zzeew<Context> zzeew, zzeew<ApplicationInfo> zzeew2) {
        this.zzelc = zzeew;
        this.zzfxt = zzeew2;
    }

    public static zzciq zzaj(zzeew<Context> zzeew, zzeew<ApplicationInfo> zzeew2) {
        return new zzciq(zzeew, zzeew2);
    }

    @Nullable
    public final /* synthetic */ Object get() {
        return zzcig.zza(this.zzelc.get(), this.zzfxt.get());
    }
}
