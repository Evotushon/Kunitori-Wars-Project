package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzano extends zzge implements zzanp {
    public zzano() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zztg();
        } else if (i != 3) {
            return false;
        } else {
            zzdm(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
