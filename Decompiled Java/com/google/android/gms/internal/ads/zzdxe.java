package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdxe {
    private final byte[] zzhnq = new byte[256];
    private int zzhnr;
    private int zzhns;

    public zzdxe(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.zzhnq[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.zzhnq;
            b = (b + bArr2[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = bArr2[i2];
            bArr2[i2] = bArr2[b];
            bArr2[b] = b2;
        }
        this.zzhnr = 0;
        this.zzhns = 0;
    }

    public final void zzs(byte[] bArr) {
        int i = this.zzhnr;
        int i2 = this.zzhns;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.zzhnq;
            i2 = (i2 + bArr2[i]) & 255;
            byte b = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & 255] ^ bArr[i3]);
        }
        this.zzhnr = i;
        this.zzhns = i2;
    }
}
