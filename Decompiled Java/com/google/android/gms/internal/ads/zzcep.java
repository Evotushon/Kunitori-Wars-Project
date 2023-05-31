package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcep implements zzeej<zzceb> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzfda;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<zzbsf> zzfgv;
    private final zzeew<zzdq> zzfnx;
    private final zzeew<zzsn> zzfss;
    private final zzeew<zzbee> zzfty;
    private final zzeew<zza> zzfup;
    private final zzeew<zzbvt> zzfuq;

    private zzcep(zzeew<zzbee> zzeew, zzeew<Context> zzeew2, zzeew<zzdeu> zzeew3, zzeew<zzdq> zzeew4, zzeew<zzazo> zzeew5, zzeew<zza> zzeew6, zzeew<zzsn> zzeew7, zzeew<zzbsf> zzeew8, zzeew<zzbvt> zzeew9) {
        this.zzfty = zzeew;
        this.zzelc = zzeew2;
        this.zzfgu = zzeew3;
        this.zzfnx = zzeew4;
        this.zzfda = zzeew5;
        this.zzfup = zzeew6;
        this.zzfss = zzeew7;
        this.zzfgv = zzeew8;
        this.zzfuq = zzeew9;
    }

    public static zzcep zza(zzeew<zzbee> zzeew, zzeew<Context> zzeew2, zzeew<zzdeu> zzeew3, zzeew<zzdq> zzeew4, zzeew<zzazo> zzeew5, zzeew<zza> zzeew6, zzeew<zzsn> zzeew7, zzeew<zzbsf> zzeew8, zzeew<zzbvt> zzeew9) {
        return new zzcep(zzeew, zzeew2, zzeew3, zzeew4, zzeew5, zzeew6, zzeew7, zzeew8, zzeew9);
    }

    public final /* synthetic */ Object get() {
        return new zzceb(this.zzfty.get(), this.zzelc.get(), this.zzfgu.get(), this.zzfnx.get(), this.zzfda.get(), this.zzfup.get(), this.zzfss.get(), this.zzfgv.get(), this.zzfuq.get());
    }
}
