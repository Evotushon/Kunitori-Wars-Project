package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaoj implements zzp {
    private final /* synthetic */ zzaog zzdgc;

    zzaoj(zzaog zzaog) {
        this.zzdgc = zzaog;
    }

    public final void zztj() {
        zzazh.zzeb("AdMobCustomTabsAdapter overlay is closed.");
        this.zzdgc.zzdga.onAdClosed(this.zzdgc);
    }

    public final void onPause() {
        zzazh.zzeb("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        zzazh.zzeb("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zztk() {
        zzazh.zzeb("Opening AdMobCustomTabsAdapter overlay.");
        this.zzdgc.zzdga.onAdOpened(this.zzdgc);
    }
}
