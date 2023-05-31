package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcsl implements zzdnu<zzbvu> {
    private final /* synthetic */ zzbwt zzggk;
    private final /* synthetic */ zzcsi zzggl;

    zzcsl(zzcsi zzcsi, zzbwt zzbwt) {
        this.zzggl = zzcsi;
        this.zzggk = zzbwt;
    }

    public final void zzb(Throwable th) {
        synchronized (this.zzggl) {
            zzdof unused = this.zzggl.zzgga = null;
            this.zzggk.zzady().onAdFailedToLoad(zzcid.zzd(th));
            zzdfc.zzc(th, "InterstitialAdManagerShim.onFailure");
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbvu zzbvu = (zzbvu) obj;
        synchronized (this.zzggl) {
            zzdof unused = this.zzggl.zzgga = null;
            zzbvu unused2 = this.zzggl.zzggg = zzbvu;
            zzbvu.zzags();
        }
    }
}
