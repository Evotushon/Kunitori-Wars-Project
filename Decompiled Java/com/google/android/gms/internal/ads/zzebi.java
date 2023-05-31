package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
class zzebi<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzhpv;
    private final int zzhwx;
    /* access modifiers changed from: private */
    public List<zzebn> zzhwy;
    /* access modifiers changed from: private */
    public Map<K, V> zzhwz;
    private volatile zzebp zzhxa;
    /* access modifiers changed from: private */
    public Map<K, V> zzhxb;
    private volatile zzebj zzhxc;

    static <FieldDescriptorType extends zzdyr<FieldDescriptorType>> zzebi<FieldDescriptorType, Object> zzgw(int i) {
        return new zzebh(i);
    }

    private zzebi(int i) {
        this.zzhwx = i;
        this.zzhwy = Collections.emptyList();
        this.zzhwz = Collections.emptyMap();
        this.zzhxb = Collections.emptyMap();
    }

    public void zzban() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.zzhpv) {
            if (this.zzhwz.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzhwz);
            }
            this.zzhwz = map;
            if (this.zzhxb.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzhxb);
            }
            this.zzhxb = map2;
            this.zzhpv = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzhpv;
    }

    public final int zzbew() {
        return this.zzhwy.size();
    }

    public final Map.Entry<K, V> zzgx(int i) {
        return this.zzhwy.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzbex() {
        if (this.zzhwz.isEmpty()) {
            return zzebm.zzbfc();
        }
        return this.zzhwz.entrySet();
    }

    public int size() {
        return this.zzhwy.size() + this.zzhwz.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzhwz.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return this.zzhwy.get(zza).getValue();
        }
        return this.zzhwz.get(comparable);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzbez();
        int zza = zza(k);
        if (zza >= 0) {
            return this.zzhwy.get(zza).setValue(v);
        }
        zzbez();
        if (this.zzhwy.isEmpty() && !(this.zzhwy instanceof ArrayList)) {
            this.zzhwy = new ArrayList(this.zzhwx);
        }
        int i = -(zza + 1);
        if (i >= this.zzhwx) {
            return zzbfa().put(k, v);
        }
        int size = this.zzhwy.size();
        int i2 = this.zzhwx;
        if (size == i2) {
            zzebn remove = this.zzhwy.remove(i2 - 1);
            zzbfa().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zzhwy.add(i, new zzebn(this, k, v));
        return null;
    }

    public void clear() {
        zzbez();
        if (!this.zzhwy.isEmpty()) {
            this.zzhwy.clear();
        }
        if (!this.zzhwz.isEmpty()) {
            this.zzhwz.clear();
        }
    }

    public V remove(Object obj) {
        zzbez();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzgy(zza);
        }
        if (this.zzhwz.isEmpty()) {
            return null;
        }
        return this.zzhwz.remove(comparable);
    }

    /* access modifiers changed from: private */
    public final V zzgy(int i) {
        zzbez();
        V value = this.zzhwy.remove(i).getValue();
        if (!this.zzhwz.isEmpty()) {
            Iterator it = zzbfa().entrySet().iterator();
            this.zzhwy.add(new zzebn(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int zza(K k) {
        int size = this.zzhwy.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzhwy.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzhwy.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzhxa == null) {
            this.zzhxa = new zzebp(this, (zzebh) null);
        }
        return this.zzhxa;
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzbey() {
        if (this.zzhxc == null) {
            this.zzhxc = new zzebj(this, (zzebh) null);
        }
        return this.zzhxc;
    }

    /* access modifiers changed from: private */
    public final void zzbez() {
        if (this.zzhpv) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzbfa() {
        zzbez();
        if (this.zzhwz.isEmpty() && !(this.zzhwz instanceof TreeMap)) {
            this.zzhwz = new TreeMap();
            this.zzhxb = ((TreeMap) this.zzhwz).descendingMap();
        }
        return (SortedMap) this.zzhwz;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzebi)) {
            return super.equals(obj);
        }
        zzebi zzebi = (zzebi) obj;
        int size = size();
        if (size != zzebi.size()) {
            return false;
        }
        int zzbew = zzbew();
        if (zzbew != zzebi.zzbew()) {
            return entrySet().equals(zzebi.entrySet());
        }
        for (int i = 0; i < zzbew; i++) {
            if (!zzgx(i).equals(zzebi.zzgx(i))) {
                return false;
            }
        }
        if (zzbew != size) {
            return this.zzhwz.equals(zzebi.zzhwz);
        }
        return true;
    }

    public int hashCode() {
        int zzbew = zzbew();
        int i = 0;
        for (int i2 = 0; i2 < zzbew; i2++) {
            i += this.zzhwy.get(i2).hashCode();
        }
        return this.zzhwz.size() > 0 ? i + this.zzhwz.hashCode() : i;
    }

    /* synthetic */ zzebi(int i, zzebh zzebh) {
        this(i);
    }
}
