package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzzc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class VideoOptions {
    private final boolean zzacd;
    private final boolean zzace;
    private final boolean zzacf;

    public VideoOptions(zzzc zzzc) {
        this.zzacd = zzzc.zzacd;
        this.zzace = zzzc.zzace;
        this.zzacf = zzzc.zzacf;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzacd = true;
        /* access modifiers changed from: private */
        public boolean zzace = false;
        /* access modifiers changed from: private */
        public boolean zzacf = false;

        public final Builder setStartMuted(boolean z) {
            this.zzacd = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzace = z;
            return this;
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzacf = z;
            return this;
        }

        public final VideoOptions build() {
            return new VideoOptions(this);
        }
    }

    private VideoOptions(Builder builder) {
        this.zzacd = builder.zzacd;
        this.zzace = builder.zzace;
        this.zzacf = builder.zzacf;
    }

    public final boolean getStartMuted() {
        return this.zzacd;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzace;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzacf;
    }
}
