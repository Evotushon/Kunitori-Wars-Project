package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcqe implements zzbxb {
    private final zzcmd zzgbo;

    zzcqe(zzcmd zzcmd) {
        this.zzgbo = zzcmd;
    }

    public final void zza(boolean z, Context context) {
        zzcmd zzcmd = this.zzgbo;
        try {
            ((zzdfb) zzcmd.zzdel).setImmersiveMode(z);
            ((zzdfb) zzcmd.zzdel).showVideo();
        } catch (zzdfa e) {
            zzawf.zzd("Cannot show rewarded video.", e);
        }
    }
}
