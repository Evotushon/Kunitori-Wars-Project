package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzame extends zzxi {
    private final Object lock = new Object();
    private volatile zzxk zzdek;

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
        throw new RemoteException();
    }

    public final float getCurrentTime() throws RemoteException {
        throw new RemoteException();
    }

    public final void zza(zzxk zzxk) throws RemoteException {
        synchronized (this.lock) {
            this.zzdek = zzxk;
        }
    }

    public final zzxk zzpo() throws RemoteException {
        zzxk zzxk;
        synchronized (this.lock) {
            zzxk = this.zzdek;
        }
        return zzxk;
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
