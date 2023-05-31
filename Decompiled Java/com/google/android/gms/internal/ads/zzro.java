package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzro extends zzgc implements zzrm {
    zzro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
    }

    public final void onAppOpenAdClosed() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }
}
