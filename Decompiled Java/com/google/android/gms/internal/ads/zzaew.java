package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaew extends zzadv {
    private final NativeContentAd.OnContentAdLoadedListener zzcxk;

    public zzaew(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzcxk = onContentAdLoadedListener;
    }

    public final void zza(zzadj zzadj) {
        this.zzcxk.onContentAdLoaded(new zzadk(zzadj));
    }
}
