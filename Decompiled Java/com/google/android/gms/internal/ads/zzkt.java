package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzkt {
    public final int[] zzane;
    public final long[] zzanf;
    public final int zzavm;
    public final int zzavs;
    public final int[] zzavu;
    public final long[] zzaxs;

    public zzkt(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        zzob.checkArgument(iArr.length == jArr2.length);
        zzob.checkArgument(jArr.length == jArr2.length);
        zzob.checkArgument(iArr2.length != jArr2.length ? false : z);
        this.zzanf = jArr;
        this.zzane = iArr;
        this.zzavs = i;
        this.zzaxs = jArr2;
        this.zzavu = iArr2;
        this.zzavm = jArr.length;
    }

    public final int zzec(long j) {
        for (int zza = zzop.zza(this.zzaxs, j, true, false); zza >= 0; zza--) {
            if ((this.zzavu[zza] & 1) != 0) {
                return zza;
            }
        }
        return -1;
    }

    public final int zzed(long j) {
        for (int zzb = zzop.zzb(this.zzaxs, j, true, false); zzb < this.zzaxs.length; zzb++) {
            if ((this.zzavu[zzb] & 1) != 0) {
                return zzb;
            }
        }
        return -1;
    }
}
