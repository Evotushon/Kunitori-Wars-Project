package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public abstract class zzdlr<E> extends zzdlq<E> implements List<E>, RandomAccess {
    private static final zzdml<Object> zzhae = new zzdlt(zzdmb.zzhap, 0);

    public static <E> zzdlr<E> zzauc() {
        return zzdmb.zzhap;
    }

    public final zzdlr<E> zzaua() {
        return this;
    }

    public static <E> zzdlr<E> zzag(E e) {
        Object[] objArr = {e};
        for (int i = 0; i <= 0; i++) {
            zzdmc.zzd(objArr[0], 0);
        }
        return zzb(objArr, 1);
    }

    public static <E> zzdlr<E> zzf(Iterable<? extends E> iterable) {
        zzdlg.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection instanceof zzdlq) {
                zzdlr<E> zzaua = ((zzdlq) collection).zzaua();
                if (!zzaua.zzaub()) {
                    return zzaua;
                }
                Object[] array = zzaua.toArray();
                return zzb(array, array.length);
            }
            Object[] array2 = collection.toArray();
            int length = array2.length;
            for (int i = 0; i < length; i++) {
                zzdmc.zzd(array2[i], i);
            }
            return zzb(array2, array2.length);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return zzdmb.zzhap;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzag(next);
        }
        zzdlu zzdlu = (zzdlu) ((zzdlu) new zzdlu().zzaf(next)).zza(it);
        zzdlu.zzhac = true;
        return zzb(zzdlu.zzhab, zzdlu.size);
    }

    public static <E> zzdlr<E> zzb(E[] eArr) {
        if (eArr.length == 0) {
            return zzdmb.zzhap;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            zzdmc.zzd(objArr[i], i);
        }
        return zzb(objArr, objArr.length);
    }

    static <E> zzdlr<E> zzc(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    static <E> zzdlr<E> zzb(Object[] objArr, int i) {
        if (i == 0) {
            return zzdmb.zzhap;
        }
        return new zzdmb(objArr, i);
    }

    zzdlr() {
    }

    public final zzdmm<E> zzatw() {
        return (zzdml) listIterator();
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            int i = 0;
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < size) {
                    if (obj.equals(get(i))) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (zzdlb.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            if (obj == null) {
                for (int size = size() - 1; size >= 0; size--) {
                    if (get(size) == null) {
                        return size;
                    }
                }
            } else {
                for (int size2 = size() - 1; size2 >= 0; size2--) {
                    if (obj.equals(get(size2))) {
                        return size2;
                    }
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (zzdlb.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: zzu */
    public zzdlr<E> subList(int i, int i2) {
        zzdlg.zzf(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzdmb.zzhap;
        }
        return new zzdlw(this, i, i3);
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == zzdlg.checkNotNull(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                    zzdlr zzdlr = this;
                    int size2 = zzdlr.size();
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (i < size2) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object obj2 = zzdlr.get(i);
                            i++;
                            if (!zzdlb.equal(obj2, it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                } else {
                    int i2 = 0;
                    while (i2 < size) {
                        if (zzdlb.equal(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        zzdlg.zzt(i, size());
        if (isEmpty()) {
            return zzhae;
        }
        return new zzdlt(this, i);
    }

    public /* synthetic */ ListIterator listIterator() {
        return (zzdml) listIterator(0);
    }
}
