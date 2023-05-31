package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdmb<E> extends zzdlr<E> {
    static final zzdlr<Object> zzhap = new zzdmb(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzhaq;

    zzdmb(Object[] objArr, int i) {
        this.zzhaq = objArr;
        this.size = i;
    }

    /* access modifiers changed from: package-private */
    public final int zzaty() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaub() {
        return false;
    }

    public final int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzatx() {
        return this.zzhaq;
    }

    /* access modifiers changed from: package-private */
    public final int zzatz() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhaq, 0, objArr, i, this.size);
        return i + this.size;
    }

    public final E get(int i) {
        zzdlg.zzs(i, this.size);
        return this.zzhaq[i];
    }
}
