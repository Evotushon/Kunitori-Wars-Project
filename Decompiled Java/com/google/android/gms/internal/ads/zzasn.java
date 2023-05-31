package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzasn implements MediationRewardedVideoAdListener {
    private final zzasm zzdpc;

    public zzasn(zzasm zzasm) {
        this.zzdpc = zzasm;
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onInitializationSucceeded.");
        try {
            this.zzdpc.zzaf(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onInitializationFailed.");
        try {
            this.zzdpc.zzd(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdLoaded.");
        try {
            this.zzdpc.zzag(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdOpened.");
        try {
            this.zzdpc.zzah(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onVideoStarted.");
        try {
            this.zzdpc.zzai(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdClosed.");
        try {
            this.zzdpc.zzaj(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onRewarded.");
        if (rewardItem != null) {
            try {
                this.zzdpc.zza(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter), new zzasq(rewardItem));
            } catch (RemoteException e) {
                zzazh.zze("#007 Could not call remote method.", e);
            }
        } else {
            this.zzdpc.zza(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter), new zzasq("", 1));
        }
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdClicked.");
        try {
            this.zzdpc.zzak(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdFailedToLoad.");
        try {
            this.zzdpc.zze(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdLeftApplication.");
        try {
            this.zzdpc.zzal(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onVideoCompleted.");
        try {
            this.zzdpc.zzam(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void zzb(Bundle bundle) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazh.zzeb("Adapter called onAdMetadataChanged.");
        try {
            this.zzdpc.zzb(bundle);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}
