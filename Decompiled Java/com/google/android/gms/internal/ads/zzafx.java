package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzafx implements zzafz<zzbdv> {
    zzafx() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbdv zzbdv = (zzbdv) obj;
        if (map.keySet().contains("start")) {
            zzbdv.zzaz(true);
        }
        if (map.keySet().contains("stop")) {
            zzbdv.zzaz(false);
        }
    }
}
