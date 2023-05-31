package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzadm extends zzge implements zzadn {
    public zzadm() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzadn zzr(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof zzadn) {
            return (zzadn) queryLocalInterface;
        }
        return new zzadp(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String zzcu = zzcu(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(zzcu);
                return true;
            case 2:
                zzacr zzcv = zzcv(parcel.readString());
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzcv);
                return true;
            case 3:
                List<String> availableAssetNames = getAvailableAssetNames();
                parcel2.writeNoException();
                parcel2.writeStringList(availableAssetNames);
                return true;
            case 4:
                String customTemplateId = getCustomTemplateId();
                parcel2.writeNoException();
                parcel2.writeString(customTemplateId);
                return true;
            case 5:
                performClick(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 7:
                zzxj videoController = getVideoController();
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) videoController);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper zzro = zzro();
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzro);
                return true;
            case 10:
                boolean zzp = zzp(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgd.writeBoolean(parcel2, zzp);
                return true;
            case 11:
                IObjectWrapper zzrj = zzrj();
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzrj);
                return true;
            case 12:
                boolean zzrp = zzrp();
                parcel2.writeNoException();
                zzgd.writeBoolean(parcel2, zzrp);
                return true;
            case 13:
                boolean zzrq = zzrq();
                parcel2.writeNoException();
                zzgd.writeBoolean(parcel2, zzrq);
                return true;
            case 14:
                zzq(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zzrr();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
