package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdmy<I, O> extends zzdmv<I, O, zzdng<? super I, ? extends O>, zzdof<? extends O>> {
    zzdmy(zzdof<? extends I> zzdof, zzdng<? super I, ? extends O> zzdng) {
        super(zzdof, zzdng);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdof) obj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(Object obj, @NullableDecl Object obj2) throws Exception {
        zzdng zzdng = (zzdng) obj;
        zzdof zzf = zzdng.zzf(obj2);
        zzdlg.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzdng);
        return zzf;
    }
}
