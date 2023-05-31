package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzday implements zzdnu<zzbla> {
    private final /* synthetic */ zzcsq zzggv;
    private final /* synthetic */ zzdax zzgmi;
    private final /* synthetic */ zzdat zzgmj;

    zzday(zzdat zzdat, zzcsq zzcsq, zzdax zzdax) {
        this.zzgmj = zzdat;
        this.zzggv = zzcsq;
        this.zzgmi = zzdax;
    }

    public final void zzb(Throwable th) {
        synchronized (this.zzgmj) {
            zzdof unused = this.zzgmj.zzgga = null;
            zzbku zzbku = (zzbku) this.zzgmj.zzgmg.zzaqj();
            if (zzbku != null) {
                zzbku.zzady().onAdFailedToLoad(zzcid.zzd(th));
            } else {
                this.zzgmj.zzb((zzdcn) this.zzgmi).zzaeh().zzadx().zzahr().zzaig();
            }
            zzdfc.zzc(th, "AppOpenAdLoader.onFailure");
            this.zzggv.zzaow();
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbla zzbla = (zzbla) obj;
        synchronized (this.zzgmj) {
            zzdof unused = this.zzgmj.zzgga = null;
            this.zzggv.onSuccess(zzbla);
        }
    }
}
