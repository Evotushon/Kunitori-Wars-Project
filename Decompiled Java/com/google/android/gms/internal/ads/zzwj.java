package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzwj extends zzge implements zzwg {
    public zzwj() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzvx zza = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzuk) zzgd.zza(parcel, zzuk.CREATOR), parcel.readString(), zzaln.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zza);
                return true;
            case 2:
                zzvx zzb = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzuk) zzgd.zza(parcel, zzuk.CREATOR), parcel.readString(), zzaln.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzb);
                return true;
            case 3:
                zzvq zza2 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzaln.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zza2);
                return true;
            case 4:
                zzwn zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzc);
                return true;
            case 5:
                zzacv zza3 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zza3);
                return true;
            case 6:
                zzary zza4 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzaln.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zza4);
                return true;
            case 7:
                zzapq zzd = zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzd);
                return true;
            case 8:
                zzapb zzb2 = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzb2);
                return true;
            case 9:
                zzwn zza5 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zza5);
                return true;
            case 10:
                zzvx zza6 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzuk) zzgd.zza(parcel, zzuk.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zza6);
                return true;
            case 11:
                zzacy zza7 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zza7);
                return true;
            case 12:
                zzast zzb3 = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzaln.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzb3);
                return true;
            case 13:
                zzvx zzc2 = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzuk) zzgd.zza(parcel, zzuk.CREATOR), parcel.readString(), zzaln.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzc2);
                return true;
            default:
                return false;
        }
    }
}
