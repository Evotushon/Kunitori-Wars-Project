package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnl extends zzasl implements zzbrk {
    @GuardedBy("this")
    private zzbrj zzgcb;
    @GuardedBy("this")
    private zzasm zzgce;
    @GuardedBy("this")
    private zzbvi zzgcf;

    public final synchronized void zza(zzasm zzasm) {
        this.zzgce = zzasm;
    }

    public final synchronized void zza(zzbrj zzbrj) {
        this.zzgcb = zzbrj;
    }

    public final synchronized void zza(zzbvi zzbvi) {
        this.zzgcf = zzbvi;
    }

    public final synchronized void zzaf(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzaf(iObjectWrapper);
        }
        if (this.zzgcf != null) {
            this.zzgcf.onInitializationSucceeded();
        }
    }

    public final synchronized void zzd(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzd(iObjectWrapper, i);
        }
        if (this.zzgcf != null) {
            this.zzgcf.zzdh(i);
        }
    }

    public final synchronized void zzai(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzai(iObjectWrapper);
        }
    }

    public final synchronized void zza(IObjectWrapper iObjectWrapper, zzasq zzasq) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zza(iObjectWrapper, zzasq);
        }
    }

    public final synchronized void zzak(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzak(iObjectWrapper);
        }
    }

    public final synchronized void zzaj(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzaj(iObjectWrapper);
        }
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zze(iObjectWrapper, i);
        }
        if (this.zzgcb != null) {
            this.zzgcb.onAdFailedToLoad(i);
        }
    }

    public final synchronized void zzal(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzal(iObjectWrapper);
        }
    }

    public final synchronized void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzam(iObjectWrapper);
        }
    }

    public final synchronized void zzah(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzah(iObjectWrapper);
        }
    }

    public final synchronized void zzag(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzag(iObjectWrapper);
        }
        if (this.zzgcb != null) {
            this.zzgcb.onAdLoaded();
        }
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzgce != null) {
            this.zzgce.zzb(bundle);
        }
    }
}
