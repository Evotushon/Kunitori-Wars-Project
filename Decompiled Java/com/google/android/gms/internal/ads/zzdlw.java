package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdlw extends zzdlr<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzdlr zzhak;

    zzdlw(zzdlr zzdlr, int i, int i2) {
        this.zzhak = zzdlr;
        this.offset = i;
        this.length = i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaub() {
        return true;
    }

    public final int size() {
        return this.length;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzatx() {
        return this.zzhak.zzatx();
    }

    /* access modifiers changed from: package-private */
    public final int zzaty() {
        return this.zzhak.zzaty() + this.offset;
    }

    /* access modifiers changed from: package-private */
    public final int zzatz() {
        return this.zzhak.zzaty() + this.offset + this.length;
    }

    public final E get(int i) {
        zzdlg.zzs(i, this.length);
        return this.zzhak.get(i + this.offset);
    }

    public final zzdlr<E> zzu(int i, int i2) {
        zzdlg.zzf(i, i2, this.length);
        zzdlr zzdlr = this.zzhak;
        int i3 = this.offset;
        return (zzdlr) zzdlr.subList(i + i3, i2 + i3);
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
