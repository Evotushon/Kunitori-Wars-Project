package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.ads.zzbs;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzck {
    private static boolean zzms = false;
    /* access modifiers changed from: private */
    public static MessageDigest zzmt;
    private static final Object zzmu = new Object();
    private static final Object zzmv = new Object();
    static CountDownLatch zzmw = new CountDownLatch(1);

    static void zzbm() {
        synchronized (zzmv) {
            if (!zzms) {
                zzms = true;
                new Thread(new zzcm()).start();
            }
        }
    }

    private static MessageDigest zzbn() {
        boolean z;
        MessageDigest messageDigest;
        zzbm();
        try {
            z = zzmw.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = zzmt) != null) {
            return messageDigest;
        }
        return null;
    }

    static String zzj(zzbs.zza zza, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] byteArray = zza.toByteArray();
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmd)).booleanValue()) {
            Vector<byte[]> zza2 = zza(byteArray, 255);
            if (zza2 == null || zza2.size() == 0) {
                bArr = zza(zza(zzbs.zza.zzd.PSN_ENCODE_SIZE_FAIL).toByteArray(), str, true);
            } else {
                zzbs.zzf.zza zzbj = zzbs.zzf.zzbj();
                Iterator<byte[]> it = zza2.iterator();
                while (it.hasNext()) {
                    zzbj.zzi(zzdxn.zzt(zza(it.next(), str, false)));
                }
                zzbj.zzj(zzdxn.zzt(zzb(byteArray)));
                bArr = ((zzbs.zzf) ((zzdyz) zzbj.zzbcx())).toByteArray();
            }
        } else if (zzeo.zzyl != null) {
            bArr = ((zzbs.zzf) ((zzdyz) zzbs.zzf.zzbj().zzi(zzdxn.zzt(zzeo.zzyl.zzc(byteArray, str != null ? str.getBytes() : new byte[0]))).zza(zzbz.TINK_HYBRID).zzbcx())).toByteArray();
        } else {
            throw new GeneralSecurityException();
        }
        return zzci.zza(bArr, true);
    }

    private static Vector<byte[]> zza(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static zzbs.zza zza(zzbs.zza.zzd zzd) {
        zzbs.zza.zzb zzao = zzbs.zza.zzao();
        zzao.zzau((long) zzd.zzaf());
        return (zzbs.zza) ((zzdyz) zzao.zzbcx());
    }

    private static byte[] zza(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = zza(zzbs.zza.zzd.PSN_ENCODE_SIZE_FAIL).toByteArray();
        }
        if (bArr.length < i) {
            byte[] bArr3 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(zzb(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        for (zzcr zza : new zzcp().zzup) {
            zza.zza(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzdxe(str.getBytes(Constants.ENCODING)).zzs(bArr4);
        }
        return bArr4;
    }

    public static byte[] zzb(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (zzmu) {
            MessageDigest zzbn = zzbn();
            if (zzbn != null) {
                zzbn.reset();
                zzbn.update(bArr);
                digest = zzmt.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }
}
