package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzxt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class PublisherAdView extends ViewGroup {
    private final zzxt zzaci;

    public PublisherAdView(Context context) {
        super(context);
        this.zzaci = new zzxt(this);
    }

    @KeepForSdk
    @Deprecated
    public final void setCorrelator(Correlator correlator) {
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzaci = new zzxt(this, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzaci = new zzxt(this, attributeSet, true);
    }

    public final VideoController getVideoController() {
        return this.zzaci.getVideoController();
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzaci.setVideoOptions(videoOptions);
    }

    public final VideoOptions getVideoOptions() {
        return this.zzaci.getVideoOptions();
    }

    public final void destroy() {
        this.zzaci.destroy();
    }

    public final AdListener getAdListener() {
        return this.zzaci.getAdListener();
    }

    public final AdSize getAdSize() {
        return this.zzaci.getAdSize();
    }

    public final AdSize[] getAdSizes() {
        return this.zzaci.getAdSizes();
    }

    public final String getAdUnitId() {
        return this.zzaci.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzaci.getAppEventListener();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzaci.getOnCustomRenderedAdLoadedListener();
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzaci.zza(publisherAdRequest.zzdl());
    }

    public final void pause() {
        this.zzaci.pause();
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzaci.setManualImpressionsEnabled(z);
    }

    public final void recordManualImpression() {
        this.zzaci.recordManualImpression();
    }

    public final void resume() {
        this.zzaci.resume();
    }

    public final void setAdListener(AdListener adListener) {
        this.zzaci.setAdListener(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zzaci.zza(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.zzaci.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzaci.setAppEventListener(appEventListener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzaci.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzaci.getMediationAdapterClassName();
    }

    public final boolean isLoading() {
        return this.zzaci.isLoading();
    }

    @Nullable
    public final ResponseInfo getResponseInfo() {
        return this.zzaci.getResponseInfo();
    }

    public final boolean zza(zzvx zzvx) {
        return this.zzaci.zza(zzvx);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzazh.zzc("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }
}
