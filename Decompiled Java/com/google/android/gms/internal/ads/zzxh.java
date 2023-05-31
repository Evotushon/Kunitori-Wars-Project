package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzxh extends zzge implements zzxe {
    public zzxh() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzxe zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        if (queryLocalInterface instanceof zzxe) {
            return (zzxe) queryLocalInterface;
        }
        return new zzxg(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String mediationAdapterClassName = getMediationAdapterClassName();
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
        } else if (i != 2) {
            return false;
        } else {
            String responseId = getResponseId();
            parcel2.writeNoException();
            parcel2.writeString(responseId);
        }
        return true;
    }
}
