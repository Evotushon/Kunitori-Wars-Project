package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbib implements zzcdt {
    private zzbtl zzemy;
    private zzbpt zzemz;
    private zzdeq zzenb;
    private zzdcu zzenc;
    private zzdby zzend;
    private final /* synthetic */ zzbhf zzene;

    private zzbib(zzbhf zzbhf) {
        this.zzene = zzbhf;
    }

    /* renamed from: zzafa */
    public final zzcdq zzadi() {
        zzeep.zza(this.zzemy, zzbtl.class);
        zzeep.zza(this.zzemz, zzbpt.class);
        return new zzbie(this.zzene, new zzbog(), new zzdfh(), new zzbph(), new zzchc(), this.zzemy, this.zzemz, new zzdfp(), this.zzenb, this.zzenc, this.zzend);
    }

    public final /* synthetic */ zzcdt zze(zzbpt zzbpt) {
        this.zzemz = (zzbpt) zzeep.checkNotNull(zzbpt);
        return this;
    }

    public final /* synthetic */ zzcdt zze(zzbtl zzbtl) {
        this.zzemy = (zzbtl) zzeep.checkNotNull(zzbtl);
        return this;
    }

    public final /* synthetic */ zzbpq zza(zzdby zzdby) {
        this.zzend = zzdby;
        return this;
    }

    public final /* synthetic */ zzbpq zza(zzdcu zzdcu) {
        this.zzenc = zzdcu;
        return this;
    }

    public final /* synthetic */ zzbpq zza(zzdeq zzdeq) {
        this.zzenb = zzdeq;
        return this;
    }
}
