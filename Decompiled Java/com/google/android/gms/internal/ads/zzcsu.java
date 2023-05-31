package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcsu implements zzdnu<zzbnf> {
    private final /* synthetic */ zzcsq zzggv;
    private final /* synthetic */ zzbxo zzggw;
    private final /* synthetic */ zzcss zzggx;

    zzcsu(zzcss zzcss, zzcsq zzcsq, zzbxo zzbxo) {
        this.zzggx = zzcss;
        this.zzggv = zzcsq;
        this.zzggw = zzbxo;
    }

    public final void zzb(Throwable th) {
        this.zzggw.zzady().onAdFailedToLoad(zzcid.zzd(th));
        zzdfc.zzc(th, "NativeAdLoader.onFailure");
        this.zzggv.zzaow();
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbnf zzbnf = (zzbnf) obj;
        synchronized (this.zzggx) {
            this.zzggv.onSuccess(zzbnf);
        }
    }
}
