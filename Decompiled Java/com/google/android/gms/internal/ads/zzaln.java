package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzaln extends zzge implements zzalk {
    public zzaln() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzalk zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzalk) {
            return (zzalk) queryLocalInterface;
        }
        return new zzalm(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzalp zzdf = zzdf(parcel.readString());
            parcel2.writeNoException();
            zzgd.zza(parcel2, (IInterface) zzdf);
        } else if (i == 2) {
            boolean zzdg = zzdg(parcel.readString());
            parcel2.writeNoException();
            zzgd.writeBoolean(parcel2, zzdg);
        } else if (i != 3) {
            return false;
        } else {
            zzanq zzdh = zzdh(parcel.readString());
            parcel2.writeNoException();
            zzgd.zza(parcel2, (IInterface) zzdh);
        }
        return true;
    }
}
