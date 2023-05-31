package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzboe implements zzdnu<Void> {
    private final /* synthetic */ zzbod zzfiz;

    zzboe(zzbod zzbod) {
        this.zzfiz = zzbod;
    }

    public final void zzb(Throwable th) {
        this.zzfiz.zzfiv.zzbh(false);
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        this.zzfiz.zzfiv.zzbh(true);
    }
}
