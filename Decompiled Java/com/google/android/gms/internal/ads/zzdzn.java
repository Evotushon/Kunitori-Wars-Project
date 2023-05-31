package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdzn<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzhui;

    public zzdzn(Iterator<Map.Entry<K, Object>> it) {
        this.zzhui = it;
    }

    public final boolean hasNext() {
        return this.zzhui.hasNext();
    }

    public final void remove() {
        this.zzhui.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zzhui.next();
        return next.getValue() instanceof zzdzm ? new zzdzo(next) : next;
    }
}
