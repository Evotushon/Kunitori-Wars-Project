package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzahr extends zzge implements zzaho {
    public zzahr() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzrz();
        } else if (i != 2) {
            return false;
        } else {
            zzcn(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
