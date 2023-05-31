package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzata extends zzgc implements zzasy {
    zzata(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void onRewardedAdOpened() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }

    public final void onRewardedAdClosed() throws RemoteException {
        zza(2, obtainAndWriteInterfaceToken());
    }

    public final void zza(zzass zzass) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzass);
        zza(3, obtainAndWriteInterfaceToken);
    }

    public final void onRewardedAdFailedToShow(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        zza(4, obtainAndWriteInterfaceToken);
    }
}
