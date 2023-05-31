package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbnt implements zzdnu<zzbnl> {
    private final /* synthetic */ zzdnu zzfih;
    private final /* synthetic */ zzbnm zzfii;

    zzbnt(zzbnm zzbnm, zzdnu zzdnu) {
        this.zzfii = zzbnm;
        this.zzfih = zzdnu;
    }

    public final void zzb(Throwable th) {
        this.zzfih.zzb(th);
        this.zzfii.zzahk();
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzfii.zza(((zzbnl) obj).zzfia, this.zzfih);
    }
}
