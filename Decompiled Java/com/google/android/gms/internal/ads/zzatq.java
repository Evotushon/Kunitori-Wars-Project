package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzatq implements MediationRewardedAdCallback {
    private final zzalq zzdex;

    public zzatq(zzalq zzalq) {
        this.zzdex = zzalq;
    }

    public final void onAdOpened() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdOpened.");
        try {
            this.zzdex.onAdOpened();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdClosed.");
        try {
            this.zzdex.onAdClosed();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onUserEarnedReward.");
        try {
            this.zzdex.zza((zzass) new zzatp(rewardItem));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdClicked() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called reportAdClicked.");
        try {
            this.zzdex.onAdClicked();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdImpression() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called reportAdImpression.");
        try {
            this.zzdex.onAdImpression();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToShow(String str) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdFailedToShow.");
        String valueOf = String.valueOf(str);
        zzazh.zzfa(valueOf.length() != 0 ? "Mediation ad failed to show: ".concat(valueOf) : new String("Mediation ad failed to show: "));
        try {
            this.zzdex.zzco(0);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoStart() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onVideoStart.");
        try {
            this.zzdex.zzsx();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoComplete() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onVideoComplete.");
        try {
            this.zzdex.zzsy();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}
