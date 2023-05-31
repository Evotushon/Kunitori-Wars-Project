package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeee {
    public static final zzeee zzigb = new zzeee(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzeee zzigc = new zzeee(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzeee zzigd = new zzeee(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzeee zzige = new zzeee(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double w;
    private final double zzifx;
    private final double zzify;
    private final double zzifz;
    private final double zziga;

    private zzeee(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.zzifx = d6;
        this.zzify = d7;
        this.w = d8;
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.zzifz = d9;
        this.zziga = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzeee zzeee = (zzeee) obj;
        return Double.compare(zzeee.a, this.a) == 0 && Double.compare(zzeee.b, this.b) == 0 && Double.compare(zzeee.c, this.c) == 0 && Double.compare(zzeee.d, this.d) == 0 && Double.compare(zzeee.zzifz, this.zzifz) == 0 && Double.compare(zzeee.zziga, this.zziga) == 0 && Double.compare(zzeee.zzifx, this.zzifx) == 0 && Double.compare(zzeee.zzify, this.zzify) == 0 && Double.compare(zzeee.w, this.w) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzifx);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzify);
        long doubleToLongBits3 = Double.doubleToLongBits(this.w);
        long doubleToLongBits4 = Double.doubleToLongBits(this.a);
        long doubleToLongBits5 = Double.doubleToLongBits(this.b);
        long doubleToLongBits6 = Double.doubleToLongBits(this.c);
        long doubleToLongBits7 = Double.doubleToLongBits(this.d);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzifz);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zziga);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zzigb)) {
            return "Rotate 0°";
        }
        if (equals(zzigc)) {
            return "Rotate 90°";
        }
        if (equals(zzigd)) {
            return "Rotate 180°";
        }
        if (equals(zzige)) {
            return "Rotate 270°";
        }
        double d2 = this.zzifx;
        double d3 = this.zzify;
        double d4 = this.w;
        double d5 = this.a;
        double d6 = this.b;
        double d7 = this.c;
        double d8 = this.d;
        double d9 = this.zzifz;
        double d10 = this.zziga;
        double d11 = d8;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d11);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }

    public static zzeee zzp(ByteBuffer byteBuffer) {
        double zzd = zzbg.zzd(byteBuffer);
        double zzd2 = zzbg.zzd(byteBuffer);
        double zze = zzbg.zze(byteBuffer);
        return new zzeee(zzd, zzd2, zzbg.zzd(byteBuffer), zzbg.zzd(byteBuffer), zze, zzbg.zze(byteBuffer), zzbg.zze(byteBuffer), zzbg.zzd(byteBuffer), zzbg.zzd(byteBuffer));
    }
}
