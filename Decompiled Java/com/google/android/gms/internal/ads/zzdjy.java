package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdjy extends zzgc implements zzdjz {
    zzdjy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzdjx zza(zzdjv zzdjv) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzdjv);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzdjx zzdjx = (zzdjx) zzgd.zza(transactAndReadException, zzdjx.CREATOR);
        transactAndReadException.recycle();
        return zzdjx;
    }

    public final void zza(zzdjq zzdjq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzdjq);
        zza(2, obtainAndWriteInterfaceToken);
    }

    public final zzdke zza(zzdkc zzdkc) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzdkc);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        zzdke zzdke = (zzdke) zzgd.zza(transactAndReadException, zzdke.CREATOR);
        transactAndReadException.recycle();
        return zzdke;
    }
}
