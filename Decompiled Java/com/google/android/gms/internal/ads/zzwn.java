package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface zzwn extends IInterface {
    String getVersionString() throws RemoteException;

    void initialize() throws RemoteException;

    void setAppMuted(boolean z) throws RemoteException;

    void setAppVolume(float f) throws RemoteException;

    void zza(zzahc zzahc) throws RemoteException;

    void zza(zzalk zzalk) throws RemoteException;

    void zza(zzyw zzyw) throws RemoteException;

    void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzce(String str) throws RemoteException;

    void zzcf(String str) throws RemoteException;

    float zzpj() throws RemoteException;

    boolean zzpk() throws RemoteException;

    List<zzagz> zzpl() throws RemoteException;
}
