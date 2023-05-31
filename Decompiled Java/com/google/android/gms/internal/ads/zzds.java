package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzds {
    private static Cipher zzwy;
    private static final Object zzwz = new Object();
    private static final Object zzxa = new Object();
    private final SecureRandom zzwx = null;

    public zzds(SecureRandom secureRandom) {
    }

    public final byte[] zzas(String str) throws zzdv {
        try {
            byte[] zza = zzci.zza(str, false);
            if (zza.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(zza, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new zzdv(this);
        } catch (IllegalArgumentException e) {
            throw new zzdv(this, e);
        }
    }

    public final String zzb(byte[] bArr, byte[] bArr2) throws zzdv {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (zzwz) {
                    getCipher().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = getCipher().doFinal(bArr2);
                    iv = getCipher().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return zzci.zza(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new zzdv(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzdv(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzdv(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzdv(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzdv(this, e5);
            }
        } else {
            throw new zzdv(this);
        }
    }

    public final byte[] zza(byte[] bArr, String str) throws zzdv {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] zza = zzci.zza(str, false);
                if (zza.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(zza.length);
                    allocate.put(zza);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(zza.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (zzwz) {
                        getCipher().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = getCipher().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new zzdv(this);
            } catch (NoSuchAlgorithmException e) {
                throw new zzdv(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzdv(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzdv(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzdv(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzdv(this, e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new zzdv(this, e6);
            } catch (IllegalArgumentException e7) {
                throw new zzdv(this, e7);
            }
        } else {
            throw new zzdv(this);
        }
    }

    private static Cipher getCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzxa) {
            if (zzwy == null) {
                zzwy = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zzwy;
        }
        return cipher;
    }
}
