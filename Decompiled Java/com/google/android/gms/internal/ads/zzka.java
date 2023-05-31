package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzka {
    private final zzom zzaod = new zzom(8);
    private int zzard;

    public final boolean zza(zzjf zzjf) throws IOException, InterruptedException {
        zzjf zzjf2 = zzjf;
        long length = zzjf.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        zzjf2.zza(this.zzaod.data, 0, 4);
        this.zzard = 4;
        for (long zziz = this.zzaod.zziz(); zziz != 440786851; zziz = ((zziz << 8) & -256) | ((long) (this.zzaod.data[0] & 255))) {
            int i2 = this.zzard + 1;
            this.zzard = i2;
            if (i2 == i) {
                return false;
            }
            zzjf2.zza(this.zzaod.data, 0, 1);
        }
        long zzc = zzc(zzjf);
        long j2 = (long) this.zzard;
        if (zzc != Long.MIN_VALUE && (length == -1 || j2 + zzc < length)) {
            while (true) {
                int i3 = this.zzard;
                long j3 = j2 + zzc;
                if (((long) i3) < j3) {
                    if (zzc(zzjf) == Long.MIN_VALUE) {
                        return false;
                    }
                    long zzc2 = zzc(zzjf);
                    if (zzc2 < 0 || zzc2 > 2147483647L) {
                        return false;
                    }
                    if (zzc2 != 0) {
                        zzjf2.zzad((int) zzc2);
                        this.zzard = (int) (((long) this.zzard) + zzc2);
                    }
                } else if (((long) i3) == j3) {
                    return true;
                }
            }
        }
        return false;
    }

    private final long zzc(zzjf zzjf) throws IOException, InterruptedException {
        int i = 0;
        zzjf.zza(this.zzaod.data, 0, 1);
        byte b = this.zzaod.data[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        zzjf.zza(this.zzaod.data, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.zzaod.data[i] & 255) + (i4 << 8);
        }
        this.zzard += i3 + 1;
        return (long) i4;
    }
}
