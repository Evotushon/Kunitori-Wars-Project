package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebk implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzebi zzhxd;
    private Iterator<Map.Entry<K, V>> zzhxe;

    private zzebk(zzebi zzebi) {
        this.zzhxd = zzebi;
        this.pos = this.zzhxd.zzhwy.size();
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzhxd.zzhwy.size()) || zzbfb().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzbfb() {
        if (this.zzhxe == null) {
            this.zzhxe = this.zzhxd.zzhxb.entrySet().iterator();
        }
        return this.zzhxe;
    }

    public final /* synthetic */ Object next() {
        if (zzbfb().hasNext()) {
            return (Map.Entry) zzbfb().next();
        }
        List zzb = this.zzhxd.zzhwy;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) zzb.get(i);
    }

    /* synthetic */ zzebk(zzebi zzebi, zzebh zzebh) {
        this(zzebi);
    }
}
