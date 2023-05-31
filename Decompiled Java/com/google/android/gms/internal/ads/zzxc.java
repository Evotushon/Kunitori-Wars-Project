package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzxc extends zzge implements zzxd {
    public zzxc() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzxd zzi(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzxd) {
            return (zzxd) queryLocalInterface;
        }
        return new zzxf(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zza((zzum) zzgd.zza(parcel, zzum.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
