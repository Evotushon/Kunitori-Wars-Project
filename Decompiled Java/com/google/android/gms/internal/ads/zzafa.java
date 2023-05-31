package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzafa implements Runnable {
    private final /* synthetic */ PublisherAdView zzcxo;
    private final /* synthetic */ zzvx zzcxp;
    private final /* synthetic */ zzafb zzcxq;

    zzafa(zzafb zzafb, PublisherAdView publisherAdView, zzvx zzvx) {
        this.zzcxq = zzafb;
        this.zzcxo = publisherAdView;
        this.zzcxp = zzvx;
    }

    public final void run() {
        if (this.zzcxo.zza(this.zzcxp)) {
            this.zzcxq.zzcxr.onPublisherAdViewLoaded(this.zzcxo);
        } else {
            zzazh.zzfa("Could not bind.");
        }
    }
}
