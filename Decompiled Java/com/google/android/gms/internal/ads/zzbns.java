package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbns implements zzdnu<zzbnf> {
    private final /* synthetic */ zzdnu zzfih;
    private final /* synthetic */ zzbnm zzfii;

    zzbns(zzbnm zzbnm, zzdnu zzdnu) {
        this.zzfii = zzbnm;
        this.zzfih = zzdnu;
    }

    public final void zzb(Throwable th) {
        this.zzfii.zzahk();
        this.zzfih.zzb(th);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzfii.zzahk();
        this.zzfih.onSuccess((zzbnf) obj);
    }
}
