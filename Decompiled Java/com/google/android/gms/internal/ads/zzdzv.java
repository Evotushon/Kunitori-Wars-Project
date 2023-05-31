package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdzv extends zzdxh<Long> implements zzdzi<Long>, zzeat, RandomAccess {
    private static final zzdzv zzhut;
    private int size;
    private long[] zzhuu;

    zzdzv() {
        this(new long[10], 0);
    }

    private zzdzv(long[] jArr, int i) {
        this.zzhuu = jArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzbao();
        if (i2 >= i) {
            long[] jArr = this.zzhuu;
            System.arraycopy(jArr, i2, jArr, i, this.size - i2);
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
        if (!(obj instanceof zzdzv)) {
            return super.equals(obj);
        }
        zzdzv zzdzv = (zzdzv) obj;
        if (this.size != zzdzv.size) {
            return false;
        }
        long[] jArr = zzdzv.zzhuu;
        for (int i = 0; i < this.size; i++) {
            if (this.zzhuu[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzdzc.zzfr(this.zzhuu[i2]);
        }
        return i;
    }

    public final long getLong(int i) {
        zzfb(i);
        return this.zzhuu[i];
    }

    public final int size() {
        return this.size;
    }

    public final void zzfs(long j) {
        zzbao();
        int i = this.size;
        long[] jArr = this.zzhuu;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzhuu = jArr2;
        }
        long[] jArr3 = this.zzhuu;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        zzbao();
        zzdzc.checkNotNull(collection);
        if (!(collection instanceof zzdzv)) {
            return super.addAll(collection);
        }
        zzdzv zzdzv = (zzdzv) collection;
        int i = zzdzv.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zzhuu;
            if (i3 > jArr.length) {
                this.zzhuu = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzdzv.zzhuu, 0, this.zzhuu, this.size, zzdzv.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzbao();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzhuu[i]))) {
                long[] jArr = this.zzhuu;
                System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
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
        long longValue = ((Long) obj).longValue();
        zzbao();
        zzfb(i);
        long[] jArr = this.zzhuu;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        zzbao();
        zzfb(i);
        long[] jArr = this.zzhuu;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zzbao();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfc(i));
        }
        long[] jArr = this.zzhuu;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzhuu, i, jArr2, i + 1, this.size - i);
            this.zzhuu = jArr2;
        }
        this.zzhuu[i] = longValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzfs(((Long) obj).longValue());
        return true;
    }

    public final /* synthetic */ zzdzi zzfd(int i) {
        if (i >= this.size) {
            return new zzdzv(Arrays.copyOf(this.zzhuu, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    static {
        zzdzv zzdzv = new zzdzv(new long[0], 0);
        zzhut = zzdzv;
        zzdzv.zzban();
    }
}
