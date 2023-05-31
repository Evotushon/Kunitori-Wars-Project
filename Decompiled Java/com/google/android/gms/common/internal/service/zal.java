package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class zal extends zaa implements zai {
    public zal() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* access modifiers changed from: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zaj(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
