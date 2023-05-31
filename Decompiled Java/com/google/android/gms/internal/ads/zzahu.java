package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.ads.instream.InstreamAdView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzahu extends InstreamAd {
    private MediaContent zzbjx = zzsb();
    private VideoController zzcfe = zzsa();
    private final zzahn zzczn;

    public zzahu(zzahn zzahn) {
        this.zzczn = zzahn;
    }

    public final void zza(InstreamAdView instreamAdView) {
        if (instreamAdView == null) {
            zzazh.zzey("showInView: parameter view must not be null.");
            return;
        }
        try {
            this.zzczn.zzr(ObjectWrapper.wrap(instreamAdView));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final MediaContent getMediaContent() {
        return this.zzbjx;
    }

    public final VideoController getVideoController() {
        return this.zzcfe;
    }

    public final float getVideoDuration() {
        VideoController videoController = this.zzcfe;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoDuration();
    }

    public final float getVideoCurrentTime() {
        VideoController videoController = this.zzcfe;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoCurrentTime();
    }

    public final float getAspectRatio() {
        VideoController videoController = this.zzcfe;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getAspectRatio();
    }

    public final void destroy() {
        try {
            this.zzczn.destroy();
            this.zzcfe = null;
            this.zzbjx = null;
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    private final VideoController zzsa() {
        VideoController videoController = new VideoController();
        try {
            videoController.zza(this.zzczn.getVideoController());
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        return videoController;
    }

    private final MediaContent zzsb() {
        try {
            if (this.zzczn.zzrv() != null) {
                return new zzye(this.zzczn.zzrv());
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
