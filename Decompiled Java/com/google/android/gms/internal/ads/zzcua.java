package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcua implements zzeej<zzcty> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzcvg<zzcyh>> zzemh;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<zzavr> zzgic;

    private zzcua(zzeew<zzcvg<zzcyh>> zzeew, zzeew<zzdeu> zzeew2, zzeew<Context> zzeew3, zzeew<zzavr> zzeew4) {
        this.zzemh = zzeew;
        this.zzfgu = zzeew2;
        this.zzelc = zzeew3;
        this.zzgic = zzeew4;
    }

    public static zzcua zzf(zzeew<zzcvg<zzcyh>> zzeew, zzeew<zzdeu> zzeew2, zzeew<Context> zzeew3, zzeew<zzavr> zzeew4) {
        return new zzcua(zzeew, zzeew2, zzeew3, zzeew4);
    }

    public final /* synthetic */ Object get() {
        return new zzcty(this.zzemh.get(), this.zzfgu.get(), this.zzelc.get(), this.zzgic.get());
    }
}
