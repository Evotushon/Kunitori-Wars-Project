package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzwm extends zzge implements zzwn {
    public zzwm() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                initialize();
                parcel2.writeNoException();
                return true;
            case 2:
                setAppVolume(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                zzce(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                setAppMuted(zzgd.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zza(parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float zzpj = zzpj();
                parcel2.writeNoException();
                parcel2.writeFloat(zzpj);
                return true;
            case 8:
                boolean zzpk = zzpk();
                parcel2.writeNoException();
                zzgd.writeBoolean(parcel2, zzpk);
                return true;
            case 9:
                String versionString = getVersionString();
                parcel2.writeNoException();
                parcel2.writeString(versionString);
                return true;
            case 10:
                zzcf(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zza(zzaln.zzac(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                zza(zzahf.zzaa(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzagz> zzpl = zzpl();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzpl);
                return true;
            case 14:
                zza((zzyw) zzgd.zza(parcel, zzyw.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
