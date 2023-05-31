package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbof implements zzdnu<zzaqx> {
    private final /* synthetic */ zzbod zzfiz;

    zzbof(zzbod zzbod) {
        this.zzfiz = zzbod;
    }

    public final void zzb(Throwable th) {
        this.zzfiz.zzfiv.zzbg(false);
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        zzaqx zzaqx = (zzaqx) obj;
        this.zzfiz.zzfiv.zzbg(true);
    }
}
