package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.6.0 */
public final class zzip extends zzgl<String> implements zzis, RandomAccess {
    private static final zzip zza;
    private static final zzis zzb = zza;
    private final List<Object> zzc;

    public zzip() {
        this(10);
    }

    public zzip(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private zzip(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    public final int size() {
        return this.zzc.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzc();
        if (collection instanceof zzis) {
            collection = ((zzis) collection).zzd();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzc();
        this.zzc.clear();
        this.modCount++;
    }

    public final void zza(zzgr zzgr) {
        zzc();
        this.zzc.add(zzgr);
        this.modCount++;
    }

    public final Object zzb(int i) {
        return this.zzc.get(i);
    }

    private static String zza(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgr) {
            return ((zzgr) obj).zzb();
        }
        return zzic.zzb((byte[]) obj);
    }

    public final List<?> zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final zzis zze() {
        return zza() ? new zzkw(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        zzc();
        return zza(this.zzc.set(i, (String) obj));
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
        zzc();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zza(remove);
    }

    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzc();
        this.zzc.add(i, (String) obj);
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

    public final /* synthetic */ zzii zza(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzip((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgr) {
            zzgr zzgr = (zzgr) obj;
            String zzb2 = zzgr.zzb();
            if (zzgr.zzc()) {
                this.zzc.set(i, zzb2);
            }
            return zzb2;
        }
        byte[] bArr = (byte[]) obj;
        String zzb3 = zzic.zzb(bArr);
        if (zzic.zza(bArr)) {
            this.zzc.set(i, zzb3);
        }
        return zzb3;
    }

    static {
        zzip zzip = new zzip();
        zza = zzip;
        zzip.zzb();
    }
}
