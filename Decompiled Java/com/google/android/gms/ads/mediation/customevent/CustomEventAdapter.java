package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzazh;

@KeepName
@KeepForSdkWithMembers
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    @VisibleForTesting
    private CustomEventBanner zzeko;
    @VisibleForTesting
    private CustomEventInterstitial zzekp;
    @VisibleForTesting
    private CustomEventNative zzekq;
    private View zzml;

    private static <T> T zzao(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzazh.zzfa(sb.toString());
            return null;
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zzekm;
        private final MediationBannerListener zzekn;

        public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzekm = customEventAdapter;
            this.zzekn = mediationBannerListener;
        }

        public final void onAdLoaded(View view) {
            zzazh.zzeb("Custom event adapter called onAdLoaded.");
            this.zzekm.zza(view);
            this.zzekn.onAdLoaded(this.zzekm);
        }

        public final void onAdFailedToLoad(int i) {
            zzazh.zzeb("Custom event adapter called onAdFailedToLoad.");
            this.zzekn.onAdFailedToLoad(this.zzekm, i);
        }

        public final void onAdClicked() {
            zzazh.zzeb("Custom event adapter called onAdClicked.");
            this.zzekn.onAdClicked(this.zzekm);
        }

        public final void onAdOpened() {
            zzazh.zzeb("Custom event adapter called onAdOpened.");
            this.zzekn.onAdOpened(this.zzekm);
        }

        public final void onAdClosed() {
            zzazh.zzeb("Custom event adapter called onAdClosed.");
            this.zzekn.onAdClosed(this.zzekm);
        }

        public final void onAdLeftApplication() {
            zzazh.zzeb("Custom event adapter called onAdLeftApplication.");
            this.zzekn.onAdLeftApplication(this.zzekm);
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static class zzb implements CustomEventNativeListener {
        private final CustomEventAdapter zzekm;
        private final MediationNativeListener zzekr;

        public zzb(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.zzekm = customEventAdapter;
            this.zzekr = mediationNativeListener;
        }

        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            zzazh.zzeb("Custom event adapter called onAdLoaded.");
            this.zzekr.onAdLoaded((MediationNativeAdapter) this.zzekm, nativeAdMapper);
        }

        public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
            zzazh.zzeb("Custom event adapter called onAdLoaded.");
            this.zzekr.onAdLoaded((MediationNativeAdapter) this.zzekm, unifiedNativeAdMapper);
        }

        public final void onAdFailedToLoad(int i) {
            zzazh.zzeb("Custom event adapter called onAdFailedToLoad.");
            this.zzekr.onAdFailedToLoad(this.zzekm, i);
        }

        public final void onAdOpened() {
            zzazh.zzeb("Custom event adapter called onAdOpened.");
            this.zzekr.onAdOpened(this.zzekm);
        }

        public final void onAdClicked() {
            zzazh.zzeb("Custom event adapter called onAdClicked.");
            this.zzekr.onAdClicked(this.zzekm);
        }

        public final void onAdClosed() {
            zzazh.zzeb("Custom event adapter called onAdClosed.");
            this.zzekr.onAdClosed(this.zzekm);
        }

        public final void onAdLeftApplication() {
            zzazh.zzeb("Custom event adapter called onAdLeftApplication.");
            this.zzekr.onAdLeftApplication(this.zzekm);
        }

        public final void onAdImpression() {
            zzazh.zzeb("Custom event adapter called onAdImpression.");
            this.zzekr.onAdImpression(this.zzekm);
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    class zzc implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzekm;
        private final MediationInterstitialListener zzeks;

        public zzc(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzekm = customEventAdapter;
            this.zzeks = mediationInterstitialListener;
        }

        public final void onAdLoaded() {
            zzazh.zzeb("Custom event adapter called onReceivedAd.");
            this.zzeks.onAdLoaded(CustomEventAdapter.this);
        }

        public final void onAdFailedToLoad(int i) {
            zzazh.zzeb("Custom event adapter called onFailedToReceiveAd.");
            this.zzeks.onAdFailedToLoad(this.zzekm, i);
        }

        public final void onAdClicked() {
            zzazh.zzeb("Custom event adapter called onAdClicked.");
            this.zzeks.onAdClicked(this.zzekm);
        }

        public final void onAdOpened() {
            zzazh.zzeb("Custom event adapter called onAdOpened.");
            this.zzeks.onAdOpened(this.zzekm);
        }

        public final void onAdClosed() {
            zzazh.zzeb("Custom event adapter called onAdClosed.");
            this.zzeks.onAdClosed(this.zzekm);
        }

        public final void onAdLeftApplication() {
            zzazh.zzeb("Custom event adapter called onAdLeftApplication.");
            this.zzeks.onAdLeftApplication(this.zzekm);
        }
    }

    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.zzeko;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzekp;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.zzekq;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public final void onPause() {
        CustomEventBanner customEventBanner = this.zzeko;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.zzekp;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.zzekq;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public final void onResume() {
        CustomEventBanner customEventBanner = this.zzeko;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.zzekp;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.zzekq;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public final View getBannerView() {
        return this.zzml;
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        this.zzeko = (CustomEventBanner) zzao(bundle.getString("class_name"));
        if (this.zzeko == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        Context context2 = context;
        this.zzeko.requestBannerAd(context2, new zza(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle3);
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        this.zzekp = (CustomEventInterstitial) zzao(bundle.getString("class_name"));
        if (this.zzekp == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        Context context2 = context;
        this.zzekp.requestInterstitialAd(context2, new zzc(this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle3);
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        this.zzekq = (CustomEventNative) zzao(bundle.getString("class_name"));
        if (this.zzekq == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        Context context2 = context;
        this.zzekq.requestNativeAd(context2, new zzb(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle3);
    }

    public final void showInterstitial() {
        this.zzekp.showInterstitial();
    }

    /* access modifiers changed from: private */
    public final void zza(View view) {
        this.zzml = view;
    }
}
