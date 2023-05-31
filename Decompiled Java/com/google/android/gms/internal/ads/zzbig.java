package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbig implements zzcsw {
    private zzbpt zzemz;
    private final /* synthetic */ zzbhf zzene;
    private zzcta zzfcq;

    private zzbig(zzbhf zzbhf) {
        this.zzene = zzbhf;
    }

    public final zzcsx zzafi() {
        zzeep.zza(this.zzemz, zzbpt.class);
        zzeep.zza(this.zzfcq, zzcta.class);
        return new zzbif(this.zzene, this.zzfcq, new zzbog(), new zzchc(), this.zzemz, new zzdfp(), (zzdcu) null, (zzdby) null, (zzbhi) null);
    }

    @Deprecated
    public final /* synthetic */ zzcsw zzf(zzbtl zzbtl) {
        zzeep.checkNotNull(zzbtl);
        return this;
    }

    public final /* synthetic */ zzcsw zza(zzcta zzcta) {
        this.zzfcq = (zzcta) zzeep.checkNotNull(zzcta);
        return this;
    }

    public final /* synthetic */ zzcsw zzf(zzbpt zzbpt) {
        this.zzemz = (zzbpt) zzeep.checkNotNull(zzbpt);
        return this;
    }
}
