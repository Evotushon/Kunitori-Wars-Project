package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzkk implements zzkf {
    private final zzom zzavd;
    private final int zzavm = this.zzavd.zzjc();
    private final int zzavp = (this.zzavd.zzjc() & 255);
    private int zzavq;
    private int zzavr;

    public zzkk(zzke zzke) {
        this.zzavd = zzke.zzavd;
        this.zzavd.zzbh(12);
    }

    public final boolean zzgw() {
        return false;
    }

    public final int zzgu() {
        return this.zzavm;
    }

    public final int zzgv() {
        int i = this.zzavp;
        if (i == 8) {
            return this.zzavd.readUnsignedByte();
        }
        if (i == 16) {
            return this.zzavd.readUnsignedShort();
        }
        int i2 = this.zzavq;
        this.zzavq = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zzavr & 15;
        }
        this.zzavr = this.zzavd.readUnsignedByte();
        return (this.zzavr & 240) >> 4;
    }
}
