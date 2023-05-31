package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzdzc {
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    public static final byte[] zzhtq;
    private static final ByteBuffer zzhtr;
    private static final zzdxz zzhts;

    public static int zzbr(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzfr(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static <T> T zza(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean zzx(byte[] bArr) {
        return zzece.zzx(bArr);
    }

    public static String zzy(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    static boolean zzk(zzeah zzeah) {
        if (!(zzeah instanceof zzdxf)) {
            return false;
        }
        zzdxf zzdxf = (zzdxf) zzeah;
        return false;
    }

    static Object zzd(Object obj, Object obj2) {
        return ((zzeah) obj).zzbdd().zzf((zzeah) obj2).zzbcw();
    }

    static {
        byte[] bArr = new byte[0];
        zzhtq = bArr;
        zzhtr = ByteBuffer.wrap(bArr);
        byte[] bArr2 = zzhtq;
        zzhts = zzdxz.zzb(bArr2, 0, bArr2.length, false);
    }
}
