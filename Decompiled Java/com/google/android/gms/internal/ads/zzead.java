package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzead implements zzeae {
    zzead() {
    }

    public final Map<?, ?> zzar(Object obj) {
        return (zzeab) obj;
    }

    public final zzeac<?, ?> zzas(Object obj) {
        zzdzz zzdzz = (zzdzz) obj;
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> zzat(Object obj) {
        return (zzeab) obj;
    }

    public final boolean zzau(Object obj) {
        return !((zzeab) obj).isMutable();
    }

    public final Object zzav(Object obj) {
        ((zzeab) obj).zzban();
        return obj;
    }

    public final Object zzaw(Object obj) {
        return zzeab.zzbdz().zzbea();
    }

    public final Object zze(Object obj, Object obj2) {
        zzeab zzeab = (zzeab) obj;
        zzeab zzeab2 = (zzeab) obj2;
        if (!zzeab2.isEmpty()) {
            if (!zzeab.isMutable()) {
                zzeab = zzeab.zzbea();
            }
            zzeab.zza(zzeab2);
        }
        return zzeab;
    }

    public final int zzb(int i, Object obj, Object obj2) {
        zzeab zzeab = (zzeab) obj;
        zzdzz zzdzz = (zzdzz) obj2;
        if (zzeab.isEmpty()) {
            return 0;
        }
        Iterator it = zzeab.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
