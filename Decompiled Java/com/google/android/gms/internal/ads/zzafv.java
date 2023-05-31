package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzafv implements zzafz<zzbdv> {
    zzafv() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbdv zzbdv = (zzbdv) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzbdv.zzka();
        } else if ("resume".equals(str)) {
            zzbdv.zzkb();
        }
    }
}
