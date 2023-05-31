package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdrn implements zzdpf {
    private final zzdpr<zzdpf> zzhfw;

    public zzdrn(zzdpr<zzdpf> zzdpr) {
        this.zzhfw = zzdpr;
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzdvp.zza(this.zzhfw.zzavl().zzavk(), this.zzhfw.zzavl().zzavh().zzc(bArr, bArr2));
    }
}
