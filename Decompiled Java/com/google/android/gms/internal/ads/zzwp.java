package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzwp extends zzgc implements zzwn {
    zzwp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void initialize() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }

    public final void setAppVolume(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        zza(2, obtainAndWriteInterfaceToken);
    }

    public final void zzce(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(3, obtainAndWriteInterfaceToken);
    }

    public final void setAppMuted(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.writeBoolean(obtainAndWriteInterfaceToken, z);
        zza(4, obtainAndWriteInterfaceToken);
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zza(5, obtainAndWriteInterfaceToken);
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zza(6, obtainAndWriteInterfaceToken);
    }

    public final float zzpj() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    public final boolean zzpk() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
        boolean zza = zzgd.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    public final String getVersionString() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    public final void zzcf(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(10, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzalk zzalk) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalk);
        zza(11, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzahc zzahc) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzahc);
        zza(12, obtainAndWriteInterfaceToken);
    }

    public final List<zzagz> zzpl() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
        ArrayList<zzagz> createTypedArrayList = transactAndReadException.createTypedArrayList(zzagz.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    public final void zza(zzyw zzyw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzyw);
        zza(14, obtainAndWriteInterfaceToken);
    }
}
