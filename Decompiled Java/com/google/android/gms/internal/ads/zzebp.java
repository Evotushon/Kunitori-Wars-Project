package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
class zzebp extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzebi zzhxd;

    private zzebp(zzebi zzebi) {
        this.zzhxd = zzebi;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzebq(this.zzhxd, (zzebh) null);
    }

    public int size() {
        return this.zzhxd.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzhxd.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzhxd.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.zzhxd.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzhxd.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ zzebp(zzebi zzebi, zzebh zzebh) {
        this(zzebi);
    }
}
