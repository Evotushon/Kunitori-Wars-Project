package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzazh;

@KeepName
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {
    private View zzml;
    @VisibleForTesting
    private CustomEventBanner zzmm;
    @VisibleForTesting
    private CustomEventInterstitial zzmn;

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
    class zza implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzmo;
        private final MediationInterstitialListener zzmp;

        public zza(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzmo = customEventAdapter;
            this.zzmp = mediationInterstitialListener;
        }

        public final void onReceivedAd() {
            zzazh.zzeb("Custom event adapter called onReceivedAd.");
            this.zzmp.onReceivedAd(CustomEventAdapter.this);
        }

        public final void onFailedToReceiveAd() {
            zzazh.zzeb("Custom event adapter called onFailedToReceiveAd.");
            this.zzmp.onFailedToReceiveAd(this.zzmo, AdRequest.ErrorCode.NO_FILL);
        }

        public final void onPresentScreen() {
            zzazh.zzeb("Custom event adapter called onPresentScreen.");
            this.zzmp.onPresentScreen(this.zzmo);
        }

        public final void onDismissScreen() {
            zzazh.zzeb("Custom event adapter called onDismissScreen.");
            this.zzmp.onDismissScreen(this.zzmo);
        }

        public final void onLeaveApplication() {
            zzazh.zzeb("Custom event adapter called onLeaveApplication.");
            this.zzmp.onLeaveApplication(this.zzmo);
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zzb implements CustomEventBannerListener {
        private final CustomEventAdapter zzmo;
        private final MediationBannerListener zzmr;

        public zzb(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzmo = customEventAdapter;
            this.zzmr = mediationBannerListener;
        }

        public final void onReceivedAd(View view) {
            zzazh.zzeb("Custom event adapter called onReceivedAd.");
            this.zzmo.zza(view);
            this.zzmr.onReceivedAd(this.zzmo);
        }

        public final void onFailedToReceiveAd() {
            zzazh.zzeb("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onFailedToReceiveAd(this.zzmo, AdRequest.ErrorCode.NO_FILL);
        }

        public final void onClick() {
            zzazh.zzeb("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onClick(this.zzmo);
        }

        public final void onPresentScreen() {
            zzazh.zzeb("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onPresentScreen(this.zzmo);
        }

        public final void onDismissScreen() {
            zzazh.zzeb("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onDismissScreen(this.zzmo);
        }

        public final void onLeaveApplication() {
            zzazh.zzeb("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onLeaveApplication(this.zzmo);
        }
    }

    public final void destroy() {
        CustomEventBanner customEventBanner = this.zzmm;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzmn;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.zzml;
    }

    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        Object obj;
        this.zzmm = (CustomEventBanner) zzao(customEventServerParameters.className);
        if (this.zzmm == null) {
            mediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(customEventServerParameters.label);
        }
        Activity activity2 = activity;
        this.zzmm.requestBannerAd(new zzb(this, mediationBannerListener), activity2, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, obj);
    }

    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        Object obj;
        this.zzmn = (CustomEventInterstitial) zzao(customEventServerParameters.className);
        if (this.zzmn == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(customEventServerParameters.label);
        }
        Activity activity2 = activity;
        this.zzmn.requestInterstitialAd(new zza(this, mediationInterstitialListener), activity2, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, obj);
    }

    public final void showInterstitial() {
        this.zzmn.showInterstitial();
    }

    /* access modifiers changed from: private */
    public final void zza(View view) {
        this.zzml = view;
    }
}
