package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsa extends zzvo {
    private final zzcsk zzgfo;

    public zzcsa(Context context, zzbgk zzbgk, zzdew zzdew, zzbzg zzbzg, zzvk zzvk) {
        zzcsm zzcsm = new zzcsm(zzbzg);
        zzcsm.zzc(zzvk);
        this.zzgfo = new zzcsk(new zzcss(zzbgk, context, zzcsm, zzdew), zzdew.zzara());
    }

    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgfo.isLoading();
    }

    public final void zzb(zzuh zzuh) throws RemoteException {
        this.zzgfo.zza(zzuh, 1);
    }

    public final synchronized void zza(zzuh zzuh, int i) throws RemoteException {
        this.zzgfo.zza(zzuh, i);
    }

    public final synchronized String getMediationAdapterClassName() {
        return this.zzgfo.getMediationAdapterClassName();
    }

    public final synchronized String zzkf() {
        return this.zzgfo.zzkf();
    }
}
