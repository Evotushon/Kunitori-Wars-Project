package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public class zzh implements IInterface {
    private final IBinder zza;
    private final String zzb = IInAppBillingService.DESCRIPTOR;

    protected zzh(IBinder iBinder, String str) {
        this.zza = iBinder;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final Parcel zzo() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel zzp(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.zza.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzq(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(1201, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
