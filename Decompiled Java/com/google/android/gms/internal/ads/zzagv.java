package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzagv extends zzago {
    private final /* synthetic */ zzazy zzbsb;

    zzagv(zzags zzags, zzazy zzazy) {
        this.zzbsb = zzazy;
    }

    public final void zza(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.zzbsb.set(parcelFileDescriptor);
    }
}
