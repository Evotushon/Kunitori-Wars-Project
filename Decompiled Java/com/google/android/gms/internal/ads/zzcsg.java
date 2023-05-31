package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsg implements zzbqh, zzbqm, zzbqu, zzbrn, zztz {
    @GuardedBy("this")
    private zzvk zzggd;

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }

    public final void zzb(zzarr zzarr, String str, String str2) {
    }

    public final synchronized void zzc(zzvk zzvk) {
        this.zzggd = zzvk;
    }

    public final synchronized zzvk zzaon() {
        return this.zzggd;
    }

    public final synchronized void onAdClosed() {
        if (this.zzggd != null) {
            try {
                this.zzggd.onAdClosed();
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception at onAdClosed.", e);
            }
        }
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (this.zzggd != null) {
            try {
                this.zzggd.onAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception at onAdFailedToLoad.", e);
            }
        }
    }

    public final synchronized void onAdLeftApplication() {
        if (this.zzggd != null) {
            try {
                this.zzggd.onAdLeftApplication();
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    public final synchronized void onAdLoaded() {
        if (this.zzggd != null) {
            try {
                this.zzggd.onAdLoaded();
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception at onAdLoaded.", e);
            }
        }
    }

    public final synchronized void onAdOpened() {
        if (this.zzggd != null) {
            try {
                this.zzggd.onAdOpened();
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception at onAdOpened.", e);
            }
        }
    }

    public final synchronized void onAdClicked() {
        if (this.zzggd != null) {
            try {
                this.zzggd.onAdClicked();
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void onAdImpression() {
        if (this.zzggd != null) {
            try {
                this.zzggd.onAdImpression();
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception at onAdImpression.", e);
            }
        }
    }
}
