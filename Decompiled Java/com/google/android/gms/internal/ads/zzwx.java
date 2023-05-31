package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzwx extends zzge implements zzwu {
    public zzwx() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzwu zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzwu) {
            return (zzwu) queryLocalInterface;
        }
        return new zzww(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String description = getDescription();
            parcel2.writeNoException();
            parcel2.writeString(description);
        } else if (i != 2) {
            return false;
        } else {
            String zzpm = zzpm();
            parcel2.writeNoException();
            parcel2.writeString(zzpm);
        }
        return true;
    }
}
