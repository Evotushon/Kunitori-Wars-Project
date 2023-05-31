package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdmd<K, V> extends zzdly<Map.Entry<K, V>> {
    /* access modifiers changed from: private */
    public final transient int size;
    private final transient zzdlv<K, V> zzhar;
    /* access modifiers changed from: private */
    public final transient Object[] zzhas;
    private final transient int zzhat = 0;

    zzdmd(zzdlv<K, V> zzdlv, Object[] objArr, int i, int i2) {
        this.zzhar = zzdlv;
        this.zzhas = objArr;
        this.size = i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaub() {
        return true;
    }

    public final zzdmm<Map.Entry<K, V>> zzatw() {
        return (zzdmm) zzaua().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzaua().zza(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final zzdlr<Map.Entry<K, V>> zzaui() {
        return new zzdmg(this);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zzhar.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.size;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
