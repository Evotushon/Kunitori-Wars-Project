package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdwc implements zzdoy {
    private final zzdwp zzhmj;
    private final zzdpp zzhmk;
    private final int zzhml;

    public zzdwc(zzdwp zzdwp, zzdpp zzdpp, int i) {
        this.zzhmj = zzdwp;
        this.zzhmk = zzdpp;
        this.zzhml = i;
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzn = this.zzhmj.zzn(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return zzdvp.zza(zzn, this.zzhmk.zzl(zzdvp.zza(bArr2, zzn, copyOf)));
    }
}
