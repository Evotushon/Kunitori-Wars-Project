package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzati;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class RewardedAd {
    private final zzati zzgwl;

    public RewardedAd(Context context, String str) {
        Preconditions.checkNotNull(context, "context cannot be null");
        Preconditions.checkNotNull(str, "adUnitID cannot be null");
        this.zzgwl = new zzati(context, str);
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzgwl.zza(adRequest.zzdl(), rewardedAdLoadCallback);
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(PublisherAdRequest publisherAdRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzgwl.zza(publisherAdRequest.zzdl(), rewardedAdLoadCallback);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzgwl.getMediationAdapterClassName();
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.zzgwl.setServerSideVerificationOptions(serverSideVerificationOptions);
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzgwl.setOnAdMetadataChangedListener(onAdMetadataChangedListener);
    }

    public final Bundle getAdMetadata() {
        return this.zzgwl.getAdMetadata();
    }

    public final boolean isLoaded() {
        return this.zzgwl.isLoaded();
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback) {
        this.zzgwl.show(activity, rewardedAdCallback);
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        this.zzgwl.show(activity, rewardedAdCallback, z);
    }

    @Nullable
    public final RewardItem getRewardItem() {
        return this.zzgwl.getRewardItem();
    }

    @Nullable
    public final ResponseInfo getResponseInfo() {
        return this.zzgwl.getResponseInfo();
    }

    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zzgwl.setOnPaidEventListener(onPaidEventListener);
    }
}
