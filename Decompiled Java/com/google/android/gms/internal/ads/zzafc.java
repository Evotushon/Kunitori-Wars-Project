package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzafc extends zzaep {
    private final UnifiedNativeAd.UnconfirmedClickListener zzcxs;

    public zzafc(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zzcxs = unconfirmedClickListener;
    }

    public final void onUnconfirmedClickReceived(String str) {
        this.zzcxs.onUnconfirmedClickReceived(str);
    }

    public final void onUnconfirmedClickCancelled() {
        this.zzcxs.onUnconfirmedClickCancelled();
    }
}
