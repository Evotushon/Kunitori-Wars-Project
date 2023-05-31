package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzb;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnb implements zzcly<zzbvu> {
    private final zzdeg zzfdn;
    private final Executor zzfeo;
    private final zzbwt zzgbv;
    private final Context zzur;

    public zzcnb(Context context, Executor executor, zzbwt zzbwt, zzdeg zzdeg) {
        this.zzur = context;
        this.zzgbv = zzbwt;
        this.zzfeo = executor;
        this.zzfdn = zzdeg;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return (this.zzur instanceof Activity) && PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzaau.zzl(this.zzur) && !TextUtils.isEmpty(zzc(zzdei));
    }

    public final zzdof<zzbvu> zzb(zzdeq zzdeq, zzdei zzdei) {
        String zzc = zzc(zzdei);
        return zzdnt.zzb(zzdnt.zzaj(null), new zzcna(this, zzc != null ? Uri.parse(zzc) : null, zzdeq, zzdei), this.zzfeo);
    }

    private static String zzc(zzdei zzdei) {
        try {
            return zzdei.zzgpt.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(Uri uri, zzdeq zzdeq, zzdei zzdei, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            zzb zzb = new zzb(build.intent);
            zzazy zzazy = new zzazy();
            zzbvw zza = this.zzgbv.zza(new zzbnv(zzdeq, zzdei, (String) null), new zzbvz(new zzcnd(zzazy)));
            zzazy.set(new AdOverlayInfoParcel(zzb, (zztz) null, zza.zzaey(), (zzv) null, new zzazo(0, 0, false)));
            this.zzfdn.zzvg();
            return zzdnt.zzaj(zza.zzaex());
        } catch (Throwable th) {
            zzawf.zzc("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
