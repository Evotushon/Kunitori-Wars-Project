package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbla extends zzbnf {
    private final View view;
    @Nullable
    private final zzbdv zzdae;
    private final zzdeh zzffr;
    private final int zzffs;
    private final boolean zzfft;
    @Nullable
    private zzrm zzffx;

    zzbla(zzbne zzbne, View view2, @Nullable zzbdv zzbdv, zzdeh zzdeh, int i, boolean z) {
        super(zzbne);
        this.view = view2;
        this.zzdae = zzbdv;
        this.zzffr = zzdeh;
        this.zzffs = i;
        this.zzfft = z;
    }

    public final zzdeh zzagl() {
        return zzdex.zza(this.zzfhg.zzgpp, this.zzffr);
    }

    public final View zzagm() {
        return this.view;
    }

    public final int zzagf() {
        return this.zzffs;
    }

    public final boolean zzagg() {
        return this.zzfft;
    }

    public final boolean zzaay() {
        zzbdv zzbdv = this.zzdae;
        return (zzbdv == null || zzbdv.zzaaf() == null || !this.zzdae.zzaaf().zzaay()) ? false : true;
    }

    public final boolean zzagn() {
        zzbdv zzbdv = this.zzdae;
        return zzbdv != null && zzbdv.zzaah();
    }

    public final void zza(zzrb zzrb) {
        zzbdv zzbdv = this.zzdae;
        if (zzbdv != null) {
            zzbdv.zza(zzrb);
        }
    }

    public final void zza(zzrm zzrm) {
        this.zzffx = zzrm;
    }

    @Nullable
    public final zzrm zzago() {
        return this.zzffx;
    }
}
