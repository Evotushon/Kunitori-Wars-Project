package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzdzp extends zzdxh<String> implements zzdzs, RandomAccess {
    private static final zzdzp zzhuk;
    private static final zzdzs zzhul = zzhuk;
    private final List<Object> zzhum;

    public zzdzp() {
        this(10);
    }

    public zzdzp(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private zzdzp(ArrayList<Object> arrayList) {
        this.zzhum = arrayList;
    }

    public final int size() {
        return this.zzhum.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzbao();
        if (collection instanceof zzdzs) {
            collection = ((zzdzs) collection).zzbdu();
        }
        boolean addAll = this.zzhum.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzbao();
        this.zzhum.clear();
        this.modCount++;
    }

    public final void zzaj(zzdxn zzdxn) {
        zzbao();
        this.zzhum.add(zzdxn);
        this.modCount++;
    }

    public final Object zzgm(int i) {
        return this.zzhum.get(i);
    }

    private static String zzap(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdxn) {
            return ((zzdxn) obj).zzbas();
        }
        return zzdzc.zzy((byte[]) obj);
    }

    public final List<?> zzbdu() {
        return Collections.unmodifiableList(this.zzhum);
    }

    public final zzdzs zzbdv() {
        return zzbam() ? new zzeca(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        zzbao();
        return zzap(this.zzhum.set(i, (String) obj));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        zzbao();
        Object remove = this.zzhum.remove(i);
        this.modCount++;
        return zzap(remove);
    }

    public final /* bridge */ /* synthetic */ boolean zzbam() {
        return super.zzbam();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzbao();
        this.zzhum.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ zzdzi zzfd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzhum);
            return new zzdzp((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzhum.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdxn) {
            zzdxn zzdxn = (zzdxn) obj;
            String zzbas = zzdxn.zzbas();
            if (zzdxn.zzbat()) {
                this.zzhum.set(i, zzbas);
            }
            return zzbas;
        }
        byte[] bArr = (byte[]) obj;
        String zzy = zzdzc.zzy(bArr);
        if (zzdzc.zzx(bArr)) {
            this.zzhum.set(i, zzy);
        }
        return zzy;
    }

    static {
        zzdzp zzdzp = new zzdzp();
        zzhuk = zzdzp;
        zzdzp.zzban();
    }
}
