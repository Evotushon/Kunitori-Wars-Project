package com.google.android.gms.ads.instream;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MediaAspectRatio;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzahx;
import com.google.android.gms.internal.ads.zzahy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class InstreamAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static abstract class InstreamAdLoadCallback {
        public void onInstreamAdFailedToLoad(int i) {
        }

        public void onInstreamAdLoaded(InstreamAd instreamAd) {
        }
    }

    public abstract void destroy();

    @Deprecated
    public abstract float getAspectRatio();

    public abstract MediaContent getMediaContent();

    @Deprecated
    public abstract VideoController getVideoController();

    @Deprecated
    public abstract float getVideoCurrentTime();

    @Deprecated
    public abstract float getVideoDuration();

    /* access modifiers changed from: protected */
    public abstract void zza(InstreamAdView instreamAdView);

    public static void load(Context context, String str, AdRequest adRequest, @MediaAspectRatio int i, InstreamAdLoadCallback instreamAdLoadCallback) {
        Preconditions.checkArgument(i == 2 || i == 3, "Instream ads only support Landscape and Portrait media aspect ratios");
        new zzahy(context, str).zza(instreamAdLoadCallback).zza(new zzahx(i)).zzsd().loadAd(adRequest);
    }

    public static void load(Context context, String str, InstreamAdLoadCallback instreamAdLoadCallback) {
        new zzahy(context, "").zza(instreamAdLoadCallback).zza(new zzahx(str)).zzsd().loadAd(new PublisherAdRequest.Builder().build());
    }
}
