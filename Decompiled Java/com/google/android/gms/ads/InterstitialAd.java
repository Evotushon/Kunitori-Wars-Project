package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zztz;
import com.google.android.gms.internal.ads.zzxv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class InterstitialAd {
    private final zzxv zzabs;

    public InterstitialAd(Context context) {
        this.zzabs = new zzxv(context);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzabs.getAdListener();
    }

    public final String getAdUnitId() {
        return this.zzabs.getAdUnitId();
    }

    public final boolean isLoaded() {
        return this.zzabs.isLoaded();
    }

    public final boolean isLoading() {
        return this.zzabs.isLoading();
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(AdRequest adRequest) {
        this.zzabs.zza(adRequest.zzdl());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzabs.setAdListener(adListener);
        if (adListener != null && (adListener instanceof zztz)) {
            this.zzabs.zza((zztz) adListener);
        } else if (adListener == null) {
            this.zzabs.zza((zztz) null);
        }
    }

    public final void setAdUnitId(String str) {
        this.zzabs.setAdUnitId(str);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzabs.getMediationAdapterClassName();
    }

    public final void show() {
        this.zzabs.show();
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzabs.setRewardedVideoAdListener(rewardedVideoAdListener);
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        this.zzabs.setAdMetadataListener(adMetadataListener);
    }

    public final Bundle getAdMetadata() {
        return this.zzabs.getAdMetadata();
    }

    public final void zzd(boolean z) {
        this.zzabs.zzd(true);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzabs.setImmersiveMode(z);
    }

    @Nullable
    public final ResponseInfo getResponseInfo() {
        return this.zzabs.getResponseInfo();
    }

    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zzabs.setOnPaidEventListener(onPaidEventListener);
    }
}
