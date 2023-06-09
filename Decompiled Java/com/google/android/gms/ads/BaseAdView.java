package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zztz;
import com.google.android.gms.internal.ads.zzxt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
class BaseAdView extends ViewGroup {
    protected final zzxt zzabr;

    public BaseAdView(Context context, int i) {
        super(context);
        this.zzabr = new zzxt(this, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zzabr = new zzxt(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zzabr = new zzxt(this, attributeSet, false, i2);
    }

    public void destroy() {
        this.zzabr.destroy();
    }

    public AdListener getAdListener() {
        return this.zzabr.getAdListener();
    }

    public AdSize getAdSize() {
        return this.zzabr.getAdSize();
    }

    public String getAdUnitId() {
        return this.zzabr.getAdUnitId();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(AdRequest adRequest) {
        this.zzabr.zza(adRequest.zzdl());
    }

    public void pause() {
        this.zzabr.pause();
    }

    public void resume() {
        this.zzabr.resume();
    }

    public boolean isLoading() {
        return this.zzabr.isLoading();
    }

    public void setAdListener(AdListener adListener) {
        this.zzabr.setAdListener(adListener);
        if (adListener == null) {
            this.zzabr.zza((zztz) null);
            this.zzabr.setAppEventListener((AppEventListener) null);
            return;
        }
        if (adListener instanceof zztz) {
            this.zzabr.zza((zztz) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zzabr.setAppEventListener((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zzabr.setAdSizes(adSize);
    }

    public void setAdUnitId(String str) {
        this.zzabr.setAdUnitId(str);
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        return this.zzabr.getMediationAdapterClassName();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.zzabr.getResponseInfo();
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zzabr.setOnPaidEventListener(onPaidEventListener);
    }
}
