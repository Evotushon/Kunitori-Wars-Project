package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdvf implements zzdpp {
    private final SecretKey zzhlb;
    private final int zzhlc;
    private byte[] zzhld;
    private byte[] zzhle;

    private static Cipher zzazz() throws GeneralSecurityException {
        return zzdwf.zzhmr.zzhg("AES/ECB/NoPadding");
    }

    public zzdvf(byte[] bArr, int i) throws GeneralSecurityException {
        zzdwv.zzez(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        } else if (i <= 16) {
            this.zzhlb = new SecretKeySpec(bArr, "AES");
            this.zzhlc = i;
            Cipher zzazz = zzazz();
            zzazz.init(1, this.zzhlb);
            this.zzhld = zzdvm.zzp(zzazz.doFinal(new byte[16]));
            this.zzhle = zzdvm.zzp(this.zzhld);
        } else {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
    }

    public final byte[] zzl(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        Cipher zzazz = zzazz();
        zzazz.init(1, this.zzhlb);
        double length = (double) bArr.length;
        Double.isNaN(length);
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if ((max << 4) == bArr.length) {
            bArr2 = zzdvp.zza(bArr, (max - 1) << 4, this.zzhld, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length < 16) {
                byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                bArr2 = zzdvp.zzd(copyOf, this.zzhle);
            } else {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
        }
        byte[] bArr3 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr3 = zzazz.doFinal(zzdvp.zza(bArr3, 0, bArr, i << 4, 16));
        }
        byte[] zzd = zzdvp.zzd(bArr2, bArr3);
        byte[] bArr4 = new byte[this.zzhlc];
        System.arraycopy(zzazz.doFinal(zzd), 0, bArr4, 0, this.zzhlc);
        return bArr4;
    }
}
