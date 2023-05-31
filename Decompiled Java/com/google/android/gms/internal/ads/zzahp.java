package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzahp extends zzgc implements zzahn {
    zzahp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    public final zzxj getVideoController() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        zzxj zzk = zzxi.zzk(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzk;
    }

    public final void destroy() throws RemoteException {
        zza(4, obtainAndWriteInterfaceToken());
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaho zzaho) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzaho);
        zza(5, obtainAndWriteInterfaceToken);
    }

    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zza(6, obtainAndWriteInterfaceToken);
    }

    public final zzacm zzrv() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
        zzacm zzn = zzacp.zzn(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzn;
    }
}
