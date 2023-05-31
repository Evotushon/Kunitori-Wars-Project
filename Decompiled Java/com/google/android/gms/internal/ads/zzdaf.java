package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdaf {
    private final zzaqx zzfyj;
    private final int zzgll;

    public zzdaf(zzaqx zzaqx, int i) {
        this.zzfyj = zzaqx;
        this.zzgll = i;
    }

    public final String zzapv() {
        return this.zzfyj.packageName;
    }

    public final String zzapw() {
        return this.zzfyj.zzdmz.getString("ms");
    }

    @Nullable
    public final PackageInfo zzapx() {
        return this.zzfyj.zzdju;
    }

    public final boolean zzapy() {
        return this.zzfyj.zzdna;
    }

    public final List<String> zzapz() {
        return this.zzfyj.zzdke;
    }

    public final ApplicationInfo zzaqa() {
        return this.zzfyj.applicationInfo;
    }

    public final String zzaqb() {
        return this.zzfyj.zzdnb;
    }

    public final int zzaqc() {
        return this.zzgll;
    }
}
