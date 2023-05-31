package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzdxz {
    int zzhom;
    int zzhon;
    int zzhoo;
    zzdyg zzhop;
    private boolean zzhoq;

    static zzdxz zzb(byte[] bArr, int i, int i2, boolean z) {
        zzdyb zzdyb = new zzdyb(bArr, i, i2, z);
        try {
            zzdyb.zzfj(i2);
            return zzdyb;
        } catch (zzdzh e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static long zzfg(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int zzfl(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double readDouble() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract String readString() throws IOException;

    public abstract int zzbbb() throws IOException;

    public abstract long zzbbc() throws IOException;

    public abstract long zzbbd() throws IOException;

    public abstract int zzbbe() throws IOException;

    public abstract long zzbbf() throws IOException;

    public abstract int zzbbg() throws IOException;

    public abstract boolean zzbbh() throws IOException;

    public abstract String zzbbi() throws IOException;

    public abstract zzdxn zzbbj() throws IOException;

    public abstract int zzbbk() throws IOException;

    public abstract int zzbbl() throws IOException;

    public abstract int zzbbm() throws IOException;

    public abstract long zzbbn() throws IOException;

    public abstract int zzbbo() throws IOException;

    public abstract long zzbbp() throws IOException;

    /* access modifiers changed from: package-private */
    public abstract long zzbbq() throws IOException;

    public abstract boolean zzbbr() throws IOException;

    public abstract int zzbbs();

    public abstract void zzfh(int i) throws zzdzh;

    public abstract boolean zzfi(int i) throws IOException;

    public abstract int zzfj(int i) throws zzdzh;

    public abstract void zzfk(int i);

    private zzdxz() {
        this.zzhon = 100;
        this.zzhoo = Integer.MAX_VALUE;
        this.zzhoq = false;
    }
}
