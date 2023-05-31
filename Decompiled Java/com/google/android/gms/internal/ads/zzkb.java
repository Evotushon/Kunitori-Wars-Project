package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzkb extends zzkc {
    public final long zzare;
    public final List<zzke> zzarf = new ArrayList();
    public final List<zzkb> zzarg = new ArrayList();

    public zzkb(int i, long j) {
        super(i);
        this.zzare = j;
    }

    public final zzke zzal(int i) {
        int size = this.zzarf.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzke zzke = this.zzarf.get(i2);
            if (zzke.type == i) {
                return zzke;
            }
        }
        return null;
    }

    public final zzkb zzam(int i) {
        int size = this.zzarg.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzkb zzkb = this.zzarg.get(i2);
            if (zzkb.type == i) {
                return zzkb;
            }
        }
        return null;
    }

    public final String toString() {
        String zzap = zzap(this.type);
        String arrays = Arrays.toString(this.zzarf.toArray());
        String arrays2 = Arrays.toString(this.zzarg.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(zzap).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(zzap);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
