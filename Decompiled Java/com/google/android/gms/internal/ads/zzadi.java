package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzadi extends zzge implements zzadj {
    public zzadi() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper zzrj = zzrj();
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzrj);
                return true;
            case 3:
                String headline = getHeadline();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 4:
                List images = getImages();
                parcel2.writeNoException();
                parcel2.writeList(images);
                return true;
            case 5:
                String body = getBody();
                parcel2.writeNoException();
                parcel2.writeString(body);
                return true;
            case 6:
                zzacr zzrn = zzrn();
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzrn);
                return true;
            case 7:
                String callToAction = getCallToAction();
                parcel2.writeNoException();
                parcel2.writeString(callToAction);
                return true;
            case 8:
                String advertiser = getAdvertiser();
                parcel2.writeNoException();
                parcel2.writeString(advertiser);
                return true;
            case 9:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgd.zzb(parcel2, extras);
                return true;
            case 10:
                destroy();
                parcel2.writeNoException();
                return true;
            case 11:
                zzxj videoController = getVideoController();
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) videoController);
                return true;
            case 12:
                performClick((Bundle) zzgd.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean recordImpression = recordImpression((Bundle) zzgd.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzgd.writeBoolean(parcel2, recordImpression);
                return true;
            case 14:
                reportTouchEvent((Bundle) zzgd.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzacj zzrl = zzrl();
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzrl);
                return true;
            case 16:
                IObjectWrapper zzrm = zzrm();
                parcel2.writeNoException();
                zzgd.zza(parcel2, (IInterface) zzrm);
                return true;
            case 17:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            default:
                return false;
        }
    }
}
