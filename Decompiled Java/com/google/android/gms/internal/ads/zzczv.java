package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczv implements zzcye<zzczw> {
    List<String> zzdke;
    private zzdoe zzfrv;
    zzzj zzglv;

    public zzczv(zzzj zzzj, zzdoe zzdoe, List<String> list) {
        this.zzglv = zzzj;
        this.zzfrv = zzdoe;
        this.zzdke = list;
    }

    public final zzdof<zzczw> zzapb() {
        return this.zzfrv.zzd(new zzczy(this));
    }
}
