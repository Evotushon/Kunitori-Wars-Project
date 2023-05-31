package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctq implements zzcyb<Bundle> {
    private final zzdeu zzfir;

    public zzctq(zzdeu zzdeu) {
        Preconditions.checkNotNull(zzdeu, "the targeting must not be null");
        this.zzfir = zzdeu;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzuh zzuh = this.zzfir.zzgqq;
        bundle.putString("slotname", this.zzfir.zzgqr);
        boolean z = true;
        if (this.zzfir.zzgqx.contains("new_rewarded")) {
            bundle.putBoolean("is_new_rewarded", true);
        }
        zzdez.zza(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzuh.zzccm)), zzuh.zzccm != -1);
        zzdez.zza(bundle, "extras", zzuh.extras);
        zzdez.zza(bundle, "cust_gender", Integer.valueOf(zzuh.zzccn), zzuh.zzccn != -1);
        zzdez.zza(bundle, "kw", zzuh.zzcco);
        zzdez.zza(bundle, "tag_for_child_directed_treatment", Integer.valueOf(zzuh.zzabv), zzuh.zzabv != -1);
        if (zzuh.zzccp) {
            bundle.putBoolean("test_request", zzuh.zzccp);
        }
        zzdez.zza(bundle, "d_imp_hdr", (Integer) 1, zzuh.versionCode >= 2 && zzuh.zzbkp);
        zzdez.zza(bundle, "ppid", zzuh.zzccq, zzuh.versionCode >= 2 && !TextUtils.isEmpty(zzuh.zzccq));
        if (zzuh.zzmk != null) {
            Location location = zzuh.zzmk;
            Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long valueOf2 = Long.valueOf(location.getTime() * 1000);
            Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", valueOf.floatValue());
            bundle2.putLong("lat", valueOf3.longValue());
            bundle2.putLong(Constants.LONG, valueOf4.longValue());
            bundle2.putLong("time", valueOf2.longValue());
            bundle.putBundle("uule", bundle2);
        }
        zzdez.zza(bundle, ImagesContract.URL, zzuh.zzccs);
        zzdez.zza(bundle, "neighboring_content_urls", zzuh.zzccz);
        zzdez.zza(bundle, "custom_targeting", zzuh.zzccu);
        zzdez.zza(bundle, "category_exclusions", zzuh.zzccv);
        zzdez.zza(bundle, "request_agent", zzuh.zzccw);
        zzdez.zza(bundle, "request_pkg", zzuh.zzccx);
        zzdez.zza(bundle, "is_designed_for_families", Boolean.valueOf(zzuh.zzccy), zzuh.versionCode >= 7);
        if (zzuh.versionCode >= 8) {
            Integer valueOf5 = Integer.valueOf(zzuh.zzabw);
            if (zzuh.zzabw == -1) {
                z = false;
            }
            zzdez.zza(bundle, "tag_for_under_age_of_consent", valueOf5, z);
            zzdez.zza(bundle, "max_ad_content_rating", zzuh.zzabx);
        }
    }
}
