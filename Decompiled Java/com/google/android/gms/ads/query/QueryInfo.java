package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzyf;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class QueryInfo {
    private zzyf zzgwi;

    public QueryInfo(zzyf zzyf) {
        this.zzgwi = zzyf;
    }

    @KeepForSdk
    public String getQuery() {
        return this.zzgwi.getQuery();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zzgwi.getQueryBundle();
    }

    @KeepForSdk
    public static void generate(Context context, AdFormat adFormat, @Nullable AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzxr zzxr;
        if (adRequest == null) {
            zzxr = null;
        } else {
            zzxr = adRequest.zzdl();
        }
        new zzapw(context, adFormat, zzxr).zza(queryInfoGenerationCallback);
    }
}
