package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzyl implements Runnable {
    private final /* synthetic */ zzyi zzcga;

    zzyl(zzyi zzyi) {
        this.zzcga = zzyi;
    }

    public final void run() {
        if (this.zzcga.zzcfz.zzblz != null) {
            try {
                this.zzcga.zzcfz.zzblz.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzazh.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
