package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgl implements zzeej<zzcgi> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzcgx> zzelu;
    private final zzeew<zzcgq> zzerf;
    private final zzeew<zzdei> zzfeb;

    private zzcgl(zzeew<zzcgq> zzeew, zzeew<zzcgx> zzeew2, zzeew<zzdei> zzeew3, zzeew<Context> zzeew4) {
        this.zzerf = zzeew;
        this.zzelu = zzeew2;
        this.zzfeb = zzeew3;
        this.zzelc = zzeew4;
    }

    public static zzcgl zzc(zzeew<zzcgq> zzeew, zzeew<zzcgx> zzeew2, zzeew<zzdei> zzeew3, zzeew<Context> zzeew4) {
        return new zzcgl(zzeew, zzeew2, zzeew3, zzeew4);
    }

    public final /* synthetic */ Object get() {
        return new zzcgi(this.zzerf.get(), this.zzelu.get(), this.zzfeb.get(), this.zzelc.get());
    }
}
