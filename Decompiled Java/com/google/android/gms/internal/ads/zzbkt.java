package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkt implements zzeej<View> {
    private final zzbkq zzffu;

    public zzbkt(zzbkq zzbkq) {
        this.zzffu = zzbkq;
    }

    public static View zza(zzbkq zzbkq) {
        return (View) zzeep.zza(zzbkq.zzagd(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzffu);
    }
}
