package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzafu implements zzafz<zzbdv> {
    zzafu() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbdv zzbdv = (zzbdv) obj;
        if (map.keySet().contains("start")) {
            zzbdv.zzaaf().zzabf();
        } else if (map.keySet().contains("stop")) {
            zzbdv.zzaaf().zzabg();
        } else if (map.keySet().contains("cancel")) {
            zzbdv.zzaaf().zzabh();
        }
    }
}
