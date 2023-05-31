package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdcc implements zzdnu<Void> {
    zzdcc(zzdbx zzdbx) {
    }

    public final void zzb(Throwable th) {
        zzawf.zzee("Notification of cache hit failed.");
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        zzawf.zzee("Notification of cache hit successful.");
    }
}
