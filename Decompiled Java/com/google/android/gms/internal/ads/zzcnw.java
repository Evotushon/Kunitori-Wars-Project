package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcnw implements zzbxb {
    private final zzcmd zzgbo;

    zzcnw(zzcmd zzcmd) {
        this.zzgbo = zzcmd;
    }

    public final void zza(boolean z, Context context) {
        zzcmd zzcmd = this.zzgbo;
        try {
            ((zzdfb) zzcmd.zzdel).setImmersiveMode(z);
            ((zzdfb) zzcmd.zzdel).showInterstitial();
        } catch (zzdfa unused) {
            zzawf.zzez("Cannot show interstitial.");
        }
    }
}
