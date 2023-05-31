package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaez extends zzadw {
    private final NativeCustomTemplateAd.OnCustomClickListener zzcxn;

    public zzaez(NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zzcxn = onCustomClickListener;
    }

    public final void zza(zzadn zzadn, String str) {
        this.zzcxn.onCustomClick(zzado.zza(zzadn), str);
    }
}
