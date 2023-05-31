package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcls implements zzeej<zzclr> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzclk> zzerm;
    private final zzeew<zzcle> zzety;
    private final zzeew<zzbpm> zzgas;

    private zzcls(zzeew<Context> zzeew, zzeew<zzbpm> zzeew2, zzeew<zzclk> zzeew3, zzeew<zzcle> zzeew4) {
        this.zzelc = zzeew;
        this.zzgas = zzeew2;
        this.zzerm = zzeew3;
        this.zzety = zzeew4;
    }

    public static zzcls zzd(zzeew<Context> zzeew, zzeew<zzbpm> zzeew2, zzeew<zzclk> zzeew3, zzeew<zzcle> zzeew4) {
        return new zzcls(zzeew, zzeew2, zzeew3, zzeew4);
    }

    public final /* synthetic */ Object get() {
        return new zzclr(this.zzelc.get(), this.zzgas.get(), this.zzerm.get(), this.zzety.get());
    }
}
