package com.google.android.gms.ads.formats;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    @Deprecated
    public static final int ORIENTATION_ANY = 0;
    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;
    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zzbkd;
    private final int zzbke;
    private final int zzbkf;
    private final boolean zzbkg;
    private final int zzbkh;
    private final VideoOptions zzbki;
    private final boolean zzbkj;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface NativeMediaAspectRatio {
    }

    private NativeAdOptions(Builder builder) {
        this.zzbkd = builder.zzbkd;
        this.zzbke = builder.zzbke;
        this.zzbkf = builder.zzbkf;
        this.zzbkg = builder.zzbkg;
        this.zzbkh = builder.zzbkh;
        this.zzbki = builder.zzbki;
        this.zzbkj = builder.zzbkj;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzbkd = false;
        /* access modifiers changed from: private */
        public int zzbke = -1;
        /* access modifiers changed from: private */
        public int zzbkf = 0;
        /* access modifiers changed from: private */
        public boolean zzbkg = false;
        /* access modifiers changed from: private */
        public int zzbkh = 1;
        /* access modifiers changed from: private */
        public VideoOptions zzbki;
        /* access modifiers changed from: private */
        public boolean zzbkj = false;

        public final Builder setReturnUrlsForImageAssets(boolean z) {
            this.zzbkd = z;
            return this;
        }

        @Deprecated
        public final Builder setImageOrientation(int i) {
            this.zzbke = i;
            return this;
        }

        public final Builder setMediaAspectRatio(@NativeMediaAspectRatio int i) {
            this.zzbkf = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean z) {
            this.zzbkg = z;
            return this;
        }

        public final Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.zzbkh = i;
            return this;
        }

        public final Builder setVideoOptions(VideoOptions videoOptions) {
            this.zzbki = videoOptions;
            return this;
        }

        public final Builder setRequestCustomMuteThisAd(boolean z) {
            this.zzbkj = z;
            return this;
        }

        public final NativeAdOptions build() {
            return new NativeAdOptions(this);
        }
    }

    public final boolean shouldReturnUrlsForImageAssets() {
        return this.zzbkd;
    }

    @Deprecated
    public final int getImageOrientation() {
        return this.zzbke;
    }

    public final int getMediaAspectRatio() {
        return this.zzbkf;
    }

    public final boolean shouldRequestMultipleImages() {
        return this.zzbkg;
    }

    public final int getAdChoicesPlacement() {
        return this.zzbkh;
    }

    @Nullable
    public final VideoOptions getVideoOptions() {
        return this.zzbki;
    }

    public final boolean zzjp() {
        return this.zzbkj;
    }
}
