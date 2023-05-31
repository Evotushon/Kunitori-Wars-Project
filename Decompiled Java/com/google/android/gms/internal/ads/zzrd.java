package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAdPresentationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzrd extends zzrl {
    private final AppOpenAdPresentationCallback zzbre;

    public zzrd(AppOpenAdPresentationCallback appOpenAdPresentationCallback) {
        this.zzbre = appOpenAdPresentationCallback;
    }

    public final void onAppOpenAdClosed() {
        this.zzbre.onAppOpenAdClosed();
    }
}
