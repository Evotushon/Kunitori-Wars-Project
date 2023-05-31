package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzmr {
    public final int length;
    private int zzagg;
    private final zzgz[] zzbch;

    public zzmr(zzgz... zzgzArr) {
        zzob.checkState(zzgzArr.length > 0);
        this.zzbch = zzgzArr;
        this.length = zzgzArr.length;
    }

    public final zzgz zzav(int i) {
        return this.zzbch[i];
    }

    public final int zzh(zzgz zzgz) {
        int i = 0;
        while (true) {
            zzgz[] zzgzArr = this.zzbch;
            if (i >= zzgzArr.length) {
                return -1;
            }
            if (zzgz == zzgzArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.zzagg == 0) {
            this.zzagg = Arrays.hashCode(this.zzbch) + 527;
        }
        return this.zzagg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmr zzmr = (zzmr) obj;
            return this.length == zzmr.length && Arrays.equals(this.zzbch, zzmr.zzbch);
        }
    }
}
