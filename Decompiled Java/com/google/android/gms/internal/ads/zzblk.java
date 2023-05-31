package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzblk implements zzeej<zzbli> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzbuz> zzeox;
    private final zzeew<zzbne> zzepn;
    private final zzeew<zzcrz> zzezd;
    private final zzeew<View> zzfec;
    private final zzeew<zzdeh> zzfgi;
    private final zzeew<zzbdv> zzfgj;
    private final zzeew<zzbnc> zzfgk;
    private final zzeew<zzbzg> zzfgl;
    private final zzeew<Executor> zzfgm;

    public zzblk(zzeew<zzbne> zzeew, zzeew<Context> zzeew2, zzeew<zzdeh> zzeew3, zzeew<View> zzeew4, zzeew<zzbdv> zzeew5, zzeew<zzbnc> zzeew6, zzeew<zzbzg> zzeew7, zzeew<zzbuz> zzeew8, zzeew<zzcrz> zzeew9, zzeew<Executor> zzeew10) {
        this.zzepn = zzeew;
        this.zzelc = zzeew2;
        this.zzfgi = zzeew3;
        this.zzfec = zzeew4;
        this.zzfgj = zzeew5;
        this.zzfgk = zzeew6;
        this.zzfgl = zzeew7;
        this.zzeox = zzeew8;
        this.zzezd = zzeew9;
        this.zzfgm = zzeew10;
    }

    public static zzbli zza(zzbne zzbne, Context context, zzdeh zzdeh, View view, zzbdv zzbdv, zzbnc zzbnc, zzbzg zzbzg, zzbuz zzbuz, zzeed<zzcrz> zzeed, Executor executor) {
        return new zzbli(zzbne, context, zzdeh, view, zzbdv, zzbnc, zzbzg, zzbuz, zzeed, executor);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzepn.get(), this.zzelc.get(), this.zzfgi.get(), this.zzfec.get(), this.zzfgj.get(), this.zzfgk.get(), this.zzfgl.get(), this.zzeox.get(), zzeek.zzar(this.zzezd), this.zzfgm.get());
    }
}
