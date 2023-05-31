package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwj implements zzeej<zzauf> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdeu> zzfgu;
    private final zzbvz zzfmc;

    private zzbwj(zzbvz zzbvz, zzeew<Context> zzeew, zzeew<zzdeu> zzeew2) {
        this.zzfmc = zzbvz;
        this.zzelc = zzeew;
        this.zzfgu = zzeew2;
    }

    public static zzbwj zza(zzbvz zzbvz, zzeew<Context> zzeew, zzeew<zzdeu> zzeew2) {
        return new zzbwj(zzbvz, zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzauf) zzeep.zza(new zzauf(this.zzelc.get(), this.zzfgu.get().zzgqr), "Cannot return null from a non-@Nullable @Provides method");
    }
}
