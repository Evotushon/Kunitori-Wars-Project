package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzans extends zzgc implements zzanq {
    zzans(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzuk zzuk, zzanv zzanv) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) bundle2);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuk);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzanv);
        zza(1, obtainAndWriteInterfaceToken);
    }

    public final zzaoe zzth() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        zzaoe zzaoe = (zzaoe) zzgd.zza(transactAndReadException, zzaoe.CREATOR);
        transactAndReadException.recycle();
        return zzaoe;
    }

    public final zzaoe zzti() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        zzaoe zzaoe = (zzaoe) zzgd.zza(transactAndReadException, zzaoe.CREATOR);
        transactAndReadException.recycle();
        return zzaoe;
    }

    public final zzxj getVideoController() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
        zzxj zzk = zzxi.zzk(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzk;
    }

    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zza(10, obtainAndWriteInterfaceToken);
    }

    public final void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        obtainAndWriteInterfaceToken.writeTypedArray(bundleArr, 0);
        zza(11, obtainAndWriteInterfaceToken);
    }

    public final void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzane zzane, zzalq zzalq, zzuk zzuk) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzane);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuk);
        zza(13, obtainAndWriteInterfaceToken);
    }

    public final void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzanj zzanj, zzalq zzalq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzanj);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zza(14, obtainAndWriteInterfaceToken);
    }

    public final boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
        boolean zza = zzgd.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    public final void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzanp zzanp, zzalq zzalq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzanp);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zza(16, obtainAndWriteInterfaceToken);
    }

    public final boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
        boolean zza = zzgd.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    public final void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzank zzank, zzalq zzalq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzank);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zza(18, obtainAndWriteInterfaceToken);
    }

    public final void zzdn(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(19, obtainAndWriteInterfaceToken);
    }
}
