package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zzxz implements InitializationStatus {
    private final zzxu zzcfr;

    zzxz(zzxu zzxu) {
        this.zzcfr = zzxu;
    }

    public final Map getAdapterStatusMap() {
        zzxu zzxu = this.zzcfr;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new zzxy(zzxu));
        return hashMap;
    }
}
