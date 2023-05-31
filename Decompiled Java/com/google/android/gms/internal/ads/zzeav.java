package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzeav<E> extends zzdxh<E> implements RandomAccess {
    private static final zzeav<Object> zzhvy;
    private int size;
    private E[] zzhaq;

    public static <E> zzeav<E> zzbel() {
        return zzhvy;
    }

    zzeav() {
        this(new Object[10], 0);
    }

    private zzeav(E[] eArr, int i) {
        this.zzhaq = eArr;
        this.size = i;
    }

    public final boolean add(E e) {
        zzbao();
        int i = this.size;
        E[] eArr = this.zzhaq;
        if (i == eArr.length) {
            this.zzhaq = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzhaq;
        int i2 = this.size;
        this.size = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final void add(int i, E e) {
        int i2;
        zzbao();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfc(i));
        }
        E[] eArr = this.zzhaq;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzhaq, i, eArr2, i + 1, this.size - i);
            this.zzhaq = eArr2;
        }
        this.zzhaq[i] = e;
        this.size++;
        this.modCount++;
    }

    public final E get(int i) {
        zzfb(i);
        return this.zzhaq[i];
    }

    public final E remove(int i) {
        zzbao();
        zzfb(i);
        E[] eArr = this.zzhaq;
        E e = eArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        zzbao();
        zzfb(i);
        E[] eArr = this.zzhaq;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.size;
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

    public final /* synthetic */ zzdzi zzfd(int i) {
        if (i >= this.size) {
            return new zzeav(Arrays.copyOf(this.zzhaq, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    static {
        zzeav<Object> zzeav = new zzeav<>(new Object[0], 0);
        zzhvy = zzeav;
        zzeav.zzban();
    }
}
