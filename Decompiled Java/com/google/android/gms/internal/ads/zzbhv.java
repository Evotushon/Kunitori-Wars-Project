package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbhv {
    private zzbgn zzelf;
    private zzbih zzfab;
    private zzdiq zzfac;
    private zzbio zzfad;
    private zzdff zzfae;

    private zzbhv() {
    }

    public final zzbhv zzc(zzbgn zzbgn) {
        this.zzelf = (zzbgn) zzeep.checkNotNull(zzbgn);
        return this;
    }

    public final zzbhv zza(zzbih zzbih) {
        this.zzfab = (zzbih) zzeep.checkNotNull(zzbih);
        return this;
    }

    public final zzbgk zzaet() {
        zzeep.zza(this.zzelf, zzbgn.class);
        zzeep.zza(this.zzfab, zzbih.class);
        if (this.zzfac == null) {
            this.zzfac = new zzdiq();
        }
        if (this.zzfad == null) {
            this.zzfad = new zzbio();
        }
        if (this.zzfae == null) {
            this.zzfae = new zzdff();
        }
        return new zzbhf(this.zzelf, this.zzfab, this.zzfac, this.zzfad, this.zzfae);
    }
}
