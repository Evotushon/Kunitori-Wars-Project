package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsh implements zztz {
    @GuardedBy("this")
    private zzvj zzgge;

    public final synchronized void zzb(zzvj zzvj) {
        this.zzgge = zzvj;
    }

    public final synchronized void onAdClicked() {
        if (this.zzgge != null) {
            try {
                this.zzgge.onAdClicked();
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
