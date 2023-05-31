package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzddr implements zzdnu<zzcdn> {
    private final /* synthetic */ zzcsq zzggv;
    private final /* synthetic */ zzddu zzgov;
    private final /* synthetic */ zzddq zzgow;

    zzddr(zzddq zzddq, zzcsq zzcsq, zzddu zzddu) {
        this.zzgow = zzddq;
        this.zzggv = zzcsq;
        this.zzgov = zzddu;
    }

    public final void zzb(Throwable th) {
        synchronized (this.zzgow) {
            zzcdq zzcdq = (zzcdq) this.zzgow.zzgmg.zzaqj();
            if (zzcdq != null) {
                zzcdq.zzady().onAdFailedToLoad(zzcid.zzd(th));
            } else {
                this.zzgow.zze(this.zzgov).zzafa().zzadx().zzahr().zzaig();
            }
            zzdfc.zzc(th, "RewardedAdLoader.onFailure");
            this.zzggv.zzaow();
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzcdn zzcdn = (zzcdn) obj;
        synchronized (this.zzgow) {
            this.zzggv.onSuccess(zzcdn);
            this.zzgow.zzgot.onAdMetadataChanged();
        }
    }
}
