package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzud extends zzvn {
    private final AdListener zzcck;

    public zzud(AdListener adListener) {
        this.zzcck = adListener;
    }

    public final void onAdClosed() {
        this.zzcck.onAdClosed();
    }

    public final void onAdFailedToLoad(int i) {
        this.zzcck.onAdFailedToLoad(i);
    }

    public final void onAdLeftApplication() {
        this.zzcck.onAdLeftApplication();
    }

    public final void onAdLoaded() {
        this.zzcck.onAdLoaded();
    }

    public final void onAdOpened() {
        this.zzcck.onAdOpened();
    }

    public final void onAdClicked() {
        this.zzcck.onAdClicked();
    }

    public final void onAdImpression() {
        this.zzcck.onAdImpression();
    }

    public final AdListener getAdListener() {
        return this.zzcck;
    }
}
