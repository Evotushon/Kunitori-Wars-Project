package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdgt implements zzdnu<zzdgk<AdT>> {
    private final /* synthetic */ zzdgs zzgtz;

    zzdgt(zzdgs zzdgs) {
        this.zzgtz = zzdgs;
    }

    public final void zzb(Throwable th) {
        this.zzgtz.zzgtw.zzb(th);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdgk zzdgk = (zzdgk) obj;
        synchronized (this.zzgtz) {
            this.zzgtz.zzgtw.zza(zzdgk);
            if (this.zzgtz.zzgtv != zzdgi.zzgth) {
                this.zzgtz.zzgnx.zza(this.zzgtz.zzgtt.zzaql(), zzdgk);
            }
            if (this.zzgtz.zzgtv == zzdgi.zzgtg) {
                this.zzgtz.zzd(this.zzgtz.zzgtt);
            }
            int unused = this.zzgtz.zzgtv = zzdgi.zzgtg;
        }
    }
}
