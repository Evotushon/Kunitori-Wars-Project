package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface zzadn extends IInterface {
    void destroy() throws RemoteException;

    List<String> getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    zzxj getVideoController() throws RemoteException;

    void performClick(String str) throws RemoteException;

    void recordImpression() throws RemoteException;

    String zzcu(String str) throws RemoteException;

    zzacr zzcv(String str) throws RemoteException;

    boolean zzp(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzq(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzrj() throws RemoteException;

    IObjectWrapper zzro() throws RemoteException;

    boolean zzrp() throws RemoteException;

    boolean zzrq() throws RemoteException;

    void zzrr() throws RemoteException;
}
