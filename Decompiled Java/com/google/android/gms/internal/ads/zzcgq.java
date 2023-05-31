package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgq {
    private ConcurrentHashMap<String, String> zzfvt;

    public zzcgq(zzcgx zzcgx) {
        this.zzfvt = zzcgx.zzanb();
    }

    public final void zzc(zzdeq zzdeq) {
        if (zzdeq.zzgqm.zzgqi.size() > 0) {
            int i = zzdeq.zzgqm.zzgqi.get(0).zzfmh;
            if (i == 1) {
                this.zzfvt.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
            } else if (i == 2) {
                this.zzfvt.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
            } else if (i == 3) {
                this.zzfvt.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
            } else if (i == 4) {
                this.zzfvt.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
            } else if (i != 5) {
                this.zzfvt.put(FirebaseAnalytics.Param.AD_FORMAT, EnvironmentCompat.MEDIA_UNKNOWN);
            } else {
                this.zzfvt.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
            }
            if (!TextUtils.isEmpty(zzdeq.zzgqm.zzgqj.zzcac)) {
                this.zzfvt.put("gqi", zzdeq.zzgqm.zzgqj.zzcac);
            }
        }
    }

    public final void zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zzfvt.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zzfvt.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> zzqv() {
        return this.zzfvt;
    }
}
