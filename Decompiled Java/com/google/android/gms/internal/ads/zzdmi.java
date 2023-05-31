package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdmi extends zzdlr<Object> {
    private final transient int offset;
    private final transient int size;
    private final transient Object[] zzhas;

    zzdmi(Object[] objArr, int i, int i2) {
        this.zzhas = objArr;
        this.offset = i;
        this.size = i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaub() {
        return true;
    }

    public final Object get(int i) {
        zzdlg.zzs(i, this.size);
        return this.zzhas[(i * 2) + this.offset];
    }

    public final int size() {
        return this.size;
    }
}
