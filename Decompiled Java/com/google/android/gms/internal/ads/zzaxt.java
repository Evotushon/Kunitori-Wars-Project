package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxt {
    private final String[] zzduy;
    private final double[] zzduz;
    private final double[] zzdva;
    private final int[] zzdvb;
    private int zzdvc;

    private zzaxt(zzaxy zzaxy) {
        int size = zzaxy.zzdvk.size();
        this.zzduy = (String[]) zzaxy.zzdvj.toArray(new String[size]);
        this.zzduz = zzf(zzaxy.zzdvk);
        this.zzdva = zzf(zzaxy.zzdvl);
        this.zzdvb = new int[size];
        this.zzdvc = 0;
    }

    private static double[] zzf(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d) {
        this.zzdvc++;
        int i = 0;
        while (true) {
            double[] dArr = this.zzdva;
            if (i < dArr.length) {
                if (dArr[i] <= d && d < this.zzduz[i]) {
                    int[] iArr = this.zzdvb;
                    iArr[i] = iArr[i] + 1;
                }
                if (d >= this.zzdva[i]) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final List<zzaxv> zzxe() {
        ArrayList arrayList = new ArrayList(this.zzduy.length);
        int i = 0;
        while (true) {
            String[] strArr = this.zzduy;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.zzdva[i];
            double d2 = this.zzduz[i];
            int[] iArr = this.zzdvb;
            double d3 = (double) iArr[i];
            double d4 = (double) this.zzdvc;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzaxv(str, d, d2, d3 / d4, iArr[i]));
            i++;
        }
    }
}
