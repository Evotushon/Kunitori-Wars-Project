package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpi implements zzeej<zzdku<zzdei, zzaxg>> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzfda;
    private final zzeew<zzdeu> zzfgu;

    public zzbpi(zzeew<Context> zzeew, zzeew<zzazo> zzeew2, zzeew<zzdeu> zzeew3) {
        this.zzelc = zzeew;
        this.zzfda = zzeew2;
        this.zzfgu = zzeew3;
    }

    public final /* synthetic */ Object get() {
        return (zzdku) zzeep.zza(new zzbpj(this.zzelc.get(), this.zzfda.get(), this.zzfgu.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
