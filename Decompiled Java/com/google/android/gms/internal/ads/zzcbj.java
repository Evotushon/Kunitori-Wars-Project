package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcbj implements zzdng {
    private final zzdof zzfsq;

    zzcbj(zzdof zzdof) {
        this.zzfsq = zzdof;
    }

    public final zzdof zzf(Object obj) {
        zzdof zzdof = this.zzfsq;
        zzbdv zzbdv = (zzbdv) obj;
        if (zzbdv != null && zzbdv.zzyq() != null) {
            return zzdof;
        }
        throw new zzcpe("Retrieve video view in instream ad response failed.", 0);
    }
}
