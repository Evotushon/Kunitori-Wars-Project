package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzafd extends zzaej {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zzcxt;

    public zzafd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zzcxt = onUnifiedNativeAdLoadedListener;
    }

    public final void zza(zzaer zzaer) {
        this.zzcxt.onUnifiedNativeAdLoaded(new zzaes(zzaer));
    }
}
