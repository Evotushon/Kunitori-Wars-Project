package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzaof implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationRewardedAdCallback {
    private zzalq zzdfy;

    zzaof(zzalq zzalq) {
        this.zzdfy = zzalq;
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.zzdfy.onAdClicked();
        } catch (RemoteException unused) {
        }
    }

    public final void reportAdImpression() {
        try {
            this.zzdfy.onAdImpression();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdOpened() {
        try {
            this.zzdfy.onAdOpened();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdClosed() {
        try {
            this.zzdfy.onAdClosed();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.zzdfy.onAdLeftApplication();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoPlay() {
        try {
            this.zzdfy.onVideoPlay();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        try {
            this.zzdfy.zza((zzass) new zzatp(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoStart() {
        try {
            this.zzdfy.zzsx();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.zzdfy.onVideoEnd();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(String str) {
        try {
            String valueOf = String.valueOf(str);
            zzazh.zzfa(valueOf.length() != 0 ? "Mediated ad failed to show: ".concat(valueOf) : new String("Mediated ad failed to show: "));
            this.zzdfy.zzco(0);
        } catch (RemoteException unused) {
        }
    }
}
