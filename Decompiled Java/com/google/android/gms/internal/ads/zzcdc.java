package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcdc implements zzv {
    private final zzbrc zzftr;

    private zzcdc(zzbrc zzbrc) {
        this.zzftr = zzbrc;
    }

    static zzv zza(zzbrc zzbrc) {
        return new zzcdc(zzbrc);
    }

    public final void zzub() {
        this.zzftr.onAdLeftApplication();
    }
}
