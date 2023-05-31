package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface MediationBannerListener {
    void onAdClicked(MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(MediationBannerAdapter mediationBannerAdapter);

    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i);

    void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(MediationBannerAdapter mediationBannerAdapter);

    void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2);
}
