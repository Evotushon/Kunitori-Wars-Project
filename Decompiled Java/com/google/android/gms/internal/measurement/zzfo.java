package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.6.0 */
final class zzfo<K, V> extends zzfg<Map.Entry<K, V>> {
    private final transient zzfc<K, V> zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    private final transient int zzc = 0;
    /* access modifiers changed from: private */
    public final transient int zzd;

    zzfo(zzfc<K, V> zzfc, Object[] objArr, int i, int i2) {
        this.zza = zzfc;
        this.zzb = objArr;
        this.zzd = i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }

    public final zzfx<Map.Entry<K, V>> zza() {
        return (zzfx) zze().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zze().zza(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final zzfb<Map.Entry<K, V>> zzh() {
        return new zzfr(this);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zza.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.zzd;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
