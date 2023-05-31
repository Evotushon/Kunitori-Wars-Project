package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdvw {
    private ECPublicKey zzhma;

    public zzdvw(ECPublicKey eCPublicKey) {
        this.zzhma = eCPublicKey;
    }

    public final zzdvz zza(String str, byte[] bArr, byte[] bArr2, int i, zzdwd zzdwd) throws GeneralSecurityException {
        byte[] bArr3;
        KeyPair zza = zzdvy.zza(this.zzhma.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) zza.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zza.getPrivate();
        ECPublicKey eCPublicKey2 = this.zzhma;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            int i2 = 1;
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                byte[] zza2 = zzdvy.zza(eCPrivateKey, eCPublicKey2.getW());
                EllipticCurve curve = eCPublicKey.getParams().getCurve();
                ECPoint w = eCPublicKey.getW();
                zzdvy.zza(w, curve);
                int bitLength = (zzdvy.zza(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                int i3 = zzdwb.zzhmh[zzdwd.ordinal()];
                if (i3 == 1) {
                    int i4 = (bitLength * 2) + 1;
                    bArr3 = new byte[i4];
                    byte[] byteArray = w.getAffineX().toByteArray();
                    byte[] byteArray2 = w.getAffineY().toByteArray();
                    System.arraycopy(byteArray2, 0, bArr3, i4 - byteArray2.length, byteArray2.length);
                    System.arraycopy(byteArray, 0, bArr3, (bitLength + 1) - byteArray.length, byteArray.length);
                    bArr3[0] = 4;
                } else if (i3 != 2) {
                    int i5 = 3;
                    if (i3 == 3) {
                        int i6 = bitLength + 1;
                        byte[] bArr4 = new byte[i6];
                        byte[] byteArray3 = w.getAffineX().toByteArray();
                        System.arraycopy(byteArray3, 0, bArr4, i6 - byteArray3.length, byteArray3.length);
                        if (!w.getAffineY().testBit(0)) {
                            i5 = 2;
                        }
                        bArr4[0] = (byte) i5;
                        bArr3 = bArr4;
                    } else {
                        String valueOf = String.valueOf(zzdwd);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                        sb.append("invalid format:");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                } else {
                    int i7 = bitLength * 2;
                    bArr3 = new byte[i7];
                    byte[] byteArray4 = w.getAffineX().toByteArray();
                    if (byteArray4.length > bitLength) {
                        byteArray4 = Arrays.copyOfRange(byteArray4, byteArray4.length - bitLength, byteArray4.length);
                    }
                    byte[] byteArray5 = w.getAffineY().toByteArray();
                    if (byteArray5.length > bitLength) {
                        byteArray5 = Arrays.copyOfRange(byteArray5, byteArray5.length - bitLength, byteArray5.length);
                    }
                    System.arraycopy(byteArray5, 0, bArr3, i7 - byteArray5.length, byteArray5.length);
                    System.arraycopy(byteArray4, 0, bArr3, bitLength - byteArray4.length, byteArray4.length);
                }
                byte[] zza3 = zzdvp.zza(bArr3, zza2);
                Mac zzhg = zzdwf.zzhms.zzhg(str);
                if (i <= zzhg.getMacLength() * 255) {
                    if (bArr == null || bArr.length == 0) {
                        zzhg.init(new SecretKeySpec(new byte[zzhg.getMacLength()], str));
                    } else {
                        zzhg.init(new SecretKeySpec(bArr, str));
                    }
                    byte[] doFinal = zzhg.doFinal(zza3);
                    byte[] bArr5 = new byte[i];
                    zzhg.init(new SecretKeySpec(doFinal, str));
                    byte[] bArr6 = new byte[0];
                    int i8 = 0;
                    while (true) {
                        zzhg.update(bArr6);
                        zzhg.update(bArr2);
                        zzhg.update((byte) i2);
                        bArr6 = zzhg.doFinal();
                        if (bArr6.length + i8 < i) {
                            System.arraycopy(bArr6, 0, bArr5, i8, bArr6.length);
                            i8 += bArr6.length;
                            i2++;
                        } else {
                            System.arraycopy(bArr6, 0, bArr5, i8, i - i8);
                            return new zzdvz(bArr3, bArr5);
                        }
                    }
                } else {
                    throw new GeneralSecurityException("size too large");
                }
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e.toString());
        }
    }
}
