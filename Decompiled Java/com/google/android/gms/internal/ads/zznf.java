package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zznf {
    public final int length;
    private int zzagg;
    private final zznd[] zzbel;

    public zznf(zznd... zzndArr) {
        this.zzbel = zzndArr;
        this.length = zzndArr.length;
    }

    public final zznd zzay(int i) {
        return this.zzbel[i];
    }

    public final zznd[] zzij() {
        return (zznd[]) this.zzbel.clone();
    }

    public final int hashCode() {
        if (this.zzagg == 0) {
            this.zzagg = Arrays.hashCode(this.zzbel) + 527;
        }
        return this.zzagg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzbel, ((zznf) obj).zzbel);
    }
}
