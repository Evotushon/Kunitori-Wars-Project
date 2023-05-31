package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcca implements zzpt {
    private final zzbdv zzeiw;

    zzcca(zzbdv zzbdv) {
        this.zzeiw = zzbdv;
    }

    public final void zza(zzpu zzpu) {
        zzbdv zzbdv = this.zzeiw;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", zzpu.zzbnz ? "1" : "0");
        zzbdv.zza("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }
}
