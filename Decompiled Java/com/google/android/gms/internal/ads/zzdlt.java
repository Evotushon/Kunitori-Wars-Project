package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdlt<E> extends zzdlm<E> {
    private final zzdlr<E> zzhaf;

    zzdlt(zzdlr<E> zzdlr, int i) {
        super(zzdlr.size(), i);
        this.zzhaf = zzdlr;
    }

    /* access modifiers changed from: protected */
    public final E get(int i) {
        return this.zzhaf.get(i);
    }
}
