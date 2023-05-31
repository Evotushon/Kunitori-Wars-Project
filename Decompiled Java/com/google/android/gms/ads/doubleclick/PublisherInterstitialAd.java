package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzxv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class PublisherInterstitialAd {
    private final zzxv zzabs;

    public PublisherInterstitialAd(Context context) {
        this.zzabs = new zzxv(context, this);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @KeepForSdk
    @Deprecated
    public final void setCorrelator(Correlator correlator) {
    }

    public final AdListener getAdListener() {
        return this.zzabs.getAdListener();
    }

    public final String getAdUnitId() {
        return this.zzabs.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzabs.getAppEventListener();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzabs.getOnCustomRenderedAdLoadedListener();
    }

    public final boolean isLoaded() {
        return this.zzabs.isLoaded();
    }

    public final boolean isLoading() {
        return this.zzabs.isLoading();
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzabs.zza(publisherAdRequest.zzdl());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzabs.setAdListener(adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzabs.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzabs.setAppEventListener(appEventListener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzabs.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzabs.getMediationAdapterClassName();
    }

    public final void show() {
        this.zzabs.show();
    }

    public final void setImmersiveMode(boolean z) {
        this.zzabs.setImmersiveMode(z);
    }

    @Nullable
    public final ResponseInfo getResponseInfo() {
        return this.zzabs.getResponseInfo();
    }
}
