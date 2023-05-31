package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzeby {
    private static final zzeby zzhxl = new zzeby(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzhnt;
    private int zzhsx;
    private Object[] zzhvg;
    private int[] zzhxm;

    public static zzeby zzbff() {
        return zzhxl;
    }

    static zzeby zzbfg() {
        return new zzeby();
    }

    static zzeby zza(zzeby zzeby, zzeby zzeby2) {
        int i = zzeby.count + zzeby2.count;
        int[] copyOf = Arrays.copyOf(zzeby.zzhxm, i);
        System.arraycopy(zzeby2.zzhxm, 0, copyOf, zzeby.count, zzeby2.count);
        Object[] copyOf2 = Arrays.copyOf(zzeby.zzhvg, i);
        System.arraycopy(zzeby2.zzhvg, 0, copyOf2, zzeby.count, zzeby2.count);
        return new zzeby(i, copyOf, copyOf2, true);
    }

    private zzeby() {
        this(0, new int[8], new Object[8], true);
    }

    private zzeby(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzhsx = -1;
        this.count = i;
        this.zzhxm = iArr;
        this.zzhvg = objArr;
        this.zzhnt = z;
    }

    public final void zzban() {
        this.zzhnt = false;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzecs zzecs) throws IOException {
        if (zzecs.zzbcf() == zzdyz.zzf.zzhto) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzecs.zzc(this.zzhxm[i] >>> 3, this.zzhvg[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzecs.zzc(this.zzhxm[i2] >>> 3, this.zzhvg[i2]);
        }
    }

    public final void zzb(zzecs zzecs) throws IOException {
        if (this.count != 0) {
            if (zzecs.zzbcf() == zzdyz.zzf.zzhtn) {
                for (int i = 0; i < this.count; i++) {
                    zzb(this.zzhxm[i], this.zzhvg[i], zzecs);
                }
                return;
            }
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                zzb(this.zzhxm[i2], this.zzhvg[i2], zzecs);
            }
        }
    }

    private static void zzb(int i, Object obj, zzecs zzecs) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzecs.zzp(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzecs.zzj(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzecs.zza(i2, (zzdxn) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzecs.zzaf(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzdzh.zzbdn());
        } else if (zzecs.zzbcf() == zzdyz.zzf.zzhtn) {
            zzecs.zzgi(i2);
            ((zzeby) obj).zzb(zzecs);
            zzecs.zzgj(i2);
        } else {
            zzecs.zzgj(i2);
            ((zzeby) obj).zzb(zzecs);
            zzecs.zzgi(i2);
        }
    }

    public final int zzbfh() {
        int i = this.zzhsx;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzdyi.zzd(this.zzhxm[i3] >>> 3, (zzdxn) this.zzhvg[i3]);
        }
        this.zzhsx = i2;
        return i2;
    }

    public final int zzbda() {
        int i;
        int i2 = this.zzhsx;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            int i5 = this.zzhxm[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzdyi.zzl(i6, ((Long) this.zzhvg[i4]).longValue());
            } else if (i7 == 1) {
                i = zzdyi.zzn(i6, ((Long) this.zzhvg[i4]).longValue());
            } else if (i7 == 2) {
                i = zzdyi.zzc(i6, (zzdxn) this.zzhvg[i4]);
            } else if (i7 == 3) {
                i = (zzdyi.zzfz(i6) << 1) + ((zzeby) this.zzhvg[i4]).zzbda();
            } else if (i7 == 5) {
                i = zzdyi.zzaj(i6, ((Integer) this.zzhvg[i4]).intValue());
            } else {
                throw new IllegalStateException(zzdzh.zzbdn());
            }
            i3 += i;
        }
        this.zzhsx = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzeby)) {
            return false;
        }
        zzeby zzeby = (zzeby) obj;
        int i = this.count;
        if (i == zzeby.count) {
            int[] iArr = this.zzhxm;
            int[] iArr2 = zzeby.zzhxm;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.zzhvg;
                Object[] objArr2 = zzeby.zzhvg;
                int i3 = this.count;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzhxm;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzhvg;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzeam.zza(sb, i, String.valueOf(this.zzhxm[i2] >>> 3), this.zzhvg[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzd(int i, Object obj) {
        if (this.zzhnt) {
            int i2 = this.count;
            if (i2 == this.zzhxm.length) {
                int i3 = this.count + (i2 < 4 ? 8 : i2 >> 1);
                this.zzhxm = Arrays.copyOf(this.zzhxm, i3);
                this.zzhvg = Arrays.copyOf(this.zzhvg, i3);
            }
            int[] iArr = this.zzhxm;
            int i4 = this.count;
            iArr[i4] = i;
            this.zzhvg[i4] = obj;
            this.count = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
