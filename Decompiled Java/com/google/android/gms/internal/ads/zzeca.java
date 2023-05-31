package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzeca extends AbstractList<String> implements zzdzs, RandomAccess {
    /* access modifiers changed from: private */
    public final zzdzs zzhxp;

    public zzeca(zzdzs zzdzs) {
        this.zzhxp = zzdzs;
    }

    public final zzdzs zzbdv() {
        return this;
    }

    public final Object zzgm(int i) {
        return this.zzhxp.zzgm(i);
    }

    public final int size() {
        return this.zzhxp.size();
    }

    public final void zzaj(zzdxn zzdxn) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzebz(this, i);
    }

    public final Iterator<String> iterator() {
        return new zzecc(this);
    }

    public final List<?> zzbdu() {
        return this.zzhxp.zzbdu();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.zzhxp.get(i);
    }
}
