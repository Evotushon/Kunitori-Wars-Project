package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdvh implements zzdwp {
    private static final ThreadLocal<Cipher> zzhlf = new zzdvg();
    private final SecretKeySpec zzhlg;
    private final int zzhlh;
    private final int zzhli = zzhlf.get().getBlockSize();

    public zzdvh(byte[] bArr, int i) throws GeneralSecurityException {
        zzdwv.zzez(bArr.length);
        this.zzhlg = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.zzhli) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzhlh = i;
    }

    public final byte[] zzn(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzhlh;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] zzey = zzdwq.zzey(i);
            System.arraycopy(zzey, 0, bArr2, 0, this.zzhlh);
            int length2 = bArr.length;
            int i2 = this.zzhlh;
            Cipher cipher = zzhlf.get();
            byte[] bArr3 = new byte[this.zzhli];
            System.arraycopy(zzey, 0, bArr3, 0, this.zzhlh);
            cipher.init(1, this.zzhlg, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i3 = Integer.MAX_VALUE - i;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i3);
        throw new GeneralSecurityException(sb.toString());
    }
}
