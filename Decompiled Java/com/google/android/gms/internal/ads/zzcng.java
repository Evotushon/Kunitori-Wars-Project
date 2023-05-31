package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcng implements zzdnu<zzblg> {
    private final /* synthetic */ zzcnf zzgca;

    zzcng(zzcnf zzcnf) {
        this.zzgca = zzcnf;
    }

    public final void zzb(Throwable th) {
        this.zzgca.zzflh.onAdFailedToLoad(zzcid.zzd(th));
        zzdfc.zzc(th, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzblg) obj).zzags();
    }
}
