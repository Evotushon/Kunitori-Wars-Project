package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdmj<E> extends zzdly<E> {
    private final transient E zzhba;
    private transient int zzhbb;

    zzdmj(E e) {
        this.zzhba = zzdlg.checkNotNull(e);
    }

    public final int size() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaub() {
        return false;
    }

    zzdmj(E e, int i) {
        this.zzhba = e;
        this.zzhbb = i;
    }

    public final boolean contains(Object obj) {
        return this.zzhba.equals(obj);
    }

    public final zzdmm<E> zzatw() {
        return new zzdma(this.zzhba);
    }

    /* access modifiers changed from: package-private */
    public final zzdlr<E> zzaui() {
        return zzdlr.zzag(this.zzhba);
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zzhba;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.zzhbb;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zzhba.hashCode();
        this.zzhbb = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzauh() {
        return this.zzhbb != 0;
    }

    public final String toString() {
        String obj = this.zzhba.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
