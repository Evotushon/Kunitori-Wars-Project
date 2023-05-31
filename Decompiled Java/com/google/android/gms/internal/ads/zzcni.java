package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcni extends zzalt implements zzbrk {
    @GuardedBy("this")
    private zzalq zzdfy;
    @GuardedBy("this")
    private zzbrj zzgcb;

    public final synchronized void zza(zzalq zzalq) {
        this.zzdfy = zzalq;
    }

    public final synchronized void zza(zzbrj zzbrj) {
        this.zzgcb = zzbrj;
    }

    public final synchronized void onAdClicked() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onAdClicked();
        }
    }

    public final synchronized void onAdClosed() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onAdClosed();
        }
    }

    public final synchronized void onAdFailedToLoad(int i) throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onAdFailedToLoad(i);
        }
        if (this.zzgcb != null) {
            this.zzgcb.onAdFailedToLoad(i);
        }
    }

    public final synchronized void onAdLeftApplication() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onAdLeftApplication();
        }
    }

    public final synchronized void onAdOpened() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onAdOpened();
        }
    }

    public final synchronized void onAdLoaded() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onAdLoaded();
        }
        if (this.zzgcb != null) {
            this.zzgcb.onAdLoaded();
        }
    }

    public final synchronized void zza(zzalv zzalv) throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.zza(zzalv);
        }
    }

    public final synchronized void onAdImpression() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onAdImpression();
        }
    }

    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onAppEvent(str, str2);
        }
    }

    public final synchronized void zza(zzadn zzadn, String str) throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.zza(zzadn, str);
        }
    }

    public final synchronized void onVideoEnd() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onVideoEnd();
        }
    }

    public final synchronized void zzdk(String str) throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.zzdk(str);
        }
    }

    public final synchronized void zzsx() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.zzsx();
        }
    }

    public final synchronized void onVideoPlay() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onVideoPlay();
        }
    }

    public final synchronized void zzb(zzasq zzasq) throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.zzb(zzasq);
        }
    }

    public final synchronized void onVideoPause() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.onVideoPause();
        }
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.zzb(bundle);
        }
    }

    public final synchronized void zzsy() throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.zzsy();
        }
    }

    public final synchronized void zzco(int i) throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.zzco(i);
        }
    }

    public final synchronized void zza(zzass zzass) throws RemoteException {
        if (this.zzdfy != null) {
            this.zzdfy.zza(zzass);
        }
    }
}
