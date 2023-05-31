package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAdOptions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface NativeMediationAdRequest extends MediationAdRequest {
    float getAdVolume();

    NativeAdOptions getNativeAdOptions();

    boolean isAdMuted();

    boolean isAppInstallAdRequested();

    boolean isContentAdRequested();

    boolean isUnifiedNativeAdRequested();

    boolean zzte();

    Map<String, Boolean> zztf();
}
