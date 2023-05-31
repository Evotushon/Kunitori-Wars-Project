package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdiu implements zzeej<zzdis> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazl> zzelt;
    private final zzeew<zzdep> zzfbm;
    private final zzeew<zzdq> zzfed;
    private final zzeew<Executor> zzfev;
    private final zzeew<Clock> zzfex;
    private final zzeew<zzazo> zzffi;
    private final zzeew<String> zzgin;
    private final zzeew<String> zzgio;
    private final zzeew<zzcpc> zzgwh;

    private zzdiu(zzeew<Executor> zzeew, zzeew<zzazl> zzeew2, zzeew<zzcpc> zzeew3, zzeew<zzazo> zzeew4, zzeew<String> zzeew5, zzeew<String> zzeew6, zzeew<Context> zzeew7, zzeew<zzdep> zzeew8, zzeew<Clock> zzeew9, zzeew<zzdq> zzeew10) {
        this.zzfev = zzeew;
        this.zzelt = zzeew2;
        this.zzgwh = zzeew3;
        this.zzffi = zzeew4;
        this.zzgin = zzeew5;
        this.zzgio = zzeew6;
        this.zzelc = zzeew7;
        this.zzfbm = zzeew8;
        this.zzfex = zzeew9;
        this.zzfed = zzeew10;
    }

    public static zzdiu zzb(zzeew<Executor> zzeew, zzeew<zzazl> zzeew2, zzeew<zzcpc> zzeew3, zzeew<zzazo> zzeew4, zzeew<String> zzeew5, zzeew<String> zzeew6, zzeew<Context> zzeew7, zzeew<zzdep> zzeew8, zzeew<Clock> zzeew9, zzeew<zzdq> zzeew10) {
        return new zzdiu(zzeew, zzeew2, zzeew3, zzeew4, zzeew5, zzeew6, zzeew7, zzeew8, zzeew9, zzeew10);
    }

    public final /* synthetic */ Object get() {
        return new zzdis(this.zzfev.get(), this.zzelt.get(), this.zzgwh.get(), this.zzffi.get(), this.zzgin.get(), this.zzgio.get(), this.zzelc.get(), this.zzfbm.get(), this.zzfex.get(), this.zzfed.get());
    }
}
