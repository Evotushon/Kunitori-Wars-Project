package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcmz extends zzanh {
    private zzcmd<zzanq, zzcni> zzgbp;
    private final /* synthetic */ zzcmu zzgbq;

    private zzcmz(zzcmu zzcmu, zzcmd<zzanq, zzcni> zzcmd) {
        this.zzgbq = zzcmu;
        this.zzgbp = zzcmd;
    }

    public final void zzx(IObjectWrapper iObjectWrapper) throws RemoteException {
        View unused = this.zzgbq.view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzcni) this.zzgbp.zzgbd).onAdLoaded();
    }

    public final void zzdm(String str) throws RemoteException {
        ((zzcni) this.zzgbp.zzgbd).onAdFailedToLoad(0);
    }
}
