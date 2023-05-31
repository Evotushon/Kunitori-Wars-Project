package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzaqu extends zzge implements zzaqr {
    public zzaqu() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((ParcelFileDescriptor) zzgd.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zza((zzaxp) zzgd.zza(parcel, zzaxp.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
