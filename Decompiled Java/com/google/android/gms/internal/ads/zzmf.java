package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzmf implements zzme {
    private final zzhk zzadd = new zzhk();
    private final zzme[] zzbbo;
    private final ArrayList<zzme> zzbbp;
    private zzmd zzbbq;
    private zzhj zzbbr;
    private Object zzbbs;
    private int zzbbt = -1;
    private zzmh zzbbu;

    public zzmf(zzme... zzmeArr) {
        this.zzbbo = zzmeArr;
        this.zzbbp = new ArrayList<>(Arrays.asList(zzmeArr));
    }

    public final void zza(zzgn zzgn, boolean z, zzmd zzmd) {
        this.zzbbq = zzmd;
        int i = 0;
        while (true) {
            zzme[] zzmeArr = this.zzbbo;
            if (i < zzmeArr.length) {
                zzmeArr[i].zza(zzgn, false, new zzmi(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzhw() throws IOException {
        zzmh zzmh = this.zzbbu;
        if (zzmh == null) {
            for (zzme zzhw : this.zzbbo) {
                zzhw.zzhw();
            }
            return;
        }
        throw zzmh;
    }

    public final zzmc zza(int i, zznm zznm) {
        zzmc[] zzmcArr = new zzmc[this.zzbbo.length];
        for (int i2 = 0; i2 < zzmcArr.length; i2++) {
            zzmcArr[i2] = this.zzbbo[i2].zza(i, zznm);
        }
        return new zzmg(zzmcArr);
    }

    public final void zzb(zzmc zzmc) {
        zzmg zzmg = (zzmg) zzmc;
        int i = 0;
        while (true) {
            zzme[] zzmeArr = this.zzbbo;
            if (i < zzmeArr.length) {
                zzmeArr[i].zzb(zzmg.zzbbv[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzhx() {
        for (zzme zzhx : this.zzbbo) {
            zzhx.zzhx();
        }
    }

    /* access modifiers changed from: private */
    public final void zza(int i, zzhj zzhj, Object obj) {
        zzmh zzmh;
        if (this.zzbbu == null) {
            int zzfa = zzhj.zzfa();
            int i2 = 0;
            while (true) {
                if (i2 >= zzfa) {
                    if (this.zzbbt == -1) {
                        this.zzbbt = zzhj.zzfb();
                    } else if (zzhj.zzfb() != this.zzbbt) {
                        zzmh = new zzmh(1);
                    }
                    zzmh = null;
                } else if (zzhj.zza(i2, this.zzadd, false).zzagu) {
                    zzmh = new zzmh(0);
                    break;
                } else {
                    i2++;
                }
            }
            this.zzbbu = zzmh;
        }
        if (this.zzbbu == null) {
            this.zzbbp.remove(this.zzbbo[i]);
            if (i == 0) {
                this.zzbbr = zzhj;
                this.zzbbs = obj;
            }
            if (this.zzbbp.isEmpty()) {
                this.zzbbq.zzb(this.zzbbr, this.zzbbs);
            }
        }
    }
}
