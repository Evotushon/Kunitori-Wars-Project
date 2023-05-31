package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzvs extends zzgc implements zzvq {
    zzvs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzvp zzpi() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.obtainAndWriteInterfaceToken()
            r1 = 1
            android.os.Parcel r0 = r4.transactAndReadException(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzvp
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzvp r1 = (com.google.android.gms.internal.ads.zzvp) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzvr r2 = new com.google.android.gms.internal.ads.zzvr
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvs.zzpi():com.google.android.gms.internal.ads.zzvp");
    }

    public final void zzb(zzvk zzvk) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzvk);
        zza(2, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzadr zzadr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzadr);
        zza(3, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzads zzads) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzads);
        zza(4, obtainAndWriteInterfaceToken);
    }

    public final void zza(String str, zzady zzady, zzadx zzadx) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzady);
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzadx);
        zza(5, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzach zzach) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzach);
        zza(6, obtainAndWriteInterfaceToken);
    }

    public final void zzb(zzwl zzwl) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzwl);
        zza(7, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaef zzaef, zzuk zzuk) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzaef);
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuk);
        zza(8, obtainAndWriteInterfaceToken);
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) publisherAdViewOptions);
        zza(9, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaeg zzaeg) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzaeg);
        zza(10, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzahl zzahl) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzahl);
        zza(13, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaht zzaht) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgd.zza(obtainAndWriteInterfaceToken, (IInterface) zzaht);
        zza(14, obtainAndWriteInterfaceToken);
    }
}
