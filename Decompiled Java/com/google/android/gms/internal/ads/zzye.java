package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzye implements MediaContent {
    private final VideoController zzcfe = new VideoController();
    private final zzacm zzcfx;

    public zzye(zzacm zzacm) {
        this.zzcfx = zzacm;
    }

    public final float getAspectRatio() {
        try {
            return this.zzcfx.getAspectRatio();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return 0.0f;
        }
    }

    public final float getDuration() {
        try {
            return this.zzcfx.getDuration();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return 0.0f;
        }
    }

    public final float getCurrentTime() {
        try {
            return this.zzcfx.getCurrentTime();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return 0.0f;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzcfx.getVideoController() != null) {
                this.zzcfe.zza(this.zzcfx.getVideoController());
            }
        } catch (RemoteException e) {
            zzazh.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcfe;
    }

    public final boolean hasVideoContent() {
        try {
            return this.zzcfx.hasVideoContent();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return false;
        }
    }

    public final void setMainImage(Drawable drawable) {
        try {
            this.zzcfx.zzo(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final Drawable getMainImage() {
        try {
            IObjectWrapper zzri = this.zzcfx.zzri();
            if (zzri != null) {
                return (Drawable) ObjectWrapper.unwrap(zzri);
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final zzacm zzqa() {
        return this.zzcfx;
    }
}
