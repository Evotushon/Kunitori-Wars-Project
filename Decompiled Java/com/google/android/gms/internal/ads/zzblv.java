package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzblv implements zzeej<zzbuv<zzbrn>> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzfda;
    private final zzeew<zzdei> zzffh;
    private final zzbln zzfgr;
    private final zzeew<zzdeu> zzfgu;

    public zzblv(zzbln zzbln, zzeew<Context> zzeew, zzeew<zzazo> zzeew2, zzeew<zzdei> zzeew3, zzeew<zzdeu> zzeew4) {
        this.zzfgr = zzbln;
        this.zzelc = zzeew;
        this.zzfda = zzeew2;
        this.zzffh = zzeew3;
        this.zzfgu = zzeew4;
    }

    public static zzbuv<zzbrn> zza(zzbln zzbln, Context context, zzazo zzazo, zzdei zzdei, zzdeu zzdeu) {
        return (zzbuv) zzeep.zza(new zzbuv(new zzblm(context, zzazo, zzdei, zzdeu), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfgr, this.zzelc.get(), this.zzfda.get(), this.zzffh.get(), this.zzfgu.get());
    }
}
