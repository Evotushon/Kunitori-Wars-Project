package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbbn implements AudioManager.OnAudioFocusChangeListener {
    private float zzcy = 1.0f;
    private boolean zzdzg;
    private final AudioManager zzecg;
    private final zzbbq zzech;
    private boolean zzeci;
    private boolean zzecj;

    public zzbbn(Context context, zzbbq zzbbq) {
        this.zzecg = (AudioManager) context.getSystemService("audio");
        this.zzech = zzbbq;
    }

    public final void setMuted(boolean z) {
        this.zzecj = z;
        zzza();
    }

    public final void setVolume(float f) {
        this.zzcy = f;
        zzza();
    }

    public final float getVolume() {
        float f = this.zzecj ? 0.0f : this.zzcy;
        if (this.zzeci) {
            return f;
        }
        return 0.0f;
    }

    public final void zzyn() {
        this.zzdzg = true;
        zzza();
    }

    public final void zzyo() {
        this.zzdzg = false;
        zzza();
    }

    public final void onAudioFocusChange(int i) {
        this.zzeci = i > 0;
        this.zzech.zzxx();
    }

    private final void zzza() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.zzdzg && !this.zzecj && this.zzcy > 0.0f;
        if (z4 && !(z2 = this.zzeci)) {
            AudioManager audioManager = this.zzecg;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.zzeci = z3;
            }
            this.zzech.zzxx();
        } else if (!z4 && (z = this.zzeci)) {
            AudioManager audioManager2 = this.zzecg;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.zzeci = z3;
            }
            this.zzech.zzxx();
        }
    }
}
