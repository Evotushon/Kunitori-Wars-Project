package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdmh<E> extends zzdly<E> {
    static final zzdmh<Object> zzhax = new zzdmh(new Object[0], 0, (Object[]) null, 0, 0);
    private final transient int mask;
    private final transient int size;
    private final transient int zzagg;
    private final transient Object[] zzhay;
    private final transient Object[] zzhaz;

    zzdmh(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzhay = objArr;
        this.zzhaz = objArr2;
        this.mask = i2;
        this.zzagg = i;
        this.size = i3;
    }

    /* access modifiers changed from: package-private */
    public final int zzaty() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaub() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzauh() {
        return true;
    }

    public final boolean contains(@NullableDecl Object obj) {
        int i;
        Object[] objArr = this.zzhaz;
        if (obj == null || objArr == null) {
            return false;
        }
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int zzdv = zzdln.zzdv(i);
        while (true) {
            int i2 = zzdv & this.mask;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzdv = i2 + 1;
        }
    }

    public final int size() {
        return this.size;
    }

    public final zzdmm<E> zzatw() {
        return (zzdmm) zzaua().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzatx() {
        return this.zzhay;
    }

    /* access modifiers changed from: package-private */
    public final int zzatz() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhay, 0, objArr, i, this.size);
        return i + this.size;
    }

    /* access modifiers changed from: package-private */
    public final zzdlr<E> zzaui() {
        return zzdlr.zzb(this.zzhay, this.size);
    }

    public final int hashCode() {
        return this.zzagg;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
