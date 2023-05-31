package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxj implements zzeej<zzcxg> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzcrq> zzelp;
    private final zzeew<zzdoe> zzfev;
    private final zzeew<String> zzffj;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<ScheduledExecutorService> zzfst;
    private final zzeew<zzcro> zzgeb;

    private zzcxj(zzeew<zzdoe> zzeew, zzeew<ScheduledExecutorService> zzeew2, zzeew<String> zzeew3, zzeew<zzcrq> zzeew4, zzeew<Context> zzeew5, zzeew<zzdeu> zzeew6, zzeew<zzcro> zzeew7) {
        this.zzfev = zzeew;
        this.zzfst = zzeew2;
        this.zzffj = zzeew3;
        this.zzelp = zzeew4;
        this.zzelc = zzeew5;
        this.zzfgu = zzeew6;
        this.zzgeb = zzeew7;
    }

    public static zzcxj zza(zzeew<zzdoe> zzeew, zzeew<ScheduledExecutorService> zzeew2, zzeew<String> zzeew3, zzeew<zzcrq> zzeew4, zzeew<Context> zzeew5, zzeew<zzdeu> zzeew6, zzeew<zzcro> zzeew7) {
        return new zzcxj(zzeew, zzeew2, zzeew3, zzeew4, zzeew5, zzeew6, zzeew7);
    }

    public final /* synthetic */ Object get() {
        return new zzcxg(this.zzfev.get(), this.zzfst.get(), this.zzffj.get(), this.zzelp.get(), this.zzelc.get(), this.zzfgu.get(), this.zzgeb.get());
    }
}
