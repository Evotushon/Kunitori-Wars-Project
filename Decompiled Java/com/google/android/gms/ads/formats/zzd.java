package com.google.android.gms.ads.formats;

import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzace;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zzd implements zzace {
    private final UnifiedNativeAdView zzbku;

    zzd(UnifiedNativeAdView unifiedNativeAdView) {
        this.zzbku = unifiedNativeAdView;
    }

    public final void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzbku.zza(scaleType);
    }
}
