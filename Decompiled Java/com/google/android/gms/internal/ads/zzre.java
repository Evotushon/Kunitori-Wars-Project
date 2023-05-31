package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzre extends zzrk {
    private final WeakReference<AppOpenAd.AppOpenAdLoadCallback> zzbrf;

    public zzre(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzbrf = new WeakReference<>(appOpenAdLoadCallback);
    }

    public final void zza(zzrg zzrg) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = (AppOpenAd.AppOpenAdLoadCallback) this.zzbrf.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdLoaded(new zzrn(zzrg));
        }
    }

    public final void onAppOpenAdFailedToLoad(int i) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = (AppOpenAd.AppOpenAdLoadCallback) this.zzbrf.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(i);
        }
    }
}
