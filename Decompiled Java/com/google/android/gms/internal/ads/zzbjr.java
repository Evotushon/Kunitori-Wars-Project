package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjr implements zzbqm {
    private final zzdeq zzfdp;
    private final zzdis zzfdr;
    private final zzdek zzfdv;

    public zzbjr(zzdeq zzdeq, zzdis zzdis) {
        this.zzfdp = zzdeq;
        this.zzfdr = zzdis;
        this.zzfdv = zzdeq.zzgqm.zzgqj;
    }

    public final void onAdFailedToLoad(int i) {
        this.zzfdr.zza(this.zzfdp, (zzdei) null, this.zzfdv.zzdds);
    }
}
