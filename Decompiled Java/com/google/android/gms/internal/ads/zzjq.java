package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzjq {
    public final int zzanr = 1;
    public final byte[] zzans;

    public zzjq(int i, byte[] bArr) {
        this.zzans = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjq zzjq = (zzjq) obj;
            return this.zzanr == zzjq.zzanr && Arrays.equals(this.zzans, zzjq.zzans);
        }
    }

    public final int hashCode() {
        return (this.zzanr * 31) + Arrays.hashCode(this.zzans);
    }
}
