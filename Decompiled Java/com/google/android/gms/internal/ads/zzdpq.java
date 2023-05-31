package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdpq<P> {
    private final P zzhed;
    private final byte[] zzhee;
    private final zzdug zzhef;
    private final zzduy zzheg;
    private final int zzheh;

    zzdpq(P p, byte[] bArr, zzdug zzdug, zzduy zzduy, int i) {
        this.zzhed = p;
        this.zzhee = Arrays.copyOf(bArr, bArr.length);
        this.zzhef = zzdug;
        this.zzheg = zzduy;
        this.zzheh = i;
    }

    public final P zzavh() {
        return this.zzhed;
    }

    public final zzdug zzavi() {
        return this.zzhef;
    }

    public final zzduy zzavj() {
        return this.zzheg;
    }

    public final byte[] zzavk() {
        byte[] bArr = this.zzhee;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
