package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbad implements zzdnu<T> {
    private final /* synthetic */ zzbac zzdxx;
    private final /* synthetic */ zzbaa zzdxy;

    zzbad(zzbab zzbab, zzbac zzbac, zzbaa zzbaa) {
        this.zzdxx = zzbac;
        this.zzdxy = zzbaa;
    }

    public final void onSuccess(@Nullable T t) {
        this.zzdxx.zzh(t);
    }

    public final void zzb(Throwable th) {
        this.zzdxy.run();
    }
}
