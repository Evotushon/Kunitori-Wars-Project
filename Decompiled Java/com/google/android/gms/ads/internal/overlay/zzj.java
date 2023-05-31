package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzawb;
import com.google.android.gms.internal.ads.zzawo;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzj extends zzawb {
    final /* synthetic */ zze zzdio;

    private zzj(zze zze) {
        this.zzdio = zze;
    }

    public final void zztz() {
        Bitmap zza = zzq.zzlo().zza(Integer.valueOf(this.zzdio.zzdhv.zzdja.zzbll));
        if (zza != null) {
            zzawo.zzdtx.post(new zzm(this, zzq.zzkx().zza(this.zzdio.zzzo, zza, this.zzdio.zzdhv.zzdja.zzblj, this.zzdio.zzdhv.zzdja.zzblk)));
        }
    }
}
