package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbhh implements zzbxr {
    private zzbtl zzemy;
    private zzbpt zzemz;
    private zzbxk zzena;
    private zzdeq zzenb;
    private zzdcu zzenc;
    private zzdby zzend;
    private final /* synthetic */ zzbhf zzene;

    private zzbhh(zzbhf zzbhf) {
        this.zzene = zzbhf;
    }

    /* renamed from: zzadh */
    public final zzbxo zzadi() {
        zzeep.zza(this.zzemy, zzbtl.class);
        zzeep.zza(this.zzemz, zzbpt.class);
        zzeep.zza(this.zzena, zzbxk.class);
        return new zzbhk(this.zzene, this.zzena, new zzbog(), new zzdfh(), new zzbph(), new zzchc(), this.zzemy, this.zzemz, new zzdfp(), this.zzenb, this.zzenc, this.zzend);
    }

    public final /* synthetic */ zzbxr zza(zzbxk zzbxk) {
        this.zzena = (zzbxk) zzeep.checkNotNull(zzbxk);
        return this;
    }

    public final /* synthetic */ zzbxr zza(zzbpt zzbpt) {
        this.zzemz = (zzbpt) zzeep.checkNotNull(zzbpt);
        return this;
    }

    public final /* synthetic */ zzbxr zza(zzbtl zzbtl) {
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
