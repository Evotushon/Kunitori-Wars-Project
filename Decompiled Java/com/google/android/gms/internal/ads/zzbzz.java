package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzz implements zzeej<zzbzv> {
    private final zzeew<zzbzd> zzenm;
    private final zzeew<zzcad> zzepx;
    private final zzeew<zzbyu> zzepz;
    private final zzeew<zzawh> zzerc;
    private final zzeew<Executor> zzfev;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<zzbyz> zzfnw;

    private zzbzz(zzeew<zzawh> zzeew, zzeew<zzdeu> zzeew2, zzeew<zzbzd> zzeew3, zzeew<zzbyz> zzeew4, zzeew<zzcad> zzeew5, zzeew<Executor> zzeew6, zzeew<Executor> zzeew7, zzeew<zzbyu> zzeew8) {
        this.zzerc = zzeew;
        this.zzfgu = zzeew2;
        this.zzenm = zzeew3;
        this.zzfnw = zzeew4;
        this.zzepx = zzeew5;
        this.zzfgm = zzeew6;
        this.zzfev = zzeew7;
        this.zzepz = zzeew8;
    }

    public static zzbzz zza(zzeew<zzawh> zzeew, zzeew<zzdeu> zzeew2, zzeew<zzbzd> zzeew3, zzeew<zzbyz> zzeew4, zzeew<zzcad> zzeew5, zzeew<Executor> zzeew6, zzeew<Executor> zzeew7, zzeew<zzbyu> zzeew8) {
        return new zzbzz(zzeew, zzeew2, zzeew3, zzeew4, zzeew5, zzeew6, zzeew7, zzeew8);
    }

    public final /* synthetic */ Object get() {
        return new zzbzv(this.zzerc.get(), this.zzfgu.get(), this.zzenm.get(), this.zzfnw.get(), this.zzepx.get(), this.zzfgm.get(), this.zzfev.get(), this.zzepz.get());
    }
}
