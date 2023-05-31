package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zze;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcrm implements zze {
    private final /* synthetic */ zzbvw zzgfc;

    zzcrm(zzcrl zzcrl, zzbvw zzbvw) {
        this.zzgfc = zzbvw;
    }

    public final void zzg(View view) {
    }

    public final void zzjw() {
        this.zzgfc.zzadl().onAdClicked();
    }

    public final void zzjx() {
        this.zzgfc.zzadm().onAdImpression();
        this.zzgfc.zzadn().zzaix();
    }
}
