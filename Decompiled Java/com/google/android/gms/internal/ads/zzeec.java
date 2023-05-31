package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzeec implements Iterator<E> {
    private int pos = 0;
    private final /* synthetic */ zzedz zzifw;

    zzeec(zzedz zzedz) {
        this.zzifw = zzedz;
    }

    public final boolean hasNext() {
        return this.pos < this.zzifw.zzifu.size() || this.zzifw.zzifv.hasNext();
    }

    public final E next() {
        while (this.pos >= this.zzifw.zzifu.size()) {
            this.zzifw.zzifu.add(this.zzifw.zzifv.next());
        }
        List<E> list = this.zzifw.zzifu;
        int i = this.pos;
        this.pos = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
