package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzasd extends zzgc implements zzasb {
    zzasd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void onRewardedVideoAdLoaded() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }

    public final void onRewardedVideoAdOpened() throws RemoteException {
        zza(2, obtainAndWriteInterfaceToken());
    }

    public final void onRewardedVideoStarted() throws RemoteException {
        zza(3, obtainAndWriteInterfaceToken());
    }

    public final void onRewardedVideoAdClosed() throws RemoteException {
        zza(4, obtainAndWriteInterfaceToken());
    }

    public final void zza(zzarr zzarr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzarr);
        zza(5, obtainAndWriteInterfaceToken);
    }

    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        zza(6, obtainAndWriteInterfaceToken());
    }

    public final void onRewardedVideoAdFailedToLoad(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        zza(7, obtainAndWriteInterfaceToken);
    }

    public final void onRewardedVideoCompleted() throws RemoteException {
        zza(8, obtainAndWriteInterfaceToken());
    }
}
