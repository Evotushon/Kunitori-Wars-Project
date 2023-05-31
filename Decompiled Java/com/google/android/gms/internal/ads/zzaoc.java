package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzaoc implements SignalCallbacks {
    private final /* synthetic */ zzanv zzdfv;

    zzaoc(zzanz zzanz, zzanv zzanv) {
        this.zzdfv = zzanv;
    }

    public final void onSuccess(String str) {
        try {
            this.zzdfv.zzdo(str);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zzdfv.onFailure(str);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
