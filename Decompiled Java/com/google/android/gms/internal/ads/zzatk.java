package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzatk extends zzasx {
    private final RewardedAdCallback zzdpf;

    public zzatk(RewardedAdCallback rewardedAdCallback) {
        this.zzdpf = rewardedAdCallback;
    }

    public final void onRewardedAdOpened() {
        RewardedAdCallback rewardedAdCallback = this.zzdpf;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }

    public final void onRewardedAdClosed() {
        RewardedAdCallback rewardedAdCallback = this.zzdpf;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }

    public final void zza(zzass zzass) {
        RewardedAdCallback rewardedAdCallback = this.zzdpf;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzath(zzass));
        }
    }

    public final void onRewardedAdFailedToShow(int i) {
        RewardedAdCallback rewardedAdCallback = this.zzdpf;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i);
        }
    }
}
