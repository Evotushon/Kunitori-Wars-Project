package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbym extends zzacp {
    private final zzbyz zzfne;
    private IObjectWrapper zzfob;

    public zzbym(zzbyz zzbyz) {
        this.zzfne = zzbyz;
    }

    public final float getAspectRatio() throws RemoteException {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcrh)).booleanValue()) {
            return 0.0f;
        }
        if (this.zzfne.getMediaContentAspectRatio() != 0.0f) {
            return this.zzfne.getMediaContentAspectRatio();
        }
        if (this.zzfne.getVideoController() != null) {
            return zzajy();
        }
        IObjectWrapper iObjectWrapper = this.zzfob;
        if (iObjectWrapper != null) {
            return zzar(iObjectWrapper);
        }
        zzacr zzakg = this.zzfne.zzakg();
        if (zzakg == null) {
            return 0.0f;
        }
        float width = (zzakg == null || zzakg.getWidth() == -1 || zzakg.getHeight() == -1) ? 0.0f : ((float) zzakg.getWidth()) / ((float) zzakg.getHeight());
        if (width != 0.0f) {
            return width;
        }
        return zzar(zzakg.zzrg());
    }

    public final float getDuration() throws RemoteException {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcri)).booleanValue() && this.zzfne.getVideoController() != null) {
            return this.zzfne.getVideoController().getDuration();
        }
        return 0.0f;
    }

    public final float getCurrentTime() throws RemoteException {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcri)).booleanValue() && this.zzfne.getVideoController() != null) {
            return this.zzfne.getVideoController().getCurrentTime();
        }
        return 0.0f;
    }

    public final zzxj getVideoController() throws RemoteException {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcri)).booleanValue()) {
            return null;
        }
        return this.zzfne.getVideoController();
    }

    public final boolean hasVideoContent() throws RemoteException {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcri)).booleanValue() && this.zzfne.getVideoController() != null) {
            return true;
        }
        return false;
    }

    public final void zza(zzaed zzaed) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcri)).booleanValue() && (this.zzfne.getVideoController() instanceof zzbeq)) {
            ((zzbeq) this.zzfne.getVideoController()).zza(zzaed);
        }
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmz)).booleanValue()) {
            this.zzfob = iObjectWrapper;
        }
    }

    public final IObjectWrapper zzri() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzfob;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzacr zzakg = this.zzfne.zzakg();
        if (zzakg == null) {
            return null;
        }
        return zzakg.zzrg();
    }

    private final float zzajy() {
        try {
            return this.zzfne.getVideoController().getAspectRatio();
        } catch (RemoteException e) {
            zzawf.zzc("Remote exception getting video controller aspect ratio.", e);
            return 0.0f;
        }
    }

    private static float zzar(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }
}
