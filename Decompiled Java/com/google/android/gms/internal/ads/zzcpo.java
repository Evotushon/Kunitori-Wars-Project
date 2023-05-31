package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcpo extends zzano {
    private zzcmd<zzanq, zzcni> zzgbp;

    private zzcpo(zzcpn zzcpn, zzcmd<zzanq, zzcni> zzcmd) {
        this.zzgbp = zzcmd;
    }

    public final void zztg() throws RemoteException {
        ((zzcni) this.zzgbp.zzgbd).onAdLoaded();
    }

    public final void zzdm(String str) throws RemoteException {
        ((zzcni) this.zzgbp.zzgbd).onAdFailedToLoad(0);
    }
}
