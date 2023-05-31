package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcia implements zzeej<zzcho> {
    private final zzeew<zzcnk> zzekz;
    private final zzeew<zzcgy> zzelv;
    private final zzeew<Executor> zzfev;
    private final zzeew<zzazo> zzffi;
    private final zzeew<Executor> zzfgm;
    private final zzeew<ScheduledExecutorService> zzfst;
    private final zzeew<Context> zzfxf;
    private final zzeew<WeakReference<Context>> zzfxg;

    public zzcia(zzeew<Executor> zzeew, zzeew<Context> zzeew2, zzeew<WeakReference<Context>> zzeew3, zzeew<Executor> zzeew4, zzeew<zzcnk> zzeew5, zzeew<ScheduledExecutorService> zzeew6, zzeew<zzcgy> zzeew7, zzeew<zzazo> zzeew8) {
        this.zzfgm = zzeew;
        this.zzfxf = zzeew2;
        this.zzfxg = zzeew3;
        this.zzfev = zzeew4;
        this.zzekz = zzeew5;
        this.zzfst = zzeew6;
        this.zzelv = zzeew7;
        this.zzffi = zzeew8;
    }

    public final /* synthetic */ Object get() {
        return new zzcho(this.zzfgm.get(), this.zzfxf.get(), this.zzfxg.get(), this.zzfev.get(), this.zzekz.get(), this.zzfst.get(), this.zzelv.get(), this.zzffi.get());
    }
}
