package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
class zzdlp<E> extends zzdls<E> {
    int size = 0;
    Object[] zzhab;
    boolean zzhac;

    zzdlp(int i) {
        zzdll.zze(i, "initialCapacity");
        this.zzhab = new Object[i];
    }

    private final void zzdw(int i) {
        Object[] objArr = this.zzhab;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.zzhab = Arrays.copyOf(objArr, i2);
                this.zzhac = false;
                return;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        } else if (this.zzhac) {
            this.zzhab = (Object[]) objArr.clone();
            this.zzhac = false;
        }
    }

    /* renamed from: zzae */
    public zzdlp<E> zzaf(E e) {
        zzdlg.checkNotNull(e);
        zzdw(this.size + 1);
        Object[] objArr = this.zzhab;
        int i = this.size;
        this.size = i + 1;
        objArr[i] = e;
        return this;
    }

    public zzdls<E> zze(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzdw(this.size + collection.size());
            if (collection instanceof zzdlq) {
                this.size = ((zzdlq) collection).zza(this.zzhab, this.size);
                return this;
            }
        }
        super.zze(iterable);
        return this;
    }
}
