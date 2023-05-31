package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdyv extends zzdxh<Float> implements zzdzi<Float>, zzeat, RandomAccess {
    private static final zzdyv zzhsj;
    private int size;
    private float[] zzhsk;

    zzdyv() {
        this(new float[10], 0);
    }

    private zzdyv(float[] fArr, int i) {
        this.zzhsk = fArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzbao();
        if (i2 >= i) {
            float[] fArr = this.zzhsk;
            System.arraycopy(fArr, i2, fArr, i, this.size - i2);
            this.size -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdyv)) {
            return super.equals(obj);
        }
        zzdyv zzdyv = (zzdyv) obj;
        if (this.size != zzdyv.size) {
            return false;
        }
        float[] fArr = zzdyv.zzhsk;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.zzhsk[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzhsk[i2]);
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zzh(float f) {
        zzbao();
        int i = this.size;
        float[] fArr = this.zzhsk;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzhsk = fArr2;
        }
        float[] fArr3 = this.zzhsk;
        int i2 = this.size;
        this.size = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        zzbao();
        zzdzc.checkNotNull(collection);
        if (!(collection instanceof zzdyv)) {
            return super.addAll(collection);
        }
        zzdyv zzdyv = (zzdyv) collection;
        int i = zzdyv.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zzhsk;
            if (i3 > fArr.length) {
                this.zzhsk = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzdyv.zzhsk, 0, this.zzhsk, this.size, zzdyv.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzbao();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.zzhsk[i]))) {
                float[] fArr = this.zzhsk;
                System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzfb(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzfc(i));
        }
    }

    private final String zzfc(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzbao();
        zzfb(i);
        float[] fArr = this.zzhsk;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        zzbao();
        zzfb(i);
        float[] fArr = this.zzhsk;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zzbao();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfc(i));
        }
        float[] fArr = this.zzhsk;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzhsk, i, fArr2, i + 1, this.size - i);
            this.zzhsk = fArr2;
        }
        this.zzhsk[i] = floatValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }

    public final /* synthetic */ zzdzi zzfd(int i) {
        if (i >= this.size) {
            return new zzdyv(Arrays.copyOf(this.zzhsk, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzfb(i);
        return Float.valueOf(this.zzhsk[i]);
    }

    static {
        zzdyv zzdyv = new zzdyv(new float[0], 0);
        zzhsj = zzdyv;
        zzdyv.zzban();
    }
}
