package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwm implements zzeej<zzcwf> {
    private final zzeew<zzawh> zzerc;
    private final zzeew<zzdoe> zzfev;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<PackageInfo> zzfju;

    public zzcwm(zzeew<zzdoe> zzeew, zzeew<zzdeu> zzeew2, zzeew<PackageInfo> zzeew3, zzeew<zzawh> zzeew4) {
        this.zzfev = zzeew;
        this.zzfgu = zzeew2;
        this.zzfju = zzeew3;
        this.zzerc = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return new zzcwf(this.zzfev.get(), this.zzfgu.get(), this.zzfju.get(), this.zzerc.get());
    }
}
