package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpm {
    private final String packageName;
    private final zzazo zzblr;
    private final PackageInfo zzdju;
    private final List<String> zzdke;
    private final String zzdnb;
    private final zzawh zzdsq;
    private final zzdif zzfis;
    private final ApplicationInfo zzfjn;
    private final zzeed<zzdof<String>> zzfjo;
    private final zzcyd<Bundle> zzfjp;

    public zzbpm(zzdif zzdif, zzazo zzazo, ApplicationInfo applicationInfo, String str, List<String> list, @Nullable PackageInfo packageInfo, zzeed<zzdof<String>> zzeed, zzawh zzawh, String str2, zzcyd<Bundle> zzcyd) {
        this.zzfis = zzdif;
        this.zzblr = zzazo;
        this.zzfjn = applicationInfo;
        this.packageName = str;
        this.zzdke = list;
        this.zzdju = packageInfo;
        this.zzfjo = zzeed;
        this.zzdsq = zzawh;
        this.zzdnb = str2;
        this.zzfjp = zzcyd;
    }

    public final zzdof<Bundle> zzahs() {
        return this.zzfis.zzu(zzdig.SIGNALS).zze(this.zzfjp.zzt(new Bundle())).zzata();
    }

    public final zzdof<zzaqx> zzaht() {
        zzdof<Bundle> zzahs = zzahs();
        return this.zzfis.zza(zzdig.REQUEST_PARCEL, (zzdof<?>[]) new zzdof[]{zzahs, this.zzfjo.get()}).zzb(new zzbpp(this, zzahs)).zzata();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzaqx zzc(zzdof zzdof) throws Exception {
        return new zzaqx((Bundle) zzdof.get(), this.zzblr, this.zzfjn, this.packageName, this.zzdke, this.zzdju, (String) this.zzfjo.get().get(), this.zzdsq.zzwd(), this.zzdnb, (zzdgg) null, (String) null);
    }
}
