package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.zzacc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zze implements zzacc {
    private final UnifiedNativeAdView zzbku;

    zze(UnifiedNativeAdView unifiedNativeAdView) {
        this.zzbku = unifiedNativeAdView;
    }

    public final void setMediaContent(MediaContent mediaContent) {
        this.zzbku.zza(mediaContent);
    }
}
