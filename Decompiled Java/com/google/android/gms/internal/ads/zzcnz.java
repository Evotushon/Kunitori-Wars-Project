package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnz implements zzeej<zzcnx> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzffi;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzbwt> zzgbg;

    public zzcnz(zzeew<Context> zzeew, zzeew<zzazo> zzeew2, zzeew<zzbwt> zzeew3, zzeew<Executor> zzeew4) {
        this.zzelc = zzeew;
        this.zzffi = zzeew2;
        this.zzgbg = zzeew3;
        this.zzfgm = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return new zzcnx(this.zzelc.get(), this.zzffi.get(), this.zzgbg.get(), this.zzfgm.get());
    }
}
