package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcbl implements zzdng {
    private final zzdof zzfsq;

    zzcbl(zzdof zzdof) {
        this.zzfsq = zzdof;
    }

    public final zzdof zzf(Object obj) {
        zzdof zzdof = this.zzfsq;
        if (obj != null) {
            return zzdof;
        }
        return zzdnt.immediateFailedFuture(new zzcpe("Retrieve required value in native ad response failed.", 0));
    }
}
