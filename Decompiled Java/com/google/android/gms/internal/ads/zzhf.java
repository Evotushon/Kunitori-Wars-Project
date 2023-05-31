package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzhf {
    public static final zzhf zzagj = new zzhf(1.0f, 1.0f);
    public final float zzagk;
    public final float zzagl;
    private final int zzagm;

    public zzhf(float f, float f2) {
        this.zzagk = f;
        this.zzagl = f2;
        this.zzagm = Math.round(f * 1000.0f);
    }

    public final long zzdu(long j) {
        return j * ((long) this.zzagm);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzhf zzhf = (zzhf) obj;
            return this.zzagk == zzhf.zzagk && this.zzagl == zzhf.zzagl;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzagk) + 527) * 31) + Float.floatToRawIntBits(this.zzagl);
    }
}
