package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcdg implements zzeej<zzcdf> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzazo> zzfkh;
    private final zzeew<zzdq> zzfnx;
    private final zzeew<zza> zzfsr;
    private final zzeew<zzbee> zzfty;

    public zzcdg(zzeew<Context> zzeew, zzeew<Executor> zzeew2, zzeew<zzdq> zzeew3, zzeew<zzazo> zzeew4, zzeew<zza> zzeew5, zzeew<zzbee> zzeew6) {
        this.zzelc = zzeew;
        this.zzfgm = zzeew2;
        this.zzfnx = zzeew3;
        this.zzfkh = zzeew4;
        this.zzfsr = zzeew5;
        this.zzfty = zzeew6;
    }

    public final /* synthetic */ Object get() {
        return new zzcdf(this.zzelc.get(), this.zzfgm.get(), this.zzfnx.get(), this.zzfkh.get(), this.zzfsr.get(), this.zzfty.get());
    }
}
