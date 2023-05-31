package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface zzvx extends IInterface {
    void destroy() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getAdUnitId() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzxj getVideoController() throws RemoteException;

    boolean isLoading() throws RemoteException;

    boolean isReady() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setManualImpressionsEnabled(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void stopLoading() throws RemoteException;

    void zza(zzaaq zzaaq) throws RemoteException;

    void zza(zzapl zzapl) throws RemoteException;

    void zza(zzapr zzapr, String str) throws RemoteException;

    void zza(zzasb zzasb) throws RemoteException;

    void zza(zzrh zzrh) throws RemoteException;

    void zza(zzuk zzuk) throws RemoteException;

    void zza(zzur zzur) throws RemoteException;

    void zza(zzvj zzvj) throws RemoteException;

    void zza(zzvk zzvk) throws RemoteException;

    void zza(zzwa zzwa) throws RemoteException;

    void zza(zzwf zzwf) throws RemoteException;

    void zza(zzwl zzwl) throws RemoteException;

    void zza(zzxd zzxd) throws RemoteException;

    void zza(zzxp zzxp) throws RemoteException;

    void zza(zzzc zzzc) throws RemoteException;

    boolean zza(zzuh zzuh) throws RemoteException;

    void zzbs(String str) throws RemoteException;

    IObjectWrapper zzkc() throws RemoteException;

    void zzkd() throws RemoteException;

    zzuk zzke() throws RemoteException;

    String zzkf() throws RemoteException;

    zzxe zzkg() throws RemoteException;

    zzwf zzkh() throws RemoteException;

    zzvk zzki() throws RemoteException;
}
