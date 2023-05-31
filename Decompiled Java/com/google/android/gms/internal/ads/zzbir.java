package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbir implements zzeej<zzdjh> {
    private final zzeew<Context> zzelc;

    public zzbir(zzeew<Context> zzeew) {
        this.zzelc = zzeew;
    }

    public final /* synthetic */ Object get() {
        return (zzdjh) zzeep.zza(new zzdjh(this.zzelc.get(), zzq.zzlj().zzxg()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
