package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzyv implements Runnable {
    private final /* synthetic */ zzys zzcgh;

    zzyv(zzys zzys) {
        this.zzcgh = zzys;
    }

    public final void run() {
        if (this.zzcgh.zzcge != null) {
            try {
                this.zzcgh.zzcge.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzazh.zzd("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
