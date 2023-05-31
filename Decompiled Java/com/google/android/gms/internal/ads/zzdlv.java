package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public abstract class zzdlv<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zzhag = new Map.Entry[0];
    private transient zzdly<Map.Entry<K, V>> zzhah;
    private transient zzdly<K> zzhai;
    private transient zzdlq<V> zzhaj;

    public static <K, V> zzdlv<K, V> zza(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        zzdll.zzb(k, v);
        zzdll.zzb(k2, v2);
        zzdll.zzb(k3, v3);
        zzdll.zzb(k4, v4);
        zzdll.zzb(k5, v5);
        return zzdme.zzc(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public abstract V get(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    public abstract zzdly<Map.Entry<K, V>> zzaud();

    /* access modifiers changed from: package-private */
    public abstract zzdly<K> zzaue();

    /* access modifiers changed from: package-private */
    public abstract zzdlq<V> zzauf();

    zzdlv() {
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzdlq) values()).contains(obj);
    }

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public int hashCode() {
        return zzdmk.zzg((zzdly) entrySet());
    }

    public String toString() {
        int size = size();
        zzdll.zze(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ Set entrySet() {
        zzdly<Map.Entry<K, V>> zzdly = this.zzhah;
        if (zzdly != null) {
            return zzdly;
        }
        zzdly<Map.Entry<K, V>> zzaud = zzaud();
        this.zzhah = zzaud;
        return zzaud;
    }

    public /* synthetic */ Collection values() {
        zzdlq<V> zzdlq = this.zzhaj;
        if (zzdlq != null) {
            return zzdlq;
        }
        zzdlq<V> zzauf = zzauf();
        this.zzhaj = zzauf;
        return zzauf;
    }

    public /* synthetic */ Set keySet() {
        zzdly<K> zzdly = this.zzhai;
        if (zzdly != null) {
            return zzdly;
        }
        zzdly<K> zzaue = zzaue();
        this.zzhai = zzaue;
        return zzaue;
    }
}
