package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzhn {
    private static final int[] zzahf = {1, 2, 3, 6};
    private static final int[] zzahg = {48000, 44100, 32000};
    private static final int[] zzahh = {24000, 22050, 16000};
    private static final int[] zzahi = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzahj = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzahk = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzgz zza(zzom zzom, String str, String str2, zziu zziu) {
        int i = zzahg[(zzom.readUnsignedByte() & 192) >> 6];
        int readUnsignedByte = zzom.readUnsignedByte();
        int i2 = zzahi[(readUnsignedByte & 56) >> 3];
        if ((readUnsignedByte & 4) != 0) {
            i2++;
        }
        return zzgz.zza(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, (zziu) null, 0, str2);
    }

    public static int zzfd() {
        return 1536;
    }

    public static zzgz zzb(zzom zzom, String str, String str2, zziu zziu) {
        zzom.zzbi(2);
        int i = zzahg[(zzom.readUnsignedByte() & 192) >> 6];
        int readUnsignedByte = zzom.readUnsignedByte();
        int i2 = zzahi[(readUnsignedByte & 14) >> 1];
        if ((readUnsignedByte & 1) != 0) {
            i2++;
        }
        return zzgz.zza(str, "audio/eac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, (zziu) null, 0, str2);
    }

    public static int zzh(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = zzahf[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }
}
