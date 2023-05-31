package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzdzz<K, V> {
    static <K, V> void zza(zzdyi zzdyi, zzeac<K, V> zzeac, K k, V v) throws IOException {
        zzdyp.zza(zzdyi, zzeac.zzhuz, 1, k);
        zzdyp.zza(zzdyi, zzeac.zzhvb, 2, v);
    }

    static <K, V> int zza(zzeac<K, V> zzeac, K k, V v) {
        return zzdyp.zza(zzeac.zzhuz, 1, k) + zzdyp.zza(zzeac.zzhvb, 2, v);
    }
}
