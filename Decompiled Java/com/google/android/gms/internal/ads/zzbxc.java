package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxc implements zzbqh {
    private final zzbqp zzfmi;
    private final zzdei zzfmj;

    public zzbxc(zzbqp zzbqp, zzdei zzdei) {
        this.zzfmi = zzbqp;
        this.zzfmj = zzdei;
    }

    public final void onAdClosed() {
    }

    public final void onAdLeftApplication() {
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }

    public final void zzb(zzarr zzarr, String str, String str2) {
    }

    public final void onAdOpened() {
        if (this.zzfmj.zzgqb == 0 || this.zzfmj.zzgqb == 1) {
            this.zzfmi.onAdImpression();
        }
    }
}
