package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaav extends zzaat {
    private final OnCustomRenderedAdLoadedListener zzcfg;

    public zzaav(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcfg = onCustomRenderedAdLoadedListener;
    }

    public final void zza(zzaap zzaap) {
        this.zzcfg.onCustomRenderedAdLoaded(new zzaam(zzaap));
    }
}
