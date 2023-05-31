package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzri extends zzgc implements zzrg {
    zzri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final zzvx zzdr() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        zzvx zzc = zzvw.zzc(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzc;
    }

    public final void zza(zzrm zzrm) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzrm);
        zza(3, obtainAndWriteInterfaceToken);
    }
}
