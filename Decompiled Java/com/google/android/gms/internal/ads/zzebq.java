package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebq implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzebi zzhxd;
    private Iterator<Map.Entry<K, V>> zzhxe;
    private boolean zzhxi;

    private zzebq(zzebi zzebi) {
        this.zzhxd = zzebi;
        this.pos = -1;
    }

    public final boolean hasNext() {
        if (this.pos + 1 < this.zzhxd.zzhwy.size() || (!this.zzhxd.zzhwz.isEmpty() && zzbfb().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.zzhxi) {
            this.zzhxi = false;
            this.zzhxd.zzbez();
            if (this.pos < this.zzhxd.zzhwy.size()) {
                zzebi zzebi = this.zzhxd;
                int i = this.pos;
                this.pos = i - 1;
                Object unused = zzebi.zzgy(i);
                return;
            }
            zzbfb().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private final Iterator<Map.Entry<K, V>> zzbfb() {
        if (this.zzhxe == null) {
            this.zzhxe = this.zzhxd.zzhwz.entrySet().iterator();
        }
        return this.zzhxe;
    }

    public final /* synthetic */ Object next() {
        this.zzhxi = true;
        int i = this.pos + 1;
        this.pos = i;
        if (i < this.zzhxd.zzhwy.size()) {
            return (Map.Entry) this.zzhxd.zzhwy.get(this.pos);
        }
        return (Map.Entry) zzbfb().next();
    }

    /* synthetic */ zzebq(zzebi zzebi, zzebh zzebh) {
        this(zzebi);
    }
}
