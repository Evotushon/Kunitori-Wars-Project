package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdza extends zzdxh<Integer> implements zzdzg, zzeat, RandomAccess {
    private static final zzdza zzhta;
    private int size;
    private int[] zzhtb;

    public static zzdza zzbdg() {
        return zzhta;
    }

    zzdza() {
        this(new int[10], 0);
    }

    private zzdza(int[] iArr, int i) {
        this.zzhtb = iArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzbao();
        if (i2 >= i) {
            int[] iArr = this.zzhtb;
            System.arraycopy(iArr, i2, iArr, i, this.size - i2);
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
        if (!(obj instanceof zzdza)) {
            return super.equals(obj);
        }
        zzdza zzdza = (zzdza) obj;
        if (this.size != zzdza.size) {
            return false;
        }
        int[] iArr = zzdza.zzhtb;
        for (int i = 0; i < this.size; i++) {
            if (this.zzhtb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzhtb[i2];
        }
        return i;
    }

    /* renamed from: zzgk */
    public final zzdzg zzfd(int i) {
        if (i >= this.size) {
            return new zzdza(Arrays.copyOf(this.zzhtb, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final int getInt(int i) {
        zzfb(i);
        return this.zzhtb[i];
    }

    public final int size() {
        return this.size;
    }

    public final void zzgl(int i) {
        zzbao();
        int i2 = this.size;
        int[] iArr = this.zzhtb;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzhtb = iArr2;
        }
        int[] iArr3 = this.zzhtb;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        zzbao();
        zzdzc.checkNotNull(collection);
        if (!(collection instanceof zzdza)) {
            return super.addAll(collection);
        }
        zzdza zzdza = (zzdza) collection;
        int i = zzdza.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.zzhtb;
            if (i3 > iArr.length) {
                this.zzhtb = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzdza.zzhtb, 0, this.zzhtb, this.size, zzdza.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzbao();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzhtb[i]))) {
                int[] iArr = this.zzhtb;
                System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
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
        int intValue = ((Integer) obj).intValue();
        zzbao();
        zzfb(i);
        int[] iArr = this.zzhtb;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        zzbao();
        zzfb(i);
        int[] iArr = this.zzhtb;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzbao();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfc(i));
        }
        int[] iArr = this.zzhtb;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzhtb, i, iArr2, i + 1, this.size - i);
            this.zzhtb = iArr2;
        }
        this.zzhtb[i] = intValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzgl(((Integer) obj).intValue());
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    static {
        zzdza zzdza = new zzdza(new int[0], 0);
        zzhta = zzdza;
        zzdza.zzban();
    }
}
