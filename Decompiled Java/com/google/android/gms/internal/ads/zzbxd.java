package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxd implements zzeej<zzbxa> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzfda;
    private final zzeew<Integer> zzffj;
    private final zzeew<zzbdv> zzfgj;
    private final zzeew<zzdei> zzfhn;

    private zzbxd(zzeew<Context> zzeew, zzeew<zzbdv> zzeew2, zzeew<zzdei> zzeew3, zzeew<zzazo> zzeew4, zzeew<Integer> zzeew5) {
        this.zzelc = zzeew;
        this.zzfgj = zzeew2;
        this.zzfhn = zzeew3;
        this.zzfda = zzeew4;
        this.zzffj = zzeew5;
    }

    public static zzbxd zzc(zzeew<Context> zzeew, zzeew<zzbdv> zzeew2, zzeew<zzdei> zzeew3, zzeew<zzazo> zzeew4, zzeew<Integer> zzeew5) {
        return new zzbxd(zzeew, zzeew2, zzeew3, zzeew4, zzeew5);
    }

    public final /* synthetic */ Object get() {
        return new zzbxa(this.zzelc.get(), this.zzfgj.get(), this.zzfhn.get(), this.zzfda.get(), this.zzffj.get().intValue());
    }
}
