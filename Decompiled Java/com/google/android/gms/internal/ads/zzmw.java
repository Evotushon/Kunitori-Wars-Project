package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzmw implements zznd {
    private final int length;
    private int zzagg;
    private final zzgz[] zzbch;
    private final zzmr zzbdn;
    private final int[] zzbdo;
    private final long[] zzbdp;

    public zzmw(zzmr zzmr, int... iArr) {
        int i = 0;
        zzob.checkState(iArr.length > 0);
        this.zzbdn = (zzmr) zzob.checkNotNull(zzmr);
        this.length = iArr.length;
        this.zzbch = new zzgz[this.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzbch[i2] = zzmr.zzav(iArr[i2]);
        }
        Arrays.sort(this.zzbch, new zzmy());
        this.zzbdo = new int[this.length];
        while (true) {
            int i3 = this.length;
            if (i < i3) {
                this.zzbdo[i] = zzmr.zzh(this.zzbch[i]);
                i++;
            } else {
                this.zzbdp = new long[i3];
                return;
            }
        }
    }

    public final zzmr zzii() {
        return this.zzbdn;
    }

    public final int length() {
        return this.zzbdo.length;
    }

    public final zzgz zzav(int i) {
        return this.zzbch[i];
    }

    public final int zzax(int i) {
        return this.zzbdo[0];
    }

    public int hashCode() {
        if (this.zzagg == 0) {
            this.zzagg = (System.identityHashCode(this.zzbdn) * 31) + Arrays.hashCode(this.zzbdo);
        }
        return this.zzagg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmw zzmw = (zzmw) obj;
            return this.zzbdn == zzmw.zzbdn && Arrays.equals(this.zzbdo, zzmw.zzbdo);
        }
    }
}
