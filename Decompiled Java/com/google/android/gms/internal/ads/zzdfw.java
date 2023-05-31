package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfw {
    private zzdfv zzgrl = null;
    private zzdfv zzgrm = null;
    private zzdfv zzgrn = null;
    private zzdfv zzgro = null;
    private zzdfv zzgrp = null;
    private zzdfv zzgrq = null;
    private zzdfv zzgrr = null;
    private zzdfv zzgrs = null;

    public final void zza(zzdfv zzdfv) {
        this.zzgro = zzdfv;
    }

    public final void onAdClosed() {
        zzdfv zzdfv = this.zzgro;
        if (zzdfv != null) {
            zzdfv.execute();
        }
    }
}
