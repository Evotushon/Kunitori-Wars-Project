package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzami implements InitializationCompleteCallback {
    private final /* synthetic */ zzahb zzdes;

    zzami(zzamg zzamg, zzahb zzahb) {
        this.zzdes = zzahb;
    }

    public final void onInitializationSucceeded() {
        try {
            this.zzdes.onInitializationSucceeded();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zzdes.onInitializationFailed(str);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
