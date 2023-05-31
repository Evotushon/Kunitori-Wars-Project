package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxd {
    private float zzdkj = 1.0f;
    private boolean zzdkp = false;

    public final synchronized void setAppVolume(float f) {
        this.zzdkj = f;
    }

    public final synchronized float zzpj() {
        if (!zzwy()) {
            return 1.0f;
        }
        return this.zzdkj;
    }

    public final synchronized void setAppMuted(boolean z) {
        this.zzdkp = z;
    }

    public final synchronized boolean zzpk() {
        return this.zzdkp;
    }

    private final synchronized boolean zzwy() {
        return this.zzdkj >= 0.0f;
    }

    public static float zzbh(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }
}
