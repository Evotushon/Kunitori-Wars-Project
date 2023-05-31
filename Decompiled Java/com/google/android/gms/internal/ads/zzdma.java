package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdma extends zzdmm<T> {
    private boolean zzhan;
    private final /* synthetic */ Object zzhao;

    zzdma(Object obj) {
        this.zzhao = obj;
    }

    public final boolean hasNext() {
        return !this.zzhan;
    }

    public final T next() {
        if (!this.zzhan) {
            this.zzhan = true;
            return this.zzhao;
        }
        throw new NoSuchElementException();
    }
}
