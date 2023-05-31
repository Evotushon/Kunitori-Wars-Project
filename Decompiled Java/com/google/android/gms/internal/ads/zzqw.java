package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzqw extends zzqp {
    private MessageDigest zzbqv;

    public final byte[] zzbw(String str) {
        byte[] bArr;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int zzby = zzqt.zzby(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zzby);
            bArr = allocate.array();
        } else if (split.length < 5) {
            bArr = new byte[(split.length << 1)];
            for (int i2 = 0; i2 < split.length; i2++) {
                int zzby2 = zzqt.zzby(split[i2]);
                int i3 = (zzby2 >> 16) ^ (65535 & zzby2);
                byte[] bArr2 = {(byte) i3, (byte) (i3 >> 8)};
                int i4 = i2 << 1;
                bArr[i4] = bArr2[0];
                bArr[i4 + 1] = bArr2[1];
            }
        } else {
            bArr = new byte[split.length];
            for (int i5 = 0; i5 < split.length; i5++) {
                int zzby3 = zzqt.zzby(split[i5]);
                bArr[i5] = (byte) ((zzby3 >> 24) ^ (((zzby3 & 255) ^ ((zzby3 >> 8) & 255)) ^ ((zzby3 >> 16) & 255)));
            }
        }
        this.zzbqv = zzml();
        synchronized (this.mLock) {
            if (this.zzbqv == null) {
                byte[] bArr3 = new byte[0];
                return bArr3;
            }
            this.zzbqv.reset();
            this.zzbqv.update(bArr);
            byte[] digest = this.zzbqv.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, bArr4.length);
            return bArr4;
        }
    }
}
