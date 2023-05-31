package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface zzalq extends IInterface {
    void onAdClicked() throws RemoteException;

    void onAdClosed() throws RemoteException;

    void onAdFailedToLoad(int i) throws RemoteException;

    void onAdImpression() throws RemoteException;

    void onAdLeftApplication() throws RemoteException;

    void onAdLoaded() throws RemoteException;

    void onAdOpened() throws RemoteException;

    void onAppEvent(String str, String str2) throws RemoteException;

    void onVideoEnd() throws RemoteException;

    void onVideoPause() throws RemoteException;

    void onVideoPlay() throws RemoteException;

    void zza(zzadn zzadn, String str) throws RemoteException;

    void zza(zzalv zzalv) throws RemoteException;

    void zza(zzass zzass) throws RemoteException;

    void zzb(Bundle bundle) throws RemoteException;

    void zzb(zzasq zzasq) throws RemoteException;

    void zzco(int i) throws RemoteException;

    void zzdk(String str) throws RemoteException;

    void zzsx() throws RemoteException;

    void zzsy() throws RemoteException;
}
