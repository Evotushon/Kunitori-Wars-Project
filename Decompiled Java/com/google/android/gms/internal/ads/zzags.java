package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzags implements zzdng<zzagr, ParcelFileDescriptor> {
    private final /* synthetic */ zzagl zzczc;

    zzags(zzagt zzagt, zzagl zzagl) {
        this.zzczc = zzagl;
    }

    public final /* synthetic */ zzdof zzf(Object obj) throws Exception {
        zzazy zzazy = new zzazy();
        ((zzagr) obj).zza(this.zzczc, new zzagv(this, zzazy));
        return zzazy;
    }
}
