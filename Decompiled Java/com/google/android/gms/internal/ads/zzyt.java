package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zzyt implements Runnable {
    private final zzatb zzcgf;

    zzyt(zzatb zzatb) {
        this.zzcgf = zzatb;
    }

    public final void run() {
        zzatb zzatb = this.zzcgf;
        if (zzatb != null) {
            try {
                zzatb.onRewardedAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzazh.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
