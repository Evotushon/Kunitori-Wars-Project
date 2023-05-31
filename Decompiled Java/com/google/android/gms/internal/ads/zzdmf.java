package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdmf<K> extends zzdly<K> {
    private final transient zzdlr<K> zzhaf;
    private final transient zzdlv<K, ?> zzhar;

    zzdmf(zzdlv<K, ?> zzdlv, zzdlr<K> zzdlr) {
        this.zzhar = zzdlv;
        this.zzhaf = zzdlr;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaub() {
        return true;
    }

    public final zzdmm<K> zzatw() {
        return (zzdmm) zzaua().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzaua().zza(objArr, i);
    }

    public final zzdlr<K> zzaua() {
        return this.zzhaf;
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.zzhar.get(obj) != null;
    }

    public final int size() {
        return this.zzhar.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
