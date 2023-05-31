package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.instream.InstreamAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzahw extends zzahs {
    private final InstreamAd.InstreamAdLoadCallback zzczo;

    public zzahw(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        this.zzczo = instreamAdLoadCallback;
    }

    public final void zza(zzahn zzahn) {
        this.zzczo.onInstreamAdLoaded(new zzahu(zzahn));
    }

    public final void onInstreamAdFailedToLoad(int i) {
        this.zzczo.onInstreamAdFailedToLoad(i);
    }
}
