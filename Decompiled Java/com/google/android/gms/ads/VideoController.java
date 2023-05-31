package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzxj;
import com.google.android.gms.internal.ads.zzzd;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class VideoController {
    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object lock = new Object();
    @GuardedBy("lock")
    @Nullable
    private zzxj zzacb;
    @GuardedBy("lock")
    @Nullable
    private VideoLifecycleCallbacks zzacc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final void zza(zzxj zzxj) {
        synchronized (this.lock) {
            this.zzacb = zzxj;
            if (this.zzacc != null) {
                setVideoLifecycleCallbacks(this.zzacc);
            }
        }
    }

    public final zzxj zzdq() {
        zzxj zzxj;
        synchronized (this.lock) {
            zzxj = this.zzacb;
        }
        return zzxj;
    }

    public final void play() {
        synchronized (this.lock) {
            if (this.zzacb != null) {
                try {
                    this.zzacb.play();
                } catch (RemoteException e) {
                    zzazh.zzc("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public final void pause() {
        synchronized (this.lock) {
            if (this.zzacb != null) {
                try {
                    this.zzacb.pause();
                } catch (RemoteException e) {
                    zzazh.zzc("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public final void stop() {
        synchronized (this.lock) {
            if (this.zzacb != null) {
                try {
                    this.zzacb.stop();
                } catch (RemoteException e) {
                    zzazh.zzc("Unable to call stop on video controller.", e);
                }
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.lock) {
            if (this.zzacb != null) {
                try {
                    this.zzacb.mute(z);
                } catch (RemoteException e) {
                    zzazh.zzc("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.lock) {
            if (this.zzacb == null) {
                return true;
            }
            try {
                boolean isMuted = this.zzacb.isMuted();
                return isMuted;
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    @KeepForSdk
    public final int getPlaybackState() {
        synchronized (this.lock) {
            if (this.zzacb == null) {
                return 0;
            }
            try {
                int playbackState = this.zzacb.getPlaybackState();
                return playbackState;
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.lock) {
            if (this.zzacb == null) {
                return false;
            }
            try {
                boolean isCustomControlsEnabled = this.zzacb.isCustomControlsEnabled();
                return isCustomControlsEnabled;
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.lock) {
            if (this.zzacb == null) {
                return false;
            }
            try {
                boolean isClickToExpandEnabled = this.zzacb.isClickToExpandEnabled();
                return isClickToExpandEnabled;
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final float getVideoDuration() {
        synchronized (this.lock) {
            if (this.zzacb == null) {
                return 0.0f;
            }
            try {
                float duration = this.zzacb.getDuration();
                return duration;
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call getDuration on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final float getVideoCurrentTime() {
        synchronized (this.lock) {
            if (this.zzacb == null) {
                return 0.0f;
            }
            try {
                float currentTime = this.zzacb.getCurrentTime();
                return currentTime;
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call getCurrentTime on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.lock) {
            this.zzacc = videoLifecycleCallbacks;
            if (this.zzacb != null) {
                try {
                    this.zzacb.zza(new zzzd(videoLifecycleCallbacks));
                } catch (RemoteException e) {
                    zzazh.zzc("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    @Nullable
    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.lock) {
            videoLifecycleCallbacks = this.zzacc;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzacb != null;
        }
        return z;
    }

    @Deprecated
    public final float getAspectRatio() {
        synchronized (this.lock) {
            if (this.zzacb == null) {
                return 0.0f;
            }
            try {
                float aspectRatio = this.zzacb.getAspectRatio();
                return aspectRatio;
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }
}
