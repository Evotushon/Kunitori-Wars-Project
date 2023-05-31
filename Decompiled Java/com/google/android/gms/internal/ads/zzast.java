package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface zzast extends IInterface {
    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    void zza(zzasy zzasy) throws RemoteException;

    void zza(zzatg zzatg) throws RemoteException;

    void zza(zzato zzato) throws RemoteException;

    void zza(zzuh zzuh, zzatb zzatb) throws RemoteException;

    void zza(zzwy zzwy) throws RemoteException;

    void zza(zzxd zzxd) throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzxe zzkg() throws RemoteException;

    zzass zzqc() throws RemoteException;
}
