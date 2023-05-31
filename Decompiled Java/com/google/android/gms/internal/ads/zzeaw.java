package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzeaw {
    private static final zzeaw zzhvz = new zzeaw();
    private final zzebg zzhwa = new zzdzy();
    private final ConcurrentMap<Class<?>, zzebd<?>> zzhwb = new ConcurrentHashMap();

    public static zzeaw zzbem() {
        return zzhvz;
    }

    public final <T> zzebd<T> zzh(Class<T> cls) {
        zzdzc.zza(cls, "messageType");
        zzebd<T> zzebd = (zzebd) this.zzhwb.get(cls);
        if (zzebd != null) {
            return zzebd;
        }
        zzebd<T> zzg = this.zzhwa.zzg(cls);
        zzdzc.zza(cls, "messageType");
        zzdzc.zza(zzg, "schema");
        zzebd<T> putIfAbsent = this.zzhwb.putIfAbsent(cls, zzg);
        return putIfAbsent != null ? putIfAbsent : zzg;
    }

    public final <T> zzebd<T> zzba(T t) {
        return zzh(t.getClass());
    }

    private zzeaw() {
    }
}
