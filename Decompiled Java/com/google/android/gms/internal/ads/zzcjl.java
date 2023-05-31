package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcjl extends zzaqu {
    private final /* synthetic */ zzcji zzfym;

    protected zzcjl(zzcji zzcji) {
        this.zzfym = zzcji;
    }

    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzfym.zzdcg.set(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    public final void zza(zzaxp zzaxp) {
        this.zzfym.zzdcg.setException(new zzaxs(zzaxp.zzdux, zzaxp.errorCode));
    }
}
