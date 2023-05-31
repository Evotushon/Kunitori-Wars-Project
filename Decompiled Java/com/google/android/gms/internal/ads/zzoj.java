package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzoj {
    private byte[] data;
    private int zzbgp;
    private int zzbgq;
    private int zzbgr;

    public zzoj() {
    }

    public zzoj(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private zzoj(byte[] bArr, int i) {
        this.data = bArr;
        this.zzbgr = i;
    }

    public final int zzbd(int i) {
        int i2;
        int i3;
        byte b;
        byte b2;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        int i5 = i;
        byte b3 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = this.zzbgq;
            if (i7 != 0) {
                byte[] bArr = this.data;
                int i8 = this.zzbgp;
                b2 = ((bArr[i8 + 1] & 255) >>> (8 - i7)) | ((bArr[i8] & 255) << i7);
            } else {
                b2 = this.data[this.zzbgp];
            }
            i5 -= 8;
            b3 |= (255 & b2) << i5;
            this.zzbgp++;
        }
        if (i5 > 0) {
            int i9 = this.zzbgq + i5;
            byte b4 = (byte) (255 >> (8 - i5));
            if (i9 > 8) {
                byte[] bArr2 = this.data;
                int i10 = this.zzbgp;
                b = (b4 & (((bArr2[i10 + 1] & 255) >> (16 - i9)) | ((bArr2[i10] & 255) << (i9 - 8)))) | b3;
                this.zzbgp = i10 + 1;
            } else {
                byte[] bArr3 = this.data;
                int i11 = this.zzbgp;
                b = (b4 & ((bArr3[i11] & 255) >> (8 - i9))) | b3;
                if (i9 == 8) {
                    this.zzbgp = i11 + 1;
                }
            }
            b3 = b;
            this.zzbgq = i9 % 8;
        }
        int i12 = this.zzbgp;
        if (i12 >= 0 && (i2 = this.zzbgq) >= 0 && i2 < 8 && (i12 < (i3 = this.zzbgr) || (i12 == i3 && i2 == 0))) {
            z = true;
        }
        zzob.checkState(z);
        return b3;
    }
}
