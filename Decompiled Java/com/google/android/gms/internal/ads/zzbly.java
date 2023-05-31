package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbly implements zzeej<zzauf> {
    private final zzeew<Context> zzelc;
    private final zzbln zzfgr;
    private final zzeew<zzdeu> zzfgu;

    public zzbly(zzbln zzbln, zzeew<Context> zzeew, zzeew<zzdeu> zzeew2) {
        this.zzfgr = zzbln;
        this.zzelc = zzeew;
        this.zzfgu = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return (zzauf) zzeep.zza(new zzauf(this.zzelc.get(), this.zzfgu.get().zzgqr), "Cannot return null from a non-@Nullable @Provides method");
    }
}
