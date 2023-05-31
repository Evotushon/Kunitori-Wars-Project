package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzzd extends zzxn {
    private final VideoController.VideoLifecycleCallbacks zzacc;

    public zzzd(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzacc = videoLifecycleCallbacks;
    }

    public final void onVideoStart() {
        this.zzacc.onVideoStart();
    }

    public final void onVideoPlay() {
        this.zzacc.onVideoPlay();
    }

    public final void onVideoPause() {
        this.zzacc.onVideoPause();
    }

    public final void onVideoEnd() {
        this.zzacc.onVideoEnd();
    }

    public final void onVideoMute(boolean z) {
        this.zzacc.onVideoMute(z);
    }
}
