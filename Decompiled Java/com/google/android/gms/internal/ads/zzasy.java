package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface zzasy extends IInterface {
    void onRewardedAdClosed() throws RemoteException;

    void onRewardedAdFailedToShow(int i) throws RemoteException;

    void onRewardedAdOpened() throws RemoteException;

    void zza(zzass zzass) throws RemoteException;
}
