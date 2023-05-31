package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzje implements zzjl {
    private final int length;
    private final long zzagy;
    private final int[] zzane;
    private final long[] zzanf;
    private final long[] zzang;
    private final long[] zzanh;

    public zzje(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzane = iArr;
        this.zzanf = jArr;
        this.zzang = jArr2;
        this.zzanh = jArr3;
        this.length = iArr.length;
        int i = this.length;
        if (i > 0) {
            this.zzagy = jArr2[i - 1] + jArr3[i - 1];
        } else {
            this.zzagy = 0;
        }
    }

    public final boolean zzgn() {
        return true;
    }

    public final long getDurationUs() {
        return this.zzagy;
    }

    public final long zzdz(long j) {
        return this.zzanf[zzop.zza(this.zzanh, j, true, true)];
    }
}
