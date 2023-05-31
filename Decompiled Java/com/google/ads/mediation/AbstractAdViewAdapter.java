package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzayx;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zztz;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzxj;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, com.google.android.gms.ads.mediation.zza, MediationRewardedVideoAdAdapter, zzbgl {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzls;
    private InterstitialAd zzlt;
    private AdLoader zzlu;
    private Context zzlv;
    /* access modifiers changed from: private */
    public InterstitialAd zzlw;
    /* access modifiers changed from: private */
    public MediationRewardedVideoAdListener zzlx;
    @VisibleForTesting
    private final RewardedVideoAdListener zzly = new zza(this);

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzvh.zzoz();
            builder.addTestDevice(zzayx.zzbl(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            builder.tagForChildDirectedTreatment(z);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zzd extends AdListener implements zztz {
        @VisibleForTesting
        private final AbstractAdViewAdapter zzmc;
        @VisibleForTesting
        private final MediationInterstitialListener zzmd;

        public zzd(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzmc = abstractAdViewAdapter;
            this.zzmd = mediationInterstitialListener;
        }

        public final void onAdLoaded() {
            this.zzmd.onAdLoaded(this.zzmc);
        }

        public final void onAdFailedToLoad(int i) {
            this.zzmd.onAdFailedToLoad(this.zzmc, i);
        }

        public final void onAdOpened() {
            this.zzmd.onAdOpened(this.zzmc);
        }

        public final void onAdClosed() {
            this.zzmd.onAdClosed(this.zzmc);
        }

        public final void onAdLeftApplication() {
            this.zzmd.onAdLeftApplication(this.zzmc);
        }

        public final void onAdClicked() {
            this.zzmd.onAdClicked(this.zzmc);
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zze extends AdListener implements AppEventListener, zztz {
        @VisibleForTesting
        private final AbstractAdViewAdapter zzmc;
        @VisibleForTesting
        private final MediationBannerListener zzme;

        public zze(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.zzmc = abstractAdViewAdapter;
            this.zzme = mediationBannerListener;
        }

        public final void onAdLoaded() {
            this.zzme.onAdLoaded(this.zzmc);
        }

        public final void onAdFailedToLoad(int i) {
            this.zzme.onAdFailedToLoad(this.zzmc, i);
        }

        public final void onAdOpened() {
            this.zzme.onAdOpened(this.zzmc);
        }

        public final void onAdClosed() {
            this.zzme.onAdClosed(this.zzmc);
        }

        public final void onAdLeftApplication() {
            this.zzme.onAdLeftApplication(this.zzmc);
        }

        public final void onAdClicked() {
            this.zzme.onAdClicked(this.zzmc);
        }

        public final void onAppEvent(String str, String str2) {
            this.zzme.zza(this.zzmc, str, str2);
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zzf extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {
        @VisibleForTesting
        private final AbstractAdViewAdapter zzmc;
        @VisibleForTesting
        private final MediationNativeListener zzmf;

        public zzf(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.zzmc = abstractAdViewAdapter;
            this.zzmf = mediationNativeListener;
        }

        public final void onAdLoaded() {
        }

        public final void onAdFailedToLoad(int i) {
            this.zzmf.onAdFailedToLoad(this.zzmc, i);
        }

        public final void onAdOpened() {
            this.zzmf.onAdOpened(this.zzmc);
        }

        public final void onAdClosed() {
            this.zzmf.onAdClosed(this.zzmc);
        }

        public final void onAdLeftApplication() {
            this.zzmf.onAdLeftApplication(this.zzmc);
        }

        public final void onAdClicked() {
            this.zzmf.onAdClicked(this.zzmc);
        }

        public final void onAdImpression() {
            this.zzmf.onAdImpression(this.zzmc);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.zzmf.onAdLoaded((MediationNativeAdapter) this.zzmc, (NativeAdMapper) new zza(nativeAppInstallAd));
        }

        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.zzmf.onAdLoaded((MediationNativeAdapter) this.zzmc, (UnifiedNativeAdMapper) new zzb(unifiedNativeAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.zzmf.onAdLoaded((MediationNativeAdapter) this.zzmc, (NativeAdMapper) new zzc(nativeContentAd));
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.zzmf.zza(this.zzmc, nativeCustomTemplateAd);
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.zzmf.zza(this.zzmc, nativeCustomTemplateAd, str);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static class zzc extends NativeContentAdMapper {
        private final NativeContentAd zzmb;

        public zzc(NativeContentAd nativeContentAd) {
            this.zzmb = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzmb);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbkn.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.zzmb);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static class zzb extends UnifiedNativeAdMapper {
        private final UnifiedNativeAd zzma;

        public zzb(UnifiedNativeAd unifiedNativeAd) {
            this.zzma = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzn(unifiedNativeAd.zzjt());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.zzma);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbkn.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzma);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static class zza extends NativeAppInstallAdMapper {
        private final NativeAppInstallAd zzlz;

        public zza(NativeAppInstallAd nativeAppInstallAd) {
            this.zzlz = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzlz);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbkn.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.zzlz);
            }
        }
    }

    public void onDestroy() {
        AdView adView = this.zzls;
        if (adView != null) {
            adView.destroy();
            this.zzls = null;
        }
        if (this.zzlt != null) {
            this.zzlt = null;
        }
        if (this.zzlu != null) {
            this.zzlu = null;
        }
        if (this.zzlw != null) {
            this.zzlw = null;
        }
    }

    public void onPause() {
        AdView adView = this.zzls;
        if (adView != null) {
            adView.pause();
        }
    }

    public void onResume() {
        AdView adView = this.zzls;
        if (adView != null) {
            adView.resume();
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzls = new AdView(context);
        this.zzls.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzls.setAdUnitId(getAdUnitId(bundle));
        this.zzls.setAdListener(new zze(this, mediationBannerListener));
        this.zzls.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public View getBannerView() {
        return this.zzls;
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzlt = new InterstitialAd(context);
        this.zzlt.setAdUnitId(getAdUnitId(bundle));
        this.zzlt.setAdListener(new zzd(this, mediationInterstitialListener));
        this.zzlt.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzlt;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        InterstitialAd interstitialAd2 = this.zzlw;
        if (interstitialAd2 != null) {
            interstitialAd2.setImmersiveMode(z);
        }
    }

    public zzxj getVideoController() {
        VideoController videoController;
        AdView adView = this.zzls;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.zzdq();
    }

    public void showInterstitial() {
        this.zzlt.show();
    }

    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzdf(1).zzacd();
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        zzf zzf2 = new zzf(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(zzf2);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(zzf2);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(zzf2);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(zzf2);
        }
        if (nativeMediationAdRequest.zzte()) {
            for (String next : nativeMediationAdRequest.zztf().keySet()) {
                withAdListener.forCustomTemplateAd(next, zzf2, nativeMediationAdRequest.zztf().get(next).booleanValue() ? zzf2 : null);
            }
        }
        this.zzlu = withAdListener.build();
        this.zzlu.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzlv = context.getApplicationContext();
        this.zzlx = mediationRewardedVideoAdListener;
        this.zzlx.onInitializationSucceeded(this);
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Context context = this.zzlv;
        if (context == null || this.zzlx == null) {
            zzazh.zzey("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzlw = new InterstitialAd(context);
        this.zzlw.zzd(true);
        this.zzlw.setAdUnitId(getAdUnitId(bundle));
        this.zzlw.setRewardedVideoAdListener(this.zzly);
        this.zzlw.setAdMetadataListener(new zzb(this));
        this.zzlw.loadAd(zza(this.zzlv, mediationAdRequest, bundle2, bundle));
    }

    public void showVideo() {
        this.zzlw.show();
    }

    public boolean isInitialized() {
        return this.zzlx != null;
    }
}
