package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcbn implements zzeej<zzcbc> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzcax> zzeut;
    private final zzeew<zzcbt> zzeuv;
    private final zzeew<zzazo> zzfda;
    private final zzeew<Executor> zzfev;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<zzdq> zzfnx;
    private final zzeew<zza> zzfsr;
    private final zzeew<zzsn> zzfss;
    private final zzeew<ScheduledExecutorService> zzfst;

    public zzcbn(zzeew<Context> zzeew, zzeew<zzcax> zzeew2, zzeew<zzdq> zzeew3, zzeew<zzazo> zzeew4, zzeew<zza> zzeew5, zzeew<zzsn> zzeew6, zzeew<Executor> zzeew7, zzeew<zzdeu> zzeew8, zzeew<zzcbt> zzeew9, zzeew<ScheduledExecutorService> zzeew10) {
        this.zzelc = zzeew;
        this.zzeut = zzeew2;
        this.zzfnx = zzeew3;
        this.zzfda = zzeew4;
        this.zzfsr = zzeew5;
        this.zzfss = zzeew6;
        this.zzfev = zzeew7;
        this.zzfgu = zzeew8;
        this.zzeuv = zzeew9;
        this.zzfst = zzeew10;
    }

    public final /* synthetic */ Object get() {
        return new zzcbc(this.zzelc.get(), this.zzeut.get(), this.zzfnx.get(), this.zzfda.get(), this.zzfsr.get(), this.zzfss.get(), this.zzfev.get(), this.zzfgu.get(), this.zzeuv.get(), this.zzfst.get());
    }
}
