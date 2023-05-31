package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsj implements AppEventListener {
    @GuardedBy("this")
    private zzwf zzggi;

    public final synchronized void zzb(zzwf zzwf) {
        this.zzggi = zzwf;
    }

    public final synchronized zzwf zzaop() {
        return this.zzggi;
    }

    public final synchronized void onAppEvent(String str, String str2) {
        if (this.zzggi != null) {
            try {
                this.zzggi.onAppEvent(str, str2);
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception at onAppEvent.", e);
            }
        }
    }
}
