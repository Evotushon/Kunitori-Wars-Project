package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbcv extends zzawb {
    final zzbbm zzdza;
    private final String zzdzm;
    private final String[] zzdzn;
    final zzbda zzeee;

    zzbcv(zzbbm zzbbm, zzbda zzbda, String str, String[] strArr) {
        this.zzdza = zzbbm;
        this.zzeee = zzbda;
        this.zzdzm = str;
        this.zzdzn = strArr;
        zzq.zzlr().zza(this);
    }

    public final void zztz() {
        try {
            this.zzeee.zze(this.zzdzm, this.zzdzn);
        } finally {
            zzawo.zzdtx.post(new zzbcy(this));
        }
    }
}
