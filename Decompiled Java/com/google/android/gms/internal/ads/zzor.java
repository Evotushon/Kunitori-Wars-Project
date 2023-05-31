package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzor {
    private final int height;
    private final int width;
    public final List<byte[]> zzafp;
    public final int zzara;
    public final float zzbgt;

    public static zzor zzf(zzom zzom) throws zzhc {
        float f;
        int i;
        int i2;
        try {
            zzom.zzbi(4);
            int readUnsignedByte = (zzom.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte != 3) {
                ArrayList arrayList = new ArrayList();
                int readUnsignedByte2 = zzom.readUnsignedByte() & 31;
                for (int i3 = 0; i3 < readUnsignedByte2; i3++) {
                    arrayList.add(zzg(zzom));
                }
                int readUnsignedByte3 = zzom.readUnsignedByte();
                for (int i4 = 0; i4 < readUnsignedByte3; i4++) {
                    arrayList.add(zzg(zzom));
                }
                if (readUnsignedByte2 > 0) {
                    zzok zzd = zzoh.zzd((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                    int i5 = zzd.width;
                    int i6 = zzd.height;
                    f = zzd.zzbgt;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new zzor(arrayList, readUnsignedByte, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhc("Error parsing AVC config", e);
        }
    }

    private zzor(List<byte[]> list, int i, int i2, int i3, float f) {
        this.zzafp = list;
        this.zzara = i;
        this.width = i2;
        this.height = i3;
        this.zzbgt = f;
    }

    private static byte[] zzg(zzom zzom) {
        int readUnsignedShort = zzom.readUnsignedShort();
        int position = zzom.getPosition();
        zzom.zzbi(readUnsignedShort);
        return zzoe.zzc(zzom.data, position, readUnsignedShort);
    }
}
