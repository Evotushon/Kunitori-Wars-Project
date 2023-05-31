package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzagq extends zzgc implements zzagr {
    zzagq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zza(zzagl zzagl, zzagp zzagp) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzagl);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzagp);
        zzb(2, obtainAndWriteInterfaceToken);
    }
}
