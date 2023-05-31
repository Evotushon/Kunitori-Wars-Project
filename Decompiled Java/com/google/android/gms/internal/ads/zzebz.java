package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebz implements ListIterator<String> {
    private final /* synthetic */ int zzhcc;
    private ListIterator<String> zzhxn = this.zzhxo.zzhxp.listIterator(this.zzhcc);
    private final /* synthetic */ zzeca zzhxo;

    zzebz(zzeca zzeca, int i) {
        this.zzhxo = zzeca;
        this.zzhcc = i;
    }

    public final boolean hasNext() {
        return this.zzhxn.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzhxn.hasPrevious();
    }

    public final int nextIndex() {
        return this.zzhxn.nextIndex();
    }

    public final int previousIndex() {
        return this.zzhxn.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return this.zzhxn.previous();
    }

    public final /* synthetic */ Object next() {
        return this.zzhxn.next();
    }
}
