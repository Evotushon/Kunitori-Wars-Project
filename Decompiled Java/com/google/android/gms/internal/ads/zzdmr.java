package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdmr<V, X extends Throwable> extends zzdms<V, X, zzdng<? super X, ? extends V>, zzdof<? extends V>> {
    zzdmr(zzdof<? extends V> zzdof, Class<X> cls, zzdng<? super X, ? extends V> zzdng) {
        super(zzdof, cls, zzdng);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdof) obj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        zzdng zzdng = (zzdng) obj;
        zzdof zzf = zzdng.zzf(th);
        zzdlg.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzdng);
        return zzf;
    }
}
