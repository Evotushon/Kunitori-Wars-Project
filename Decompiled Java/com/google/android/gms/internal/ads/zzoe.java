package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzoe {
    private static final byte[] zzbgi = {0, 0, 0, 1};
    private static final int[] zzbgj = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzbgk = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> zze(byte[] bArr) {
        zzoj zzoj = new zzoj(bArr);
        int zza = zza(zzoj);
        int zzb = zzb(zzoj);
        int zzbd = zzoj.zzbd(4);
        if (zza == 5 || zza == 29) {
            zzb = zzb(zzoj);
            if (zza(zzoj) == 22) {
                zzbd = zzoj.zzbd(4);
            }
        }
        int i = zzbgk[zzbd];
        zzob.checkArgument(i != -1);
        return Pair.create(Integer.valueOf(zzb), Integer.valueOf(i));
    }

    public static byte[] zzc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = zzbgi;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, zzbgi.length, i2);
        return bArr3;
    }

    private static int zza(zzoj zzoj) {
        int zzbd = zzoj.zzbd(5);
        return zzbd == 31 ? zzoj.zzbd(6) + 32 : zzbd;
    }

    private static int zzb(zzoj zzoj) {
        int zzbd = zzoj.zzbd(4);
        if (zzbd == 15) {
            return zzoj.zzbd(24);
        }
        zzob.checkArgument(zzbd < 13);
        return zzbgj[zzbd];
    }
}
