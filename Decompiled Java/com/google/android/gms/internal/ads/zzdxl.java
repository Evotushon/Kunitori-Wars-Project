package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdxl extends zzdxh<Boolean> implements zzdzi<Boolean>, zzeat, RandomAccess {
    private static final zzdxl zzhny;
    private int size;
    private boolean[] zzhnz;

    zzdxl() {
        this(new boolean[10], 0);
    }

    private zzdxl(boolean[] zArr, int i) {
        this.zzhnz = zArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzbao();
        if (i2 >= i) {
            boolean[] zArr = this.zzhnz;
            System.arraycopy(zArr, i2, zArr, i, this.size - i2);
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
        if (!(obj instanceof zzdxl)) {
            return super.equals(obj);
        }
        zzdxl zzdxl = (zzdxl) obj;
        if (this.size != zzdxl.size) {
            return false;
        }
        boolean[] zArr = zzdxl.zzhnz;
        for (int i = 0; i < this.size; i++) {
            if (this.zzhnz[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzdzc.zzbr(this.zzhnz[i2]);
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void addBoolean(boolean z) {
        zzbao();
        int i = this.size;
        boolean[] zArr = this.zzhnz;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zzhnz = zArr2;
        }
        boolean[] zArr3 = this.zzhnz;
        int i2 = this.size;
        this.size = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzbao();
        zzdzc.checkNotNull(collection);
        if (!(collection instanceof zzdxl)) {
            return super.addAll(collection);
        }
        zzdxl zzdxl = (zzdxl) collection;
        int i = zzdxl.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.zzhnz;
            if (i3 > zArr.length) {
                this.zzhnz = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzdxl.zzhnz, 0, this.zzhnz, this.size, zzdxl.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzbao();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Boolean.valueOf(this.zzhnz[i]))) {
                boolean[] zArr = this.zzhnz;
                System.arraycopy(zArr, i + 1, zArr, i, (this.size - i) - 1);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbao();
        zzfb(i);
        boolean[] zArr = this.zzhnz;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        zzbao();
        zzfb(i);
        boolean[] zArr = this.zzhnz;
        boolean z = zArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbao();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfc(i));
        }
        boolean[] zArr = this.zzhnz;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.zzhnz, i, zArr2, i + 1, this.size - i);
            this.zzhnz = zArr2;
        }
        this.zzhnz[i] = booleanValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }

    public final /* synthetic */ zzdzi zzfd(int i) {
        if (i >= this.size) {
            return new zzdxl(Arrays.copyOf(this.zzhnz, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzfb(i);
        return Boolean.valueOf(this.zzhnz[i]);
    }

    static {
        zzdxl zzdxl = new zzdxl(new boolean[0], 0);
        zzhny = zzdxl;
        zzdxl.zzban();
    }
}
