package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface zzalp extends IInterface {
    void destroy() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzxj getVideoController() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzahb zzahb, List<zzahj> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzasm zzasm, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzalq zzalq) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzasm zzasm, String str2) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, String str2, zzalq zzalq) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, String str2, zzalq zzalq, zzach zzach, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuk zzuk, zzuh zzuh, String str, zzalq zzalq) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuk zzuk, zzuh zzuh, String str, String str2, zzalq zzalq) throws RemoteException;

    void zza(zzuh zzuh, String str) throws RemoteException;

    void zza(zzuh zzuh, String str, String str2) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzalq zzalq) throws RemoteException;

    void zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzsp() throws RemoteException;

    zzalx zzsq() throws RemoteException;

    zzaly zzsr() throws RemoteException;

    Bundle zzss() throws RemoteException;

    Bundle zzst() throws RemoteException;

    boolean zzsu() throws RemoteException;

    zzadn zzsv() throws RemoteException;

    zzamd zzsw() throws RemoteException;

    void zzt(IObjectWrapper iObjectWrapper) throws RemoteException;
}
