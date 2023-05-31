package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdmx<I, O> extends zzdmv<I, O, zzdku<? super I, ? extends O>, O> {
    zzdmx(zzdof<? extends I> zzdof, zzdku<? super I, ? extends O> zzdku) {
        super(zzdof, zzdku);
    }

    /* access modifiers changed from: package-private */
    public final void setResult(@NullableDecl O o) {
        set(o);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public final /* synthetic */ Object zzc(Object obj, @NullableDecl Object obj2) throws Exception {
        return ((zzdku) obj).apply(obj2);
    }
}
