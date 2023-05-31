package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdzo<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzdzm> zzhuj;

    private zzdzo(Map.Entry<K, zzdzm> entry) {
        this.zzhuj = entry;
    }

    public final K getKey() {
        return this.zzhuj.getKey();
    }

    public final Object getValue() {
        if (this.zzhuj.getValue() == null) {
            return null;
        }
        return zzdzm.zzbds();
    }

    public final zzdzm zzbdt() {
        return this.zzhuj.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzeah) {
            return this.zzhuj.getValue().zzn((zzeah) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
