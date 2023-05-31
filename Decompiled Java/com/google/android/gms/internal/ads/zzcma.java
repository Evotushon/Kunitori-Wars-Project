package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcma {
    private zzbqp zzfmi;
    private zzdei zzfmj;

    public zzcma(zzdei zzdei) {
        this.zzfmj = zzdei;
    }

    public final void zzaoc() {
        if (this.zzfmi != null && this.zzfmj.zzgqb == 2) {
            this.zzfmi.onAdImpression();
        }
    }

    public final void zza(zzbqp zzbqp) {
        this.zzfmi = zzbqp;
    }
}
