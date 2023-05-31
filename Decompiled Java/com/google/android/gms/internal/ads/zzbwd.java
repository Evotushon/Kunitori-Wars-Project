package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwd implements zzeej<zzbuv<zzbrn>> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzfda;
    private final zzeew<zzdei> zzffh;
    private final zzeew<zzdeu> zzfgu;
    private final zzbvz zzfmc;

    private zzbwd(zzbvz zzbvz, zzeew<Context> zzeew, zzeew<zzazo> zzeew2, zzeew<zzdei> zzeew3, zzeew<zzdeu> zzeew4) {
        this.zzfmc = zzbvz;
        this.zzelc = zzeew;
        this.zzfda = zzeew2;
        this.zzffh = zzeew3;
        this.zzfgu = zzeew4;
    }

    public static zzbwd zza(zzbvz zzbvz, zzeew<Context> zzeew, zzeew<zzazo> zzeew2, zzeew<zzdei> zzeew3, zzeew<zzdeu> zzeew4) {
        return new zzbwd(zzbvz, zzeew, zzeew2, zzeew3, zzeew4);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(new zzbvy(this.zzelc.get(), this.zzfda.get(), this.zzffh.get(), this.zzfgu.get()), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
