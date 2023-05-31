package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxy {
    /* access modifiers changed from: private */
    public final List<String> zzdvj = new ArrayList();
    /* access modifiers changed from: private */
    public final List<Double> zzdvk = new ArrayList();
    /* access modifiers changed from: private */
    public final List<Double> zzdvl = new ArrayList();

    public final zzaxy zza(String str, double d, double d2) {
        int i = 0;
        while (i < this.zzdvj.size()) {
            double doubleValue = this.zzdvl.get(i).doubleValue();
            double doubleValue2 = this.zzdvk.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.zzdvj.add(i, str);
        this.zzdvl.add(i, Double.valueOf(d));
        this.zzdvk.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzaxt zzxf() {
        return new zzaxt(this);
    }
}
