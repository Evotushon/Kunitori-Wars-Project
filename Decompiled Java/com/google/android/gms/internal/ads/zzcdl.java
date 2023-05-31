package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcdl implements zzagj {
    private final zzbrc zzfil;
    @Nullable
    private final zzasq zzftz;
    private final String zzfua;
    private final String zzfub;

    public zzcdl(zzbrc zzbrc, zzdei zzdei) {
        this.zzfil = zzbrc;
        this.zzftz = zzdei.zzdmd;
        this.zzfua = zzdei.zzddf;
        this.zzfub = zzdei.zzddg;
    }

    public final void zzrx() {
        this.zzfil.onRewardedVideoStarted();
    }

    @ParametersAreNonnullByDefault
    public final void zza(zzasq zzasq) {
        int i;
        String str;
        zzasq zzasq2 = this.zzftz;
        if (zzasq2 != null) {
            zzasq = zzasq2;
        }
        if (zzasq != null) {
            str = zzasq.type;
            i = zzasq.zzdot;
        } else {
            str = "";
            i = 1;
        }
        this.zzfil.zzb(new zzarp(str, i), this.zzfua, this.zzfub);
    }

    public final void zzry() {
        this.zzfil.onRewardedVideoCompleted();
    }
}
