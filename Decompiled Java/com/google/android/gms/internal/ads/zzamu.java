package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzamu implements Runnable {
    private final /* synthetic */ zzamr zzdfi;
    private final /* synthetic */ AdRequest.ErrorCode zzdfj;

    zzamu(zzamr zzamr, AdRequest.ErrorCode errorCode) {
        this.zzdfi = zzamr;
        this.zzdfj = errorCode;
    }

    public final void run() {
        try {
            this.zzdfi.zzdex.onAdFailedToLoad(zzand.zza(this.zzdfj));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}
