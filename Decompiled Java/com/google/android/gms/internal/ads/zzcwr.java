package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwr implements zzcyb<Bundle>, zzcye<zzcyb<Bundle>> {
    private final ApplicationInfo applicationInfo;
    private final PackageInfo zzdju;

    zzcwr(ApplicationInfo applicationInfo2, @Nullable PackageInfo packageInfo) {
        this.applicationInfo = applicationInfo2;
        this.zzdju = packageInfo;
    }

    public final zzdof<zzcyb<Bundle>> zzapb() {
        return zzdnt.zzaj(this);
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.applicationInfo.packageName;
        PackageInfo packageInfo = this.zzdju;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
    }
}
