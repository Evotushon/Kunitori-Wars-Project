package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeel<K, V> extends zzeeg<K, V, V> {
    private static final zzeew<Map<Object, Object>> zzigk = zzeem.zzbe(Collections.emptyMap());

    public static <K, V> zzeen<K, V> zzhm(int i) {
        return new zzeen<>(i);
    }

    private zzeel(Map<K, zzeew<V>> map) {
        super(map);
    }

    public final /* synthetic */ Object get() {
        LinkedHashMap zzhk = zzeei.zzhk(zzbgm().size());
        for (Map.Entry entry : zzbgm().entrySet()) {
            zzhk.put(entry.getKey(), ((zzeew) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(zzhk);
    }
}
