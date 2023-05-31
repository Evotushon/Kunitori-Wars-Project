package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzyn implements Runnable {
    private final /* synthetic */ zzyk zzcgc;

    zzyn(zzyk zzyk) {
        this.zzcgc = zzyk;
    }

    public final void run() {
        if (this.zzcgc.zzblz != null) {
            try {
                this.zzcgc.zzblz.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzazh.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
