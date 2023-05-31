package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnc implements zzeej<zzcnb> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzbwt> zzgbg;
    private final zzeew<zzdeg> zzgbw;

    public zzcnc(zzeew<Context> zzeew, zzeew<Executor> zzeew2, zzeew<zzbwt> zzeew3, zzeew<zzdeg> zzeew4) {
        this.zzelc = zzeew;
        this.zzfgm = zzeew2;
        this.zzgbg = zzeew3;
        this.zzgbw = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return new zzcnb(this.zzelc.get(), this.zzfgm.get(), this.zzgbg.get(), this.zzgbw.get());
    }
}
