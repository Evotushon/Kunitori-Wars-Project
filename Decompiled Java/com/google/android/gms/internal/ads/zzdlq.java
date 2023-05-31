package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public abstract class zzdlq<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zzhad = new Object[0];

    zzdlq() {
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: zzatw */
    public abstract zzdmm<E> iterator();

    /* access modifiers changed from: package-private */
    public Object[] zzatx() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean zzaub();

    public final Object[] toArray() {
        return toArray(zzhad);
    }

    public final <T> T[] toArray(T[] tArr) {
        zzdlg.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzatx = zzatx();
            if (zzatx != null) {
                return Arrays.copyOfRange(zzatx, zzaty(), zzatz(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    public int zzaty() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zzatz() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public zzdlr<E> zzaua() {
        return isEmpty() ? zzdlr.zzauc() : zzdlr.zzc(toArray());
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        zzdmm zzdmm = (zzdmm) iterator();
        while (zzdmm.hasNext()) {
            objArr[i] = zzdmm.next();
            i++;
        }
        return i;
    }
}
