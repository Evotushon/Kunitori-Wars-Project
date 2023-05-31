package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwu implements zzeej<zzcwr> {
    private final zzeew<PackageInfo> zzfju;
    private final zzeew<ApplicationInfo> zzfxt;

    private zzcwu(zzeew<ApplicationInfo> zzeew, zzeew<PackageInfo> zzeew2) {
        this.zzfxt = zzeew;
        this.zzfju = zzeew2;
    }

    public static zzcwu zzaw(zzeew<ApplicationInfo> zzeew, zzeew<PackageInfo> zzeew2) {
        return new zzcwu(zzeew, zzeew2);
    }

    public static zzcwr zza(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new zzcwr(applicationInfo, packageInfo);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfxt.get(), this.zzfju.get());
    }
}
