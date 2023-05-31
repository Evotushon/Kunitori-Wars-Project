package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcdj extends VideoController.VideoLifecycleCallbacks {
    private final zzbyz zzfne;

    public zzcdj(zzbyz zzbyz) {
        this.zzfne = zzbyz;
    }

    public final void onVideoStart() {
        zzxk zza = zza(this.zzfne);
        if (zza != null) {
            try {
                zza.onVideoStart();
            } catch (RemoteException e) {
                zzawf.zzd("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoPause() {
        zzxk zza = zza(this.zzfne);
        if (zza != null) {
            try {
                zza.onVideoPause();
            } catch (RemoteException e) {
                zzawf.zzd("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoEnd() {
        zzxk zza = zza(this.zzfne);
        if (zza != null) {
            try {
                zza.onVideoEnd();
            } catch (RemoteException e) {
                zzawf.zzd("Unable to call onVideoEnd()", e);
            }
        }
    }

    private static zzxk zza(zzbyz zzbyz) {
        zzxj videoController = zzbyz.getVideoController();
        if (videoController == null) {
            return null;
        }
        try {
            return videoController.zzpo();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
