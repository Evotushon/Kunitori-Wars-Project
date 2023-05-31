package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgg implements zzbqm, zzbrn, zzbsn {
    private final zzcgq zzfvp;
    private final zzcgx zzfvq;

    public zzcgg(zzcgq zzcgq, zzcgx zzcgx) {
        this.zzfvp = zzcgq;
        this.zzfvq = zzcgx;
    }

    public final void onAdLoaded() {
        this.zzfvq.zzm(this.zzfvp.zzqv());
    }

    public final void onAdFailedToLoad(int i) {
        this.zzfvq.zzm(this.zzfvp.zzqv());
    }

    public final void zzd(zzaqx zzaqx) {
        this.zzfvp.zzi(zzaqx.zzdmz);
    }

    public final void zzb(zzdeq zzdeq) {
        this.zzfvp.zzc(zzdeq);
    }
}
