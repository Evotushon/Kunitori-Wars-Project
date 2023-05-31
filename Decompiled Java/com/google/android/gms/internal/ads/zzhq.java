package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzhq {
    private final zzdkp zzadx;
    /* access modifiers changed from: private */
    public final zzhr zzahm;

    public zzhq(zzdkp zzdkp, zzhr zzhr) {
        this.zzadx = zzhr != null ? (zzdkp) zzob.checkNotNull(zzdkp) : null;
        this.zzahm = zzhr;
    }

    public final void zza(zzis zzis) {
        if (this.zzahm != null) {
            this.zzadx.post(new zzht(this, zzis));
        }
    }

    public final void zza(String str, long j, long j2) {
        if (this.zzahm != null) {
            this.zzadx.post(new zzhs(this, str, j, j2));
        }
    }

    public final void zzb(zzgz zzgz) {
        if (this.zzahm != null) {
            this.zzadx.post(new zzhv(this, zzgz));
        }
    }

    public final void zza(int i, long j, long j2) {
        if (this.zzahm != null) {
            this.zzadx.post(new zzhu(this, i, j, j2));
        }
    }

    public final void zzb(zzis zzis) {
        if (this.zzahm != null) {
            this.zzadx.post(new zzhx(this, zzis));
        }
    }

    public final void zzr(int i) {
        if (this.zzahm != null) {
            this.zzadx.post(new zzhw(this, i));
        }
    }
}
