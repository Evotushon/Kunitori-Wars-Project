package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzann extends zzge implements zzank {
    public zzann() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zza(zzamc.zzae(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            zzdm(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
