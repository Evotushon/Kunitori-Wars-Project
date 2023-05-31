package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzalr extends zzgc implements zzalp {
    zzalr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuk zzuk, zzuh zzuh, String str, zzalq zzalq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuk);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zza(1, obtainAndWriteInterfaceToken);
    }

    public final IObjectWrapper zzsp() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return asInterface;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzalq zzalq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zza(3, obtainAndWriteInterfaceToken);
    }

    public final void showInterstitial() throws RemoteException {
        zza(4, obtainAndWriteInterfaceToken());
    }

    public final void destroy() throws RemoteException {
        zza(5, obtainAndWriteInterfaceToken());
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuk zzuk, zzuh zzuh, String str, String str2, zzalq zzalq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuk);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zza(6, obtainAndWriteInterfaceToken);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, String str2, zzalq zzalq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zza(7, obtainAndWriteInterfaceToken);
    }

    public final void pause() throws RemoteException {
        zza(8, obtainAndWriteInterfaceToken());
    }

    public final void resume() throws RemoteException {
        zza(9, obtainAndWriteInterfaceToken());
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzasm zzasm, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzasm);
        obtainAndWriteInterfaceToken.writeString(str2);
        zza(10, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzuh zzuh, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        obtainAndWriteInterfaceToken.writeString(str);
        zza(11, obtainAndWriteInterfaceToken);
    }

    public final void showVideo() throws RemoteException {
        zza(12, obtainAndWriteInterfaceToken());
    }

    public final boolean isInitialized() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
        boolean zza = zzgd.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, String str2, zzalq zzalq, zzach zzach, List<String> list) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzach);
        obtainAndWriteInterfaceToken.writeStringList(list);
        zza(14, obtainAndWriteInterfaceToken);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzalx zzsq() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.obtainAndWriteInterfaceToken()
            r1 = 15
            android.os.Parcel r0 = r4.transactAndReadException(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzalx
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzalx r1 = (com.google.android.gms.internal.ads.zzalx) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzalz r2 = new com.google.android.gms.internal.ads.zzalz
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzsq():com.google.android.gms.internal.ads.zzalx");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaly zzsr() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.obtainAndWriteInterfaceToken()
            r1 = 16
            android.os.Parcel r0 = r4.transactAndReadException(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzaly
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzaly r1 = (com.google.android.gms.internal.ads.zzaly) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzama r2 = new com.google.android.gms.internal.ads.zzama
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzsr():com.google.android.gms.internal.ads.zzaly");
    }

    public final Bundle zzss() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) zzgd.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    public final Bundle getInterstitialAdapterInfo() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) zzgd.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    public final Bundle zzst() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) zzgd.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    public final void zza(zzuh zzuh, String str, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zza(20, obtainAndWriteInterfaceToken);
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zza(21, obtainAndWriteInterfaceToken);
    }

    public final boolean zzsu() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken());
        boolean zza = zzgd.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzasm zzasm, List<String> list) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzasm);
        obtainAndWriteInterfaceToken.writeStringList(list);
        zza(23, obtainAndWriteInterfaceToken);
    }

    public final zzadn zzsv() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken());
        zzadn zzr = zzadm.zzr(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzr;
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.writeBoolean(obtainAndWriteInterfaceToken, z);
        zza(25, obtainAndWriteInterfaceToken);
    }

    public final zzxj getVideoController() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
        zzxj zzk = zzxi.zzk(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzk;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzamd zzsw() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.obtainAndWriteInterfaceToken()
            r1 = 27
            android.os.Parcel r0 = r4.transactAndReadException(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzamd
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzamd r1 = (com.google.android.gms.internal.ads.zzamd) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzamf r2 = new com.google.android.gms.internal.ads.zzamf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzsw():com.google.android.gms.internal.ads.zzamd");
    }

    public final void zzb(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzalq zzalq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuh);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzalq);
        zza(28, obtainAndWriteInterfaceToken);
    }

    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zza(30, obtainAndWriteInterfaceToken);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzahb zzahb, List<zzahj> list) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzahb);
        obtainAndWriteInterfaceToken.writeTypedList(list);
        zza(31, obtainAndWriteInterfaceToken);
    }
}
