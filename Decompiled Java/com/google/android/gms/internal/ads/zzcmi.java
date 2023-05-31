package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcmi implements zzeej<zzcme> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<zzceb> zzfrj;
    private final zzeew<zzbku> zzgbg;

    public zzcmi(zzeew<zzbku> zzeew, zzeew<Context> zzeew2, zzeew<Executor> zzeew3, zzeew<zzceb> zzeew4, zzeew<zzdeu> zzeew5) {
        this.zzgbg = zzeew;
        this.zzelc = zzeew2;
        this.zzfgm = zzeew3;
        this.zzfrj = zzeew4;
        this.zzfgu = zzeew5;
    }

    public final /* synthetic */ Object get() {
        return new zzcme(this.zzgbg.get(), this.zzelc.get(), this.zzfgm.get(), this.zzfrj.get(), this.zzfgu.get());
    }
}
