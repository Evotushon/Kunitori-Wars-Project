package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzox {
    public final List<byte[]> zzafp;
    public final int zzara;

    public static zzox zzh(zzom zzom) throws zzhc {
        List list;
        try {
            zzom.zzbi(21);
            int readUnsignedByte = zzom.readUnsignedByte() & 3;
            int readUnsignedByte2 = zzom.readUnsignedByte();
            int position = zzom.getPosition();
            int i = 0;
            int i2 = 0;
            while (i < readUnsignedByte2) {
                zzom.zzbi(1);
                int readUnsignedShort = zzom.readUnsignedShort();
                int i3 = i2;
                for (int i4 = 0; i4 < readUnsignedShort; i4++) {
                    int readUnsignedShort2 = zzom.readUnsignedShort();
                    i3 += readUnsignedShort2 + 4;
                    zzom.zzbi(readUnsignedShort2);
                }
                i++;
                i2 = i3;
            }
            zzom.zzbh(position);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < readUnsignedByte2) {
                zzom.zzbi(1);
                int readUnsignedShort3 = zzom.readUnsignedShort();
                int i7 = i6;
                for (int i8 = 0; i8 < readUnsignedShort3; i8++) {
                    int readUnsignedShort4 = zzom.readUnsignedShort();
                    System.arraycopy(zzoh.zzbgi, 0, bArr, i7, zzoh.zzbgi.length);
                    int length = i7 + zzoh.zzbgi.length;
                    System.arraycopy(zzom.data, zzom.getPosition(), bArr, length, readUnsignedShort4);
                    i7 = length + readUnsignedShort4;
                    zzom.zzbi(readUnsignedShort4);
                }
                i5++;
                i6 = i7;
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new zzox(list, readUnsignedByte + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhc("Error parsing HEVC config", e);
        }
    }

    private zzox(List<byte[]> list, int i) {
        this.zzafp = list;
        this.zzara = i;
    }
}
