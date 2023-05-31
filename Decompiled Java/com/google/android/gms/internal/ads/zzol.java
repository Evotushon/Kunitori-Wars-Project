package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzol {
    private byte[] data;
    private int zzbgp;
    private int zzbgq = 0;
    private int zzbgr;

    public zzol(byte[] bArr, int i, int i2) {
        this.data = bArr;
        this.zzbgp = i;
        this.zzbgr = i2;
        zziw();
    }

    public final void zzbe(int i) {
        int i2 = this.zzbgp;
        this.zzbgp = (i / 8) + i2;
        this.zzbgq += i % 8;
        int i3 = this.zzbgq;
        if (i3 > 7) {
            this.zzbgp++;
            this.zzbgq = i3 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.zzbgp) {
                zziw();
                return;
            } else if (zzbf(i2)) {
                this.zzbgp++;
                i2 += 2;
            }
        }
    }

    public final boolean zzis() {
        return zzbd(1) == 1;
    }

    public final int zzbd(int i) {
        byte b;
        byte b2;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        byte b3 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = zzbf(this.zzbgp + 1) ? this.zzbgp + 2 : this.zzbgp + 1;
            int i5 = this.zzbgq;
            if (i5 != 0) {
                byte[] bArr = this.data;
                b2 = ((bArr[i4] & 255) >>> (8 - i5)) | ((bArr[this.zzbgp] & 255) << i5);
            } else {
                b2 = this.data[this.zzbgp];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.zzbgp = i4;
        }
        if (i > 0) {
            int i6 = this.zzbgq + i;
            byte b4 = (byte) (255 >> (8 - i));
            int i7 = zzbf(this.zzbgp + 1) ? this.zzbgp + 2 : this.zzbgp + 1;
            if (i6 > 8) {
                byte[] bArr2 = this.data;
                b = (b4 & (((255 & bArr2[i7]) >> (16 - i6)) | ((bArr2[this.zzbgp] & 255) << (i6 - 8)))) | b3;
                this.zzbgp = i7;
            } else {
                b = (b4 & ((255 & this.data[this.zzbgp]) >> (8 - i6))) | b3;
                if (i6 == 8) {
                    this.zzbgp = i7;
                }
            }
            b3 = b;
            this.zzbgq = i6 % 8;
        }
        zziw();
        return b3;
    }

    public final int zzit() {
        return zziv();
    }

    public final int zziu() {
        int zziv = zziv();
        return (zziv % 2 == 0 ? -1 : 1) * ((zziv + 1) / 2);
    }

    private final int zziv() {
        int i = 0;
        int i2 = 0;
        while (!zzis()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = zzbd(i2);
        }
        return i3 + i;
    }

    private final boolean zzbf(int i) {
        if (2 > i || i >= this.zzbgr) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.zzbgq;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r2 = r3.zzbgr;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zziw() {
        /*
            r3 = this;
            int r0 = r3.zzbgp
            if (r0 < 0) goto L_0x0016
            int r1 = r3.zzbgq
            if (r1 < 0) goto L_0x0016
            r2 = 8
            if (r1 >= r2) goto L_0x0016
            int r2 = r3.zzbgr
            if (r0 < r2) goto L_0x0014
            if (r0 != r2) goto L_0x0016
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.zzob.checkState(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzol.zziw():void");
    }
}
