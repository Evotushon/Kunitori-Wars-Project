package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaqt extends zzgc implements zzaqr {
    zzaqt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) parcelFileDescriptor);
        zza(1, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaxp zzaxp) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzaxp);
        zza(2, obtainAndWriteInterfaceToken);
    }
}
