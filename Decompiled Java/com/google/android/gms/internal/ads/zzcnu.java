package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnu implements zzeej<zzcnp> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzffi;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<zzceb> zzfrj;
    private final zzeew<zzbwt> zzgbg;

    public zzcnu(zzeew<Context> zzeew, zzeew<zzazo> zzeew2, zzeew<zzdeu> zzeew3, zzeew<Executor> zzeew4, zzeew<zzbwt> zzeew5, zzeew<zzceb> zzeew6) {
        this.zzelc = zzeew;
        this.zzffi = zzeew2;
        this.zzfgu = zzeew3;
        this.zzfgm = zzeew4;
        this.zzgbg = zzeew5;
        this.zzfrj = zzeew6;
    }

    public final /* synthetic */ Object get() {
        return new zzcnp(this.zzelc.get(), this.zzffi.get(), this.zzfgu.get(), this.zzfgm.get(), this.zzgbg.get(), this.zzfrj.get());
    }
}
