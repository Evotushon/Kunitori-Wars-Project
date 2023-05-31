package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
abstract class zzdxh<E> extends AbstractList<E> implements zzdzi<E> {
    private boolean zzhnt = true;

    zzdxh() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        zzbao();
        return super.add(e);
    }

    public void add(int i, E e) {
        zzbao();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzbao();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        zzbao();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzbao();
        super.clear();
    }

    public boolean zzbam() {
        return this.zzhnt;
    }

    public final void zzban() {
        this.zzhnt = false;
    }

    public E remove(int i) {
        zzbao();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        zzbao();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        zzbao();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        zzbao();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        zzbao();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    public final void zzbao() {
        if (!this.zzhnt) {
            throw new UnsupportedOperationException();
        }
    }
}
