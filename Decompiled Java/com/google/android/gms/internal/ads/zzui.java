package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzui {
    public static final zzui zzcdb = new zzui();

    @VisibleForTesting
    protected zzui() {
    }

    public static zzuh zza(Context context, zzxr zzxr) {
        List list;
        Context context2;
        zzub zzub;
        String str;
        zzxr zzxr2 = zzxr;
        Date birthday = zzxr.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1;
        String contentUrl = zzxr.getContentUrl();
        int gender = zzxr.getGender();
        Set<String> keywords = zzxr.getKeywords();
        if (!keywords.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean isTestDevice = zzxr2.isTestDevice(context2);
        Location location = zzxr.getLocation();
        Bundle networkExtrasBundle = zzxr2.getNetworkExtrasBundle(AdMobAdapter.class);
        if (zzxr.zzpw() != null) {
            zzub = new zzub(zzxr.zzpw().getAdString(), zzvh.zzph().containsKey(zzxr.zzpw().getQueryInfo()) ? zzvh.zzph().get(zzxr.zzpw().getQueryInfo()) : "");
        } else {
            zzub = null;
        }
        boolean manualImpressionsEnabled = zzxr.getManualImpressionsEnabled();
        String publisherProvidedId = zzxr.getPublisherProvidedId();
        SearchAdRequest zzpr = zzxr.zzpr();
        zzyy zzyy = zzpr != null ? new zzyy(zzpr) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzvh.zzoz();
            str = zzayx.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean isDesignedForFamilies = zzxr.isDesignedForFamilies();
        RequestConfiguration requestConfiguration = zzxu.zzpy().getRequestConfiguration();
        return new zzuh(8, time, networkExtrasBundle, gender, list, isTestDevice, Math.max(zzxr.zzpu(), requestConfiguration.getTagForChildDirectedTreatment()), manualImpressionsEnabled, publisherProvidedId, zzyy, location, contentUrl, zzxr.zzpt(), zzxr.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzxr.zzpv())), zzxr.zzpq(), str, isDesignedForFamilies, zzub, Math.max(zzxr.zzpx(), requestConfiguration.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(new String[]{zzxr.getMaxAdContentRating(), requestConfiguration.getMaxAdContentRating()}), zzul.zzcdk), zzxr.zzpp());
    }

    public static zzash zza(Context context, zzxr zzxr, String str) {
        return new zzash(zza(context, zzxr), str);
    }

    static final /* synthetic */ int zzd(String str, String str2) {
        return RequestConfiguration.zzabz.indexOf(str) - RequestConfiguration.zzabz.indexOf(str2);
    }
}
