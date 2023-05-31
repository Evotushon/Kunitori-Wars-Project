package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzmu {
    public static final zzmu zzbdl = new zzmu(new zzmr[0]);
    public final int length;
    private int zzagg;
    private final zzmr[] zzbdm;

    public zzmu(zzmr... zzmrArr) {
        this.zzbdm = zzmrArr;
        this.length = zzmrArr.length;
    }

    public final zzmr zzaw(int i) {
        return this.zzbdm[i];
    }

    public final int zza(zzmr zzmr) {
        for (int i = 0; i < this.length; i++) {
            if (this.zzbdm[i] == zzmr) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.zzagg == 0) {
            this.zzagg = Arrays.hashCode(this.zzbdm);
        }
        return this.zzagg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmu zzmu = (zzmu) obj;
            return this.length == zzmu.length && Arrays.equals(this.zzbdm, zzmu.zzbdm);
        }
    }
}
