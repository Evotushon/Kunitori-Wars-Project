package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbho implements zzbkx {
    private zzbtl zzemy;
    private zzbpt zzemz;
    private zzdeq zzenb;
    private zzdcu zzenc;
    private zzdby zzend;
    private final /* synthetic */ zzbhf zzene;

    private zzbho(zzbhf zzbhf) {
        this.zzene = zzbhf;
    }

    /* renamed from: zzaeh */
    public final zzbku zzadi() {
        zzeep.zza(this.zzemy, zzbtl.class);
        zzeep.zza(this.zzemz, zzbpt.class);
        return new zzbhn(this.zzene, new zzbog(), new zzdfh(), new zzbph(), new zzchc(), this.zzemy, this.zzemz, new zzdfp(), this.zzenb, this.zzenc, this.zzend);
    }

    @Deprecated
    public final /* synthetic */ zzbkx zza(zzblf zzblf) {
        zzeep.checkNotNull(zzblf);
        return this;
    }

    public final /* synthetic */ zzbkx zzb(zzbpt zzbpt) {
        this.zzemz = (zzbpt) zzeep.checkNotNull(zzbpt);
        return this;
    }

    public final /* synthetic */ zzbkx zzb(zzbtl zzbtl) {
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
