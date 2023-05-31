package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzrm;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzvx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static abstract class AppOpenAdLoadCallback {
        public void onAppOpenAdFailedToLoad(int i) {
        }

        public void onAppOpenAdLoaded(AppOpenAd appOpenAd) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface AppOpenAdOrientation {
    }

    /* access modifiers changed from: protected */
    public abstract void zza(zzrm zzrm);

    /* access modifiers changed from: protected */
    public abstract zzvx zzdr();

    public static void load(Context context, String str, AdRequest adRequest, @AppOpenAdOrientation int i, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        new zzrq(context, str, adRequest.zzdl(), i, appOpenAdLoadCallback).zzms();
    }

    public static void load(Context context, String str, PublisherAdRequest publisherAdRequest, @AppOpenAdOrientation int i, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(publisherAdRequest, "PublisherAdRequest cannot be null.");
        new zzrq(context, str, publisherAdRequest.zzdl(), i, appOpenAdLoadCallback).zzms();
    }
}
