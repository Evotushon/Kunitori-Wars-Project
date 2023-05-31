package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzccz implements zzdnu<zzbdv> {
    private final /* synthetic */ String zzftn;
    private final /* synthetic */ zzafz zzfto;

    zzccz(zzccv zzccv, String str, zzafz zzafz) {
        this.zzftn = str;
        this.zzfto = zzafz;
    }

    public final void zzb(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbdv) obj).zza(this.zzftn, (zzafz<? super zzbdv>) this.zzfto);
    }
}
