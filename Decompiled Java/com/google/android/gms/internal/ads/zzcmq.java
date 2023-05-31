package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcmq implements zzeej<zzcml> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<zzceb> zzfrj;
    private final zzeew<zzbmc> zzgbg;
    private final zzeew<zzdku<zzdei, zzaxg>> zzgbl;

    public zzcmq(zzeew<zzbmc> zzeew, zzeew<Context> zzeew2, zzeew<Executor> zzeew3, zzeew<zzceb> zzeew4, zzeew<zzdeu> zzeew5, zzeew<zzdku<zzdei, zzaxg>> zzeew6) {
        this.zzgbg = zzeew;
        this.zzelc = zzeew2;
        this.zzfgm = zzeew3;
        this.zzfrj = zzeew4;
        this.zzfgu = zzeew5;
        this.zzgbl = zzeew6;
    }

    public final /* synthetic */ Object get() {
        return new zzcml(this.zzgbg.get(), this.zzelc.get(), this.zzfgm.get(), this.zzfrj.get(), this.zzfgu.get(), this.zzgbl.get());
    }
}
