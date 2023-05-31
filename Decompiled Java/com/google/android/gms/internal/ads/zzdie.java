package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdie implements zzdnu<O> {
    private final /* synthetic */ zzdhs zzgvc;
    private final /* synthetic */ zzdhx zzgvd;

    zzdie(zzdhx zzdhx, zzdhs zzdhs) {
        this.zzgvd = zzdhx;
        this.zzgvc = zzdhs;
    }

    public final void onSuccess(O o) {
        this.zzgvd.zzguv.zzguq.zzc(this.zzgvc);
    }

    public final void zzb(Throwable th) {
        this.zzgvd.zzguv.zzguq.zza(this.zzgvc, th);
    }
}
