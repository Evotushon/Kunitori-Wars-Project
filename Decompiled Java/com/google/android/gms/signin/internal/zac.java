package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public interface zac extends IInterface {
    void zaa(ConnectionResult connectionResult, zab zab) throws RemoteException;

    void zaa(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;

    void zaa(zag zag) throws RemoteException;

    void zab(zam zam) throws RemoteException;

    void zag(Status status) throws RemoteException;

    void zah(Status status) throws RemoteException;
}
