package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaml implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    private final zzalq zzdex;
    private NativeAdMapper zzdey;
    private UnifiedNativeAdMapper zzdez;
    private NativeCustomTemplateAd zzdfa;

    public zzaml(zzalq zzalq) {
        this.zzdex = zzalq;
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAppEvent.");
        try {
            this.zzdex.onAppEvent(str, str2);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdClicked.");
        try {
            this.zzdex.onAdClicked();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdClosed.");
        try {
            this.zzdex.onAdClosed();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        zzazh.zzeb(sb.toString());
        try {
            this.zzdex.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdLeftApplication.");
        try {
            this.zzdex.onAdLeftApplication();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdOpened.");
        try {
            this.zzdex.onAdOpened();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdLoaded.");
        try {
            this.zzdex.onAdLoaded();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdClicked.");
        try {
            this.zzdex.onAdClicked();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdClosed.");
        try {
            this.zzdex.onAdClosed();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        zzazh.zzeb(sb.toString());
        try {
            this.zzdex.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdLeftApplication.");
        try {
            this.zzdex.onAdLeftApplication();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdOpened.");
        try {
            this.zzdex.onAdOpened();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdLoaded.");
        try {
            this.zzdex.onAdLoaded();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdLoaded.");
        this.zzdey = nativeAdMapper;
        this.zzdez = null;
        zza(mediationNativeAdapter, this.zzdez, this.zzdey);
        try {
            this.zzdex.onAdLoaded();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdLoaded.");
        this.zzdez = unifiedNativeAdMapper;
        this.zzdey = null;
        zza(mediationNativeAdapter, this.zzdez, this.zzdey);
        try {
            this.zzdex.onAdLoaded();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    private static void zza(MediationNativeAdapter mediationNativeAdapter, @Nullable UnifiedNativeAdMapper unifiedNativeAdMapper, @Nullable NativeAdMapper nativeAdMapper) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zza(new zzame());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zza(videoController);
            }
            if (nativeAdMapper != null && nativeAdMapper.hasVideoContent()) {
                nativeAdMapper.zza(videoController);
            }
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        zzazh.zzeb(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.zzdfa = nativeCustomTemplateAd;
        try {
            this.zzdex.onAdLoaded();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof zzado) {
            try {
                this.zzdex.zza(((zzado) nativeCustomTemplateAd).zzrs(), str);
            } catch (RemoteException e) {
                zzazh.zze("#007 Could not call remote method.", e);
            }
        } else {
            zzazh.zzfa("Unexpected native custom template ad type.");
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        zzazh.zzeb(sb.toString());
        try {
            this.zzdex.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdOpened.");
        try {
            this.zzdex.onAdOpened();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdClosed.");
        try {
            this.zzdex.onAdClosed();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdLeftApplication.");
        try {
            this.zzdex.onAdLeftApplication();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.zzdey;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzdez;
        if (this.zzdfa == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzazh.zze("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzazh.zzeb("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideClickHandling()) {
                zzazh.zzeb("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzazh.zzeb("Adapter called onAdClicked.");
        try {
            this.zzdex.onAdClicked();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.zzdey;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzdez;
        if (this.zzdfa == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzazh.zze("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzazh.zzeb("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideImpressionRecording()) {
                zzazh.zzeb("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzazh.zzeb("Adapter called onAdImpression.");
        try {
            this.zzdex.onAdImpression();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onVideoEnd.");
        try {
            this.zzdex.onVideoEnd();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final NativeAdMapper zztb() {
        return this.zzdey;
    }

    public final UnifiedNativeAdMapper zztc() {
        return this.zzdez;
    }

    public final NativeCustomTemplateAd zztd() {
        return this.zzdfa;
    }
}
