package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdyl extends zzdxh<Double> implements zzdzi<Double>, zzeat, RandomAccess {
    private static final zzdyl zzhpm;
    private int size;
    private double[] zzhpn;

    zzdyl() {
        this(new double[10], 0);
    }

    private zzdyl(double[] dArr, int i) {
        this.zzhpn = dArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzbao();
        if (i2 >= i) {
            double[] dArr = this.zzhpn;
            System.arraycopy(dArr, i2, dArr, i, this.size - i2);
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
        if (!(obj instanceof zzdyl)) {
            return super.equals(obj);
        }
        zzdyl zzdyl = (zzdyl) obj;
        if (this.size != zzdyl.size) {
            return false;
        }
        double[] dArr = zzdyl.zzhpn;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.zzhpn[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzdzc.zzfr(Double.doubleToLongBits(this.zzhpn[i2]));
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zzd(double d) {
        zzbao();
        int i = this.size;
        double[] dArr = this.zzhpn;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzhpn = dArr2;
        }
        double[] dArr3 = this.zzhpn;
        int i2 = this.size;
        this.size = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        zzbao();
        zzdzc.checkNotNull(collection);
        if (!(collection instanceof zzdyl)) {
            return super.addAll(collection);
        }
        zzdyl zzdyl = (zzdyl) collection;
        int i = zzdyl.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zzhpn;
            if (i3 > dArr.length) {
                this.zzhpn = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzdyl.zzhpn, 0, this.zzhpn, this.size, zzdyl.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzbao();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zzhpn[i]))) {
                double[] dArr = this.zzhpn;
                System.arraycopy(dArr, i + 1, dArr, i, (this.size - i) - 1);
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
        double doubleValue = ((Double) obj).doubleValue();
        zzbao();
        zzfb(i);
        double[] dArr = this.zzhpn;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        zzbao();
        zzfb(i);
        double[] dArr = this.zzhpn;
        double d = dArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        zzbao();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfc(i));
        }
        double[] dArr = this.zzhpn;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzhpn, i, dArr2, i + 1, this.size - i);
            this.zzhpn = dArr2;
        }
        this.zzhpn[i] = doubleValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzd(((Double) obj).doubleValue());
        return true;
    }

    public final /* synthetic */ zzdzi zzfd(int i) {
        if (i >= this.size) {
            return new zzdyl(Arrays.copyOf(this.zzhpn, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzfb(i);
        return Double.valueOf(this.zzhpn[i]);
    }

    static {
        zzdyl zzdyl = new zzdyl(new double[0], 0);
        zzhpm = zzdyl;
        zzdyl.zzban();
    }
}
