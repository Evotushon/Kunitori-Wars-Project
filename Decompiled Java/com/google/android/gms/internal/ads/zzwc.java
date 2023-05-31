package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzwc extends zzgc implements zzwa {
    zzwc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    public final void onAdMetadataChanged() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }
}
