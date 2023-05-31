package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbhy implements zzbws {
    private zzbtl zzemy;
    private zzbpt zzemz;
    private zzdeq zzenb;
    private zzdcu zzenc;
    private zzdby zzend;
    private final /* synthetic */ zzbhf zzene;
    private zzcrh zzeyi;

    private zzbhy(zzbhf zzbhf) {
        this.zzene = zzbhf;
    }

    /* renamed from: zzaev */
    public final zzbwt zzadi() {
        zzeep.zza(this.zzemy, zzbtl.class);
        zzeep.zza(this.zzemz, zzbpt.class);
        zzeep.zza(this.zzeyi, zzcrh.class);
        return new zzbhx(this.zzene, new zzbog(), new zzdfh(), new zzbph(), new zzchc(), this.zzemy, this.zzemz, new zzdfp(), this.zzeyi, this.zzenb, this.zzenc, this.zzend);
    }

    public final /* synthetic */ zzbws zzb(zzcrh zzcrh) {
        this.zzeyi = (zzcrh) zzeep.checkNotNull(zzcrh);
        return this;
    }

    public final /* synthetic */ zzbws zzd(zzbpt zzbpt) {
        this.zzemz = (zzbpt) zzeep.checkNotNull(zzbpt);
        return this;
    }

    public final /* synthetic */ zzbws zzd(zzbtl zzbtl) {
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
