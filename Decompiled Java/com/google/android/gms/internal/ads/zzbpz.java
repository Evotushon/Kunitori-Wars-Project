package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpt;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpz implements zzeej<zzbpt.zza> {
    private final zzbpt zzfkc;

    private zzbpz(zzbpt zzbpt) {
        this.zzfkc = zzbpt;
    }

    public static zzbpz zzl(zzbpt zzbpt) {
        return new zzbpz(zzbpt);
    }

    public final /* synthetic */ Object get() {
        return (zzbpt.zza) zzeep.zza(this.zzfkc.zzahu(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
