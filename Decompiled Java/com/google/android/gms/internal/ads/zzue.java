package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzue extends zzwd {
    private final AdMetadataListener zzccl;

    public zzue(AdMetadataListener adMetadataListener) {
        this.zzccl = adMetadataListener;
    }

    public final void onAdMetadataChanged() {
        AdMetadataListener adMetadataListener = this.zzccl;
        if (adMetadataListener != null) {
            adMetadataListener.onAdMetadataChanged();
        }
    }
}
