package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzamk extends zzalt {
    private final zzasm zzden;
    private final Adapter zzdew;

    zzamk(Adapter adapter, zzasm zzasm) {
        this.zzdew = adapter;
        this.zzden = zzasm;
    }

    public final void onAdImpression() throws RemoteException {
    }

    public final void onAdLeftApplication() throws RemoteException {
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    public final void onVideoEnd() throws RemoteException {
    }

    public final void onVideoPause() throws RemoteException {
    }

    public final void onVideoPlay() throws RemoteException {
    }

    public final void zza(zzadn zzadn, String str) throws RemoteException {
    }

    public final void zza(zzalv zzalv) throws RemoteException {
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }

    public final void zzb(zzasq zzasq) throws RemoteException {
    }

    public final void zzco(int i) throws RemoteException {
    }

    public final void zzdk(String str) throws RemoteException {
    }

    public final void onAdLoaded() throws RemoteException {
        zzasm zzasm = this.zzden;
        if (zzasm != null) {
            zzasm.zzag(ObjectWrapper.wrap(this.zzdew));
        }
    }

    public final void onAdOpened() throws RemoteException {
        zzasm zzasm = this.zzden;
        if (zzasm != null) {
            zzasm.zzah(ObjectWrapper.wrap(this.zzdew));
        }
    }

    public final void onAdClosed() throws RemoteException {
        zzasm zzasm = this.zzden;
        if (zzasm != null) {
            zzasm.zzaj(ObjectWrapper.wrap(this.zzdew));
        }
    }

    public final void zza(zzass zzass) throws RemoteException {
        zzasm zzasm = this.zzden;
        if (zzasm != null) {
            zzasm.zza(ObjectWrapper.wrap(this.zzdew), new zzasq(zzass.getType(), zzass.getAmount()));
        }
    }

    public final void zzsx() throws RemoteException {
        zzasm zzasm = this.zzden;
        if (zzasm != null) {
            zzasm.zzai(ObjectWrapper.wrap(this.zzdew));
        }
    }

    public final void zzsy() throws RemoteException {
        zzasm zzasm = this.zzden;
        if (zzasm != null) {
            zzasm.zzam(ObjectWrapper.wrap(this.zzdew));
        }
    }

    public final void onAdClicked() throws RemoteException {
        zzasm zzasm = this.zzden;
        if (zzasm != null) {
            zzasm.zzak(ObjectWrapper.wrap(this.zzdew));
        }
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        zzasm zzasm = this.zzden;
        if (zzasm != null) {
            zzasm.zze(ObjectWrapper.wrap(this.zzdew), i);
        }
    }
}
