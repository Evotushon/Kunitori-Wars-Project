package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdmu<V, X extends Throwable> extends zzdms<V, X, zzdku<? super X, ? extends V>, V> {
    zzdmu(zzdof<? extends V> zzdof, Class<X> cls, zzdku<? super X, ? extends V> zzdku) {
        super(zzdof, cls, zzdku);
    }

    /* access modifiers changed from: package-private */
    public final void setResult(@NullableDecl V v) {
        set(v);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        return ((zzdku) obj).apply(th);
    }
}
