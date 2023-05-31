package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcce implements zzeej<zzcbt> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<zzceb> zzfrj;

    public zzcce(zzeew<Context> zzeew, zzeew<zzdeu> zzeew2, zzeew<Executor> zzeew3, zzeew<zzceb> zzeew4) {
        this.zzelc = zzeew;
        this.zzfgu = zzeew2;
        this.zzfgm = zzeew3;
        this.zzfrj = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return new zzcbt(this.zzelc.get(), this.zzfgu.get(), this.zzfgm.get(), this.zzfrj.get());
    }
}
