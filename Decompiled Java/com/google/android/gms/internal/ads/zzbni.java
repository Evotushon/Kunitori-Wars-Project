package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbni<AdT> implements zzeej<zzbnj<AdT>> {
    private final zzeew<Map<String, zzcly<AdT>>> zzfhy;

    private zzbni(zzeew<Map<String, zzcly<AdT>>> zzeew) {
        this.zzfhy = zzeew;
    }

    public static <AdT> zzbni<AdT> zzd(zzeew<Map<String, zzcly<AdT>>> zzeew) {
        return new zzbni<>(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbnj(this.zzfhy.get());
    }
}
