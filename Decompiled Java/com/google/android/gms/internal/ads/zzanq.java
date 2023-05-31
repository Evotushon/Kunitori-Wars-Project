package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface zzanq extends IInterface {
    zzxj getVideoController() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzuk zzuk, zzanv zzanv) throws RemoteException;

    void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzane zzane, zzalq zzalq, zzuk zzuk) throws RemoteException;

    void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzanj zzanj, zzalq zzalq) throws RemoteException;

    void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzank zzank, zzalq zzalq) throws RemoteException;

    void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzanp zzanp, zzalq zzalq) throws RemoteException;

    void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException;

    boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdn(String str) throws RemoteException;

    zzaoe zzth() throws RemoteException;

    zzaoe zzti() throws RemoteException;

    void zzy(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException;
}
