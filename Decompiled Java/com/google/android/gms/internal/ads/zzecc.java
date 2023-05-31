package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzecc implements Iterator<String> {
    private final /* synthetic */ zzeca zzhxo;
    private Iterator<String> zzhyk = this.zzhxo.zzhxp.iterator();

    zzecc(zzeca zzeca) {
        this.zzhxo = zzeca;
    }

    public final boolean hasNext() {
        return this.zzhyk.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return this.zzhyk.next();
    }
}
