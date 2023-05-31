package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface zzatb extends IInterface {
    void onRewardedAdFailedToLoad(int i) throws RemoteException;

    void onRewardedAdLoaded() throws RemoteException;
}
