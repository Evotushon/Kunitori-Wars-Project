package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzedz<E> extends AbstractList<E> {
    private static final zzeeb zzcr = zzeeb.zzn(zzedz.class);
    List<E> zzifu;
    Iterator<E> zzifv;

    public zzedz(List<E> list, Iterator<E> it) {
        this.zzifu = list;
        this.zzifv = it;
    }

    public E get(int i) {
        if (this.zzifu.size() > i) {
            return this.zzifu.get(i);
        }
        if (this.zzifv.hasNext()) {
            this.zzifu.add(this.zzifv.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new zzeec(this);
    }

    public int size() {
        zzcr.zzhs("potentially expensive size() call");
        zzcr.zzhs("blowup running");
        while (this.zzifv.hasNext()) {
            this.zzifu.add(this.zzifv.next());
        }
        return this.zzifu.size();
    }
}
