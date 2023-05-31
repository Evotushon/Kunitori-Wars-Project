package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzyi extends zzvo {
    final /* synthetic */ zzyg zzcfz;

    private zzyi(zzyg zzyg) {
        this.zzcfz = zzyg;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final String zzkf() throws RemoteException {
        return null;
    }

    public final void zzb(zzuh zzuh) throws RemoteException {
        zza(zzuh, 1);
    }

    public final void zza(zzuh zzuh, int i) throws RemoteException {
        zzazh.zzey("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzayx.zzyy.post(new zzyl(this));
    }
}
