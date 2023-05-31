package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzamr<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* access modifiers changed from: private */
    public final zzalq zzdex;

    public zzamr(zzalq zzalq) {
        this.zzdex = zzalq;
    }

    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazh.zzeb("Adapter called onClick.");
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzamq(this));
            return;
        }
        try {
            this.zzdex.onAdClicked();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazh.zzeb("Adapter called onDismissScreen.");
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zzfa("#008 Must be called on the main UI thread.");
            zzayx.zzyy.post(new zzamv(this));
            return;
        }
        try {
            this.zzdex.onAdClosed();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        zzazh.zzeb(sb.toString());
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzamu(this, errorCode));
            return;
        }
        try {
            this.zzdex.onAdFailedToLoad(zzand.zza(errorCode));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazh.zzeb("Adapter called onLeaveApplication.");
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzamx(this));
            return;
        }
        try {
            this.zzdex.onAdLeftApplication();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazh.zzeb("Adapter called onPresentScreen.");
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzamw(this));
            return;
        }
        try {
            this.zzdex.onAdOpened();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazh.zzeb("Adapter called onReceivedAd.");
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzamz(this));
            return;
        }
        try {
            this.zzdex.onAdLoaded();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzazh.zzeb("Adapter called onDismissScreen.");
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzamy(this));
            return;
        }
        try {
            this.zzdex.onAdClosed();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        zzazh.zzeb(sb.toString());
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzanb(this, errorCode));
            return;
        }
        try {
            this.zzdex.onAdFailedToLoad(zzand.zza(errorCode));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzazh.zzeb("Adapter called onLeaveApplication.");
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzana(this));
            return;
        }
        try {
            this.zzdex.onAdLeftApplication();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzazh.zzeb("Adapter called onPresentScreen.");
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzamt(this));
            return;
        }
        try {
            this.zzdex.onAdOpened();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzazh.zzeb("Adapter called onReceivedAd.");
        zzvh.zzoz();
        if (!zzayx.zzxj()) {
            zzazh.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzayx.zzyy.post(new zzams(this));
            return;
        }
        try {
            this.zzdex.onAdLoaded();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}
