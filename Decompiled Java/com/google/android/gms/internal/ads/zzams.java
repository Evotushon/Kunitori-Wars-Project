package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzams implements Runnable {
    private final /* synthetic */ zzamr zzdfi;

    zzams(zzamr zzamr) {
        this.zzdfi = zzamr;
    }

    public final void run() {
        try {
            this.zzdfi.zzdex.onAdLoaded();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}
