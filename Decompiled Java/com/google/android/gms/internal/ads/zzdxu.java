package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdxu extends zzdxx {
    private final int zzhoi;
    private final int zzhoj;

    zzdxu(byte[] bArr, int i, int i2) {
        super(bArr);
        zzi(i, i + i2, bArr.length);
        this.zzhoi = i;
        this.zzhoj = i2;
    }

    public final byte zzfe(int i) {
        zzaa(i, size());
        return this.zzhol[this.zzhoi + i];
    }

    /* access modifiers changed from: package-private */
    public final byte zzff(int i) {
        return this.zzhol[this.zzhoi + i];
    }

    public final int size() {
        return this.zzhoj;
    }

    /* access modifiers changed from: protected */
    public final int zzbay() {
        return this.zzhoi;
    }

    /* access modifiers changed from: protected */
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzhol, zzbay() + i, bArr, i2, i3);
    }
}
