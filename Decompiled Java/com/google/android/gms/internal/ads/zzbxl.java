package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxl implements zzeej<zzbxi> {
    private final zzeew<zzbzg> zzfgl;
    private final zzeew<Map<String, zzcly<zzbnl>>> zzfhy;
    private final zzeew<zzbng<zzblg>> zzfmq;
    private final zzeew<Map<String, zzcly<zzbyo>>> zzfms;
    private final zzeew<Map<String, zzcoe<zzbyo>>> zzfmt;

    public zzbxl(zzeew<Map<String, zzcly<zzbnl>>> zzeew, zzeew<Map<String, zzcly<zzbyo>>> zzeew2, zzeew<Map<String, zzcoe<zzbyo>>> zzeew3, zzeew<zzbng<zzblg>> zzeew4, zzeew<zzbzg> zzeew5) {
        this.zzfhy = zzeew;
        this.zzfms = zzeew2;
        this.zzfmt = zzeew3;
        this.zzfmq = zzeew4;
        this.zzfgl = zzeew5;
    }

    public final /* synthetic */ Object get() {
        return new zzbxi(this.zzfhy.get(), this.zzfms.get(), this.zzfmt.get(), this.zzfmq, this.zzfgl.get());
    }
}
