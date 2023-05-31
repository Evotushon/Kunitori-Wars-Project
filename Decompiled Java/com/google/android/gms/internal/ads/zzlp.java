package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzlp implements zzmq {
    private final zzmq[] zzbaa;

    public zzlp(zzmq[] zzmqArr) {
        this.zzbaa = zzmqArr;
    }

    public final long zzhk() {
        long j = Long.MAX_VALUE;
        for (zzmq zzhk : this.zzbaa) {
            long zzhk2 = zzhk.zzhk();
            if (zzhk2 != Long.MIN_VALUE) {
                j = Math.min(j, zzhk2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean zzee(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zzhk = zzhk();
            if (zzhk == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzmq zzmq : this.zzbaa) {
                if (zzmq.zzhk() == zzhk) {
                    z |= zzmq.zzee(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
