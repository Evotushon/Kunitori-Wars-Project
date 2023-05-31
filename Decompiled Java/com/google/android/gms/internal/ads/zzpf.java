package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzpf {
    private final zzdkp zzadx;
    /* access modifiers changed from: private */
    public final zzpg zzbjo;

    public zzpf(zzdkp zzdkp, zzpg zzpg) {
        this.zzadx = zzpg != null ? (zzdkp) zzob.checkNotNull(zzdkp) : null;
        this.zzbjo = zzpg;
    }

    public final void zza(zzis zzis) {
        if (this.zzbjo != null) {
            this.zzadx.post(new zzpi(this, zzis));
        }
    }

    public final void zza(String str, long j, long j2) {
        if (this.zzbjo != null) {
            this.zzadx.post(new zzph(this, str, j, j2));
        }
    }

    public final void zzb(zzgz zzgz) {
        if (this.zzbjo != null) {
            this.zzadx.post(new zzpk(this, zzgz));
        }
    }

    public final void zze(int i, long j) {
        if (this.zzbjo != null) {
            this.zzadx.post(new zzpj(this, i, j));
        }
    }

    public final void zza(int i, int i2, int i3, float f) {
        if (this.zzbjo != null) {
            this.zzadx.post(new zzpm(this, i, i2, i3, f));
        }
    }

    public final void zza(Surface surface) {
        if (this.zzbjo != null) {
            this.zzadx.post(new zzpl(this, surface));
        }
    }

    public final void zzb(zzis zzis) {
        if (this.zzbjo != null) {
            this.zzadx.post(new zzpn(this, zzis));
        }
    }
}
