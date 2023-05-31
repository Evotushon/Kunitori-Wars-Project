package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbae implements zzdnu<T> {
    private final /* synthetic */ zzbab zzdxz;

    zzbae(zzbab zzbab) {
        this.zzdxz = zzbab;
    }

    public final void onSuccess(@Nullable T t) {
        this.zzdxz.zzdxw.set(1);
    }

    public final void zzb(Throwable th) {
        this.zzdxz.zzdxw.set(-1);
    }
}
