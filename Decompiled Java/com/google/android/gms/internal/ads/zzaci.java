package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzaci extends zzge implements zzacj {
    public zzaci() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzacj zzm(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof zzacj) {
            return (zzacj) queryLocalInterface;
        }
        return new zzacl(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String text = getText();
            parcel2.writeNoException();
            parcel2.writeString(text);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List<zzacr> zzrb = zzrb();
            parcel2.writeNoException();
            parcel2.writeList(zzrb);
            return true;
        }
    }
}
