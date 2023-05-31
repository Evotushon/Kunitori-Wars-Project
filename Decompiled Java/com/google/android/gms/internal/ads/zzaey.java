package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaey extends zzaeb {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzcxm;

    public zzaey(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.zzcxm = onCustomTemplateAdLoadedListener;
    }

    public final void zzb(zzadn zzadn) {
        this.zzcxm.onCustomTemplateAdLoaded(zzado.zza(zzadn));
    }
}
