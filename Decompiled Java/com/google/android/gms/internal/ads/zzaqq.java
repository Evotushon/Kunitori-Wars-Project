package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaqq extends zzgc implements zzaqo {
    zzaqq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final zzaqk zza(zzaqi zzaqi) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzaqi);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzaqk zzaqk = (zzaqk) zzgd.zza(transactAndReadException, zzaqk.CREATOR);
        transactAndReadException.recycle();
        return zzaqk;
    }

    public final void zza(zzaqi zzaqi, zzaqp zzaqp) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzaqi);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzaqp);
        zza(2, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaqx zzaqx, zzaqr zzaqr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzaqx);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzaqr);
        zza(4, obtainAndWriteInterfaceToken);
    }

    public final void zzb(zzaqx zzaqx, zzaqr zzaqr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzaqx);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzaqr);
        zza(5, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzaqx zzaqx, zzaqr zzaqr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzaqx);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzaqr);
        zza(6, obtainAndWriteInterfaceToken);
    }

    public final void zza(String str, zzaqr zzaqr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzaqr);
        zza(7, obtainAndWriteInterfaceToken);
    }
}
