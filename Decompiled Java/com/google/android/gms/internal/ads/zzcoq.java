package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcoq extends zzann {
    private zzcmd<zzanq, zzcni> zzgbp;
    private final /* synthetic */ zzcoo zzgcw;

    private zzcoq(zzcoo zzcoo, zzcmd<zzanq, zzcni> zzcmd) {
        this.zzgcw = zzcoo;
        this.zzgbp = zzcmd;
    }

    public final void zza(zzamd zzamd) throws RemoteException {
        zzamd unused = this.zzgcw.zzgcv = zzamd;
        ((zzcni) this.zzgbp.zzgbd).onAdLoaded();
    }

    public final void zzdm(String str) throws RemoteException {
        ((zzcni) this.zzgbp.zzgbd).onAdFailedToLoad(0);
    }
}
