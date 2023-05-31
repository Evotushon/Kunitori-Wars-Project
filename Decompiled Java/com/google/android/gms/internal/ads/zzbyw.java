package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbyw extends zzxi {
    private final Object lock = new Object();
    @Nullable
    private zzxj zzfoy;
    @Nullable
    private final zzamd zzfoz;

    public zzbyw(@Nullable zzxj zzxj, @Nullable zzamd zzamd) {
        this.zzfoy = zzxj;
        this.zzfoz = zzamd;
    }

    public final void play() throws RemoteException {
        throw new RemoteException();
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void stop() throws RemoteException {
        throw new RemoteException();
    }

    public final void mute(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final boolean isMuted() throws RemoteException {
        throw new RemoteException();
    }

    public final int getPlaybackState() throws RemoteException {
        throw new RemoteException();
    }

    public final float getDuration() throws RemoteException {
        zzamd zzamd = this.zzfoz;
        if (zzamd != null) {
            return zzamd.getVideoDuration();
        }
        return 0.0f;
    }

    public final float getCurrentTime() throws RemoteException {
        zzamd zzamd = this.zzfoz;
        if (zzamd != null) {
            return zzamd.getVideoCurrentTime();
        }
        return 0.0f;
    }

    public final void zza(zzxk zzxk) throws RemoteException {
        synchronized (this.lock) {
            if (this.zzfoy != null) {
                this.zzfoy.zza(zzxk);
            }
        }
    }

    public final zzxk zzpo() throws RemoteException {
        synchronized (this.lock) {
            if (this.zzfoy == null) {
                return null;
            }
            zzxk zzpo = this.zzfoy.zzpo();
            return zzpo;
        }
    }

    public final float getAspectRatio() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean isCustomControlsEnabled() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean isClickToExpandEnabled() throws RemoteException {
        throw new RemoteException();
    }
}
