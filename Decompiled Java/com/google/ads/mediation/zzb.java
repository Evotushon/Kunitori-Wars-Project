package com.google.ads.mediation;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzb extends AdMetadataListener {
    private final /* synthetic */ AbstractAdViewAdapter zzlr;

    zzb(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzlr = abstractAdViewAdapter;
    }

    public final void onAdMetadataChanged() {
        if (this.zzlr.zzlw != null && this.zzlr.zzlx != null) {
            this.zzlr.zzlx.zzb(this.zzlr.zzlw.getAdMetadata());
        }
    }
}
