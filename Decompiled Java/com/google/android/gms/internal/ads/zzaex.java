package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaex extends zzadq {
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzcxl;

    public zzaex(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzcxl = onAppInstallAdLoadedListener;
    }

    public final void zza(zzadf zzadf) {
        this.zzcxl.onAppInstallAdLoaded(new zzadg(zzadf));
    }
}
