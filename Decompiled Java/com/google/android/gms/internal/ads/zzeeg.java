package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
abstract class zzeeg<K, V, V2> implements zzeej<Map<K, V2>> {
    private final Map<K, zzeew<V>> zzigg;

    zzeeg(Map<K, zzeew<V>> map) {
        this.zzigg = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, zzeew<V>> zzbgm() {
        return this.zzigg;
    }
}
