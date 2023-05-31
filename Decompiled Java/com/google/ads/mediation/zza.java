package com.google.ads.mediation;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zza implements RewardedVideoAdListener {
    private final /* synthetic */ AbstractAdViewAdapter zzlr;

    zza(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzlr = abstractAdViewAdapter;
    }

    public final void onRewardedVideoAdLoaded() {
        this.zzlr.zzlx.onAdLoaded(this.zzlr);
    }

    public final void onRewardedVideoAdOpened() {
        this.zzlr.zzlx.onAdOpened(this.zzlr);
    }

    public final void onRewardedVideoStarted() {
        this.zzlr.zzlx.onVideoStarted(this.zzlr);
    }

    public final void onRewardedVideoAdClosed() {
        this.zzlr.zzlx.onAdClosed(this.zzlr);
        InterstitialAd unused = this.zzlr.zzlw = null;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.zzlr.zzlx.onRewarded(this.zzlr, rewardItem);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.zzlr.zzlx.onAdLeftApplication(this.zzlr);
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.zzlr.zzlx.onAdFailedToLoad(this.zzlr, i);
    }

    public final void onRewardedVideoCompleted() {
        this.zzlr.zzlx.onVideoCompleted(this.zzlr);
    }
}
