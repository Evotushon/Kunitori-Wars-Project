package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzmg implements zzmb, zzmc {
    private zzmu zzadn;
    private zzmb zzbao;
    public final zzmc[] zzbbv;
    private final IdentityHashMap<zzmn, Integer> zzbbw = new IdentityHashMap<>();
    private int zzbbx;
    private zzmc[] zzbby;
    private zzmq zzbbz;

    public zzmg(zzmc... zzmcArr) {
        this.zzbbv = zzmcArr;
    }

    public final void zza(zzmb zzmb, long j) {
        this.zzbao = zzmb;
        zzmc[] zzmcArr = this.zzbbv;
        this.zzbbx = zzmcArr.length;
        for (zzmc zza : zzmcArr) {
            zza.zza(this, j);
        }
    }

    public final void zzhl() throws IOException {
        for (zzmc zzhl : this.zzbbv) {
            zzhl.zzhl();
        }
    }

    public final zzmu zzhm() {
        return this.zzadn;
    }

    public final long zza(zznd[] zzndArr, boolean[] zArr, zzmn[] zzmnArr, boolean[] zArr2, long j) {
        int i;
        zznd[] zzndArr2 = zzndArr;
        zzmn[] zzmnArr2 = zzmnArr;
        int[] iArr = new int[zzndArr2.length];
        int[] iArr2 = new int[zzndArr2.length];
        for (int i2 = 0; i2 < zzndArr2.length; i2++) {
            if (zzmnArr2[i2] == null) {
                i = -1;
            } else {
                i = this.zzbbw.get(zzmnArr2[i2]).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (zzndArr2[i2] != null) {
                zzmr zzii = zzndArr2[i2].zzii();
                int i3 = 0;
                while (true) {
                    zzmc[] zzmcArr = this.zzbbv;
                    if (i3 >= zzmcArr.length) {
                        break;
                    } else if (zzmcArr[i3].zzhm().zza(zzii) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.zzbbw.clear();
        zzmn[] zzmnArr3 = new zzmn[zzndArr2.length];
        zzmn[] zzmnArr4 = new zzmn[zzndArr2.length];
        zznd[] zzndArr3 = new zznd[zzndArr2.length];
        ArrayList arrayList = new ArrayList(this.zzbbv.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.zzbbv.length) {
            for (int i5 = 0; i5 < zzndArr2.length; i5++) {
                zznd zznd = null;
                zzmnArr4[i5] = iArr[i5] == i4 ? zzmnArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zznd = zzndArr2[i5];
                }
                zzndArr3[i5] = zznd;
            }
            ArrayList arrayList2 = arrayList;
            zznd[] zzndArr4 = zzndArr3;
            int i6 = i4;
            long zza = this.zzbbv[i4].zza(zzndArr3, zArr, zzmnArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = zza;
            } else if (zza != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzndArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zzob.checkState(zzmnArr4[i7] != null);
                    zzmnArr3[i7] = zzmnArr4[i7];
                    this.zzbbw.put(zzmnArr4[i7], Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zzmnArr4[i7] != null) {
                        z2 = false;
                    }
                    zzob.checkState(z2);
                }
            }
            if (z) {
                arrayList2.add(this.zzbbv[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzndArr3 = zzndArr4;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzmnArr3, 0, zzmnArr2, 0, zzmnArr3.length);
        this.zzbby = new zzmc[arrayList3.size()];
        arrayList3.toArray(this.zzbby);
        this.zzbbz = new zzlp(this.zzbby);
        return j2;
    }

    public final void zzef(long j) {
        for (zzmc zzef : this.zzbby) {
            zzef.zzef(j);
        }
    }

    public final boolean zzee(long j) {
        return this.zzbbz.zzee(j);
    }

    public final long zzhk() {
        return this.zzbbz.zzhk();
    }

    public final long zzhn() {
        long zzhn = this.zzbbv[0].zzhn();
        int i = 1;
        while (true) {
            zzmc[] zzmcArr = this.zzbbv;
            if (i >= zzmcArr.length) {
                if (zzhn != -9223372036854775807L) {
                    zzmc[] zzmcArr2 = this.zzbby;
                    int length = zzmcArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        zzmc zzmc = zzmcArr2[i2];
                        if (zzmc == this.zzbbv[0] || zzmc.zzeg(zzhn) == zzhn) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzhn;
            } else if (zzmcArr[i].zzhn() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    public final long zzho() {
        long j = Long.MAX_VALUE;
        for (zzmc zzho : this.zzbby) {
            long zzho2 = zzho.zzho();
            if (zzho2 != Long.MIN_VALUE) {
                j = Math.min(j, zzho2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzeg(long j) {
        long zzeg = this.zzbby[0].zzeg(j);
        int i = 1;
        while (true) {
            zzmc[] zzmcArr = this.zzbby;
            if (i >= zzmcArr.length) {
                return zzeg;
            }
            if (zzmcArr[i].zzeg(zzeg) == zzeg) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    public final void zza(zzmc zzmc) {
        int i = this.zzbbx - 1;
        this.zzbbx = i;
        if (i <= 0) {
            int i2 = 0;
            for (zzmc zzhm : this.zzbbv) {
                i2 += zzhm.zzhm().length;
            }
            zzmr[] zzmrArr = new zzmr[i2];
            zzmc[] zzmcArr = this.zzbbv;
            int length = zzmcArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                zzmu zzhm2 = zzmcArr[i3].zzhm();
                int i5 = zzhm2.length;
                int i6 = i4;
                int i7 = 0;
                while (i7 < i5) {
                    zzmrArr[i6] = zzhm2.zzaw(i7);
                    i7++;
                    i6++;
                }
                i3++;
                i4 = i6;
            }
            this.zzadn = new zzmu(zzmrArr);
            this.zzbao.zza(this);
        }
    }

    public final /* synthetic */ void zza(zzmq zzmq) {
        if (this.zzadn != null) {
            this.zzbao.zza(this);
        }
    }
}
