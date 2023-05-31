package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpo implements zzeej<zzbpm> {
    private final zzeew<zzawh> zzerc;
    private final zzeew<zzcyd<Bundle>> zzetv;
    private final zzeew<zzazo> zzffi;
    private final zzeew<zzdif> zzfgx;
    private final zzeew<ApplicationInfo> zzfjr;
    private final zzeew<String> zzfjs;
    private final zzeew<List<String>> zzfjt;
    private final zzeew<PackageInfo> zzfju;
    private final zzeew<zzdof<String>> zzfjv;
    private final zzeew<String> zzfjw;

    private zzbpo(zzeew<zzdif> zzeew, zzeew<zzazo> zzeew2, zzeew<ApplicationInfo> zzeew3, zzeew<String> zzeew4, zzeew<List<String>> zzeew5, zzeew<PackageInfo> zzeew6, zzeew<zzdof<String>> zzeew7, zzeew<zzawh> zzeew8, zzeew<String> zzeew9, zzeew<zzcyd<Bundle>> zzeew10) {
        this.zzfgx = zzeew;
        this.zzffi = zzeew2;
        this.zzfjr = zzeew3;
        this.zzfjs = zzeew4;
        this.zzfjt = zzeew5;
        this.zzfju = zzeew6;
        this.zzfjv = zzeew7;
        this.zzerc = zzeew8;
        this.zzfjw = zzeew9;
        this.zzetv = zzeew10;
    }

    public static zzbpo zza(zzeew<zzdif> zzeew, zzeew<zzazo> zzeew2, zzeew<ApplicationInfo> zzeew3, zzeew<String> zzeew4, zzeew<List<String>> zzeew5, zzeew<PackageInfo> zzeew6, zzeew<zzdof<String>> zzeew7, zzeew<zzawh> zzeew8, zzeew<String> zzeew9, zzeew<zzcyd<Bundle>> zzeew10) {
        return new zzbpo(zzeew, zzeew2, zzeew3, zzeew4, zzeew5, zzeew6, zzeew7, zzeew8, zzeew9, zzeew10);
    }

    public final /* synthetic */ Object get() {
        return new zzbpm(this.zzfgx.get(), this.zzffi.get(), this.zzfjr.get(), this.zzfjs.get(), this.zzfjt.get(), this.zzfju.get(), zzeek.zzar(this.zzfjv), this.zzerc.get(), this.zzfjw.get(), this.zzetv.get());
    }
}
