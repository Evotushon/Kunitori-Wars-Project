package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbop implements zzbqh, zzbqu, zzbrn, zzbsn, zztz {
    private final Clock zzbmz;
    private final zzavq zzfjd;

    public zzbop(Clock clock, zzavq zzavq) {
        this.zzbmz = clock;
        this.zzfjd = zzavq;
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdOpened() {
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }

    public final void zzb(zzarr zzarr, String str, String str2) {
    }

    public final void zzd(zzaqx zzaqx) {
    }

    public final void onAdClicked() {
        this.zzfjd.zzvb();
    }

    public final void onAdLoaded() {
        this.zzfjd.zzan(true);
    }

    public final void onAdImpression() {
        this.zzfjd.zzva();
    }

    public final void zzf(zzuh zzuh) {
        this.zzfjd.zze(zzuh);
    }

    public final void zzb(zzdeq zzdeq) {
        this.zzfjd.zzey(this.zzbmz.elapsedRealtime());
    }

    public final void onAdClosed() {
        this.zzfjd.zzvc();
    }

    public final String zzvd() {
        return this.zzfjd.zzvd();
    }
}
