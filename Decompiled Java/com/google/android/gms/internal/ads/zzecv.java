package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzecv implements Cloneable {
    private static final zzecy zzhzv = new zzecy();
    private int mSize;
    private boolean zzhzw;
    private int[] zzhzx;
    private zzecy[] zzhzy;

    zzecv() {
        this(10);
    }

    private zzecv(int i) {
        this.zzhzw = false;
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.zzhzx = new int[i5];
        this.zzhzy = new zzecy[i5];
        this.mSize = 0;
    }

    /* access modifiers changed from: package-private */
    public final int size() {
        return this.mSize;
    }

    /* access modifiers changed from: package-private */
    public final zzecy zzhd(int i) {
        return this.zzhzy[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzecv)) {
            return false;
        }
        zzecv zzecv = (zzecv) obj;
        int i = this.mSize;
        if (i != zzecv.mSize) {
            return false;
        }
        int[] iArr = this.zzhzx;
        int[] iArr2 = zzecv.zzhzx;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            zzecy[] zzecyArr = this.zzhzy;
            zzecy[] zzecyArr2 = zzecv.zzhzy;
            int i3 = this.mSize;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!zzecyArr[i4].equals(zzecyArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzhzx[i2]) * 31) + this.zzhzy[i2].hashCode();
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.mSize;
        zzecv zzecv = new zzecv(i);
        System.arraycopy(this.zzhzx, 0, zzecv.zzhzx, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            zzecy[] zzecyArr = this.zzhzy;
            if (zzecyArr[i2] != null) {
                zzecv.zzhzy[i2] = (zzecy) zzecyArr[i2].clone();
            }
        }
        zzecv.mSize = i;
        return zzecv;
    }
}
