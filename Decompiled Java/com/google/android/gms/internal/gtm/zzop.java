package com.google.android.gms.internal.gtm;

import java.io.IOException;

public final class zzop extends zzuq<zzop> {
    public long zzaux = 0;
    public zzk zzauy = null;
    public zzi zzqk = null;

    public zzop() {
        this.zzbhb = null;
        this.zzbhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzop)) {
            return false;
        }
        zzop zzop = (zzop) obj;
        if (this.zzaux != zzop.zzaux) {
            return false;
        }
        zzi zzi = this.zzqk;
        if (zzi == null) {
            if (zzop.zzqk != null) {
                return false;
            }
        } else if (!zzi.equals(zzop.zzqk)) {
            return false;
        }
        zzk zzk = this.zzauy;
        if (zzk == null) {
            if (zzop.zzauy != null) {
                return false;
            }
        } else if (!zzk.equals(zzop.zzauy)) {
            return false;
        }
        if (this.zzbhb == null || this.zzbhb.isEmpty()) {
            return zzop.zzbhb == null || zzop.zzbhb.isEmpty();
        }
        return this.zzbhb.equals(zzop.zzbhb);
    }

    public final int hashCode() {
        int i;
        int i2;
        long j = this.zzaux;
        zzi zzi = this.zzqk;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i3 = 0;
        if (zzi == null) {
            i = 0;
        } else {
            i = zzi.hashCode();
        }
        int i4 = hashCode + i;
        zzk zzk = this.zzauy;
        int i5 = i4 * 31;
        if (zzk == null) {
            i2 = 0;
        } else {
            i2 = zzk.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        if (this.zzbhb != null && !this.zzbhb.isEmpty()) {
            i3 = this.zzbhb.hashCode();
        }
        return i6 + i3;
    }

    public final void zza(zzuo zzuo) throws IOException {
        zzuo.zzi(1, this.zzaux);
        zzi zzi = this.zzqk;
        if (zzi != null) {
            zzuo.zza(2, (zzuw) zzi);
        }
        zzk zzk = this.zzauy;
        if (zzk != null) {
            zzuo.zza(3, (zzuw) zzk);
        }
        super.zza(zzuo);
    }

    /* access modifiers changed from: protected */
    public final int zzy() {
        int zzy = super.zzy() + zzuo.zzd(1, this.zzaux);
        zzi zzi = this.zzqk;
        if (zzi != null) {
            zzy += zzuo.zzb(2, (zzuw) zzi);
        }
        zzk zzk = this.zzauy;
        return zzk != null ? zzy + zzuo.zzb(3, (zzuw) zzk) : zzy;
    }

    public final /* synthetic */ zzuw zza(zzun zzun) throws IOException {
        while (true) {
            int zzni = zzun.zzni();
            if (zzni == 0) {
                return this;
            }
            if (zzni == 8) {
                this.zzaux = zzun.zzob();
            } else if (zzni == 18) {
                if (this.zzqk == null) {
                    this.zzqk = new zzi();
                }
                zzun.zza((zzuw) this.zzqk);
            } else if (zzni == 26) {
                if (this.zzauy == null) {
                    this.zzauy = new zzk();
                }
                zzun.zza((zzuw) this.zzauy);
            } else if (!super.zza(zzun, zzni)) {
                return this;
            }
        }
    }
}
