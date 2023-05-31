package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzeef<K, V, V2> {
    final LinkedHashMap<K, zzeew<V>> zzigf;

    zzeef(int i) {
        this.zzigf = zzeei.zzhk(i);
    }

    /* access modifiers changed from: package-private */
    public zzeef<K, V, V2> zza(K k, zzeew<V> zzeew) {
        this.zzigf.put(zzeep.zza(k, "key"), zzeep.zza(zzeew, "provider"));
        return this;
    }
}
